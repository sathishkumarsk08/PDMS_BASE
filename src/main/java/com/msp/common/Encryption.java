package com.msp.common;

import com.msp.dao.AuthenticationMosipDAO;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.*;
import javax.xml.bind.DatatypeConverter;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

@RestController
@Component
public class Encryption {

    private static final char[] TEMP_P12_PWD = "qwerty@123".toCharArray();

    private static BouncyCastleProvider bouncyCastleProvider;
    private static final String SYM_ALGORITHM = "AES";
    private static final int SYM_ALGORITHM_LENGTH = 256;
    //    @Autowired
//    CryptoCore cryptoCore = new CryptoCore();
    AuthenticationMosipDAO mosipDAO= new AuthenticationMosipDAO();
    static {
        bouncyCastleProvider = addProvider();
    }

    public SecretKey genSecKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGen;
        SecretKey secretKey = null;
        keyGen = KeyGenerator.getInstance(Encryption.SYM_ALGORITHM);
        keyGen.init(Encryption.SYM_ALGORITHM_LENGTH, new SecureRandom());
        secretKey = keyGen.generateKey();

        return secretKey;

    }
//, bouncyCastleProvider
    public byte[] symmetricEncrypt(byte[] data, SecretKey secretKey)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        return mosipDAO.symmetricEncrypt(secretKey,data,null);
    }

    private static BouncyCastleProvider addProvider() {
        BouncyCastleProvider bouncyCastleProvider = new BouncyCastleProvider();
        Security.addProvider(bouncyCastleProvider);
        return bouncyCastleProvider;
    }

    public PublicKey getPartnerPublicKey1() throws FileNotFoundException, NoSuchAlgorithmException, InvalidKeySpecException {

            byte[] key1 = Base64.getDecoder().decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwJ6IspDRA44UgAmyDIcV6jCEyZu4M3YZ/EDhejpAbACCJyBwA5PDBEwdbsRnqqQ2HVpKfd1r0n0kJmVsnJ6nceaEGQzay6KJLWhzQjvK0gIKO9b7v3bN8MMaUyGBwbMs9cNApVuMxoQ1+JZknPj4nbuK8pwdkjjsxHfb54x0P4wIDAQAB");
            KeyFactory factory = KeyFactory.getInstance("RSA");
            PublicKey publicKey = factory.generatePublic(new X509EncodedKeySpec(key1));
        return publicKey;

    }

    public PublicKey getPartnerPublicKey() throws UnrecoverableEntryException, NoSuchAlgorithmException, KeyStoreException, IOException, CertificateException {
        String filePath = new FileSystemResource("").getFile().getAbsolutePath()+ "/Certificate/ida-partner.cer";
        Path path = Paths.get(filePath);
        String certificateData = Files.readString(path);
        StringReader strReader = new StringReader(certificateData);
        PemReader pemReader = new PemReader(strReader);
        PemObject pemObject = pemReader.readPemObject();
        byte[] certBytes = pemObject.getContent();
        CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
        X509Certificate certificate = (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(certBytes));
        PublicKey pk = certificate.getPublicKey();
        return pk;
    }

    public byte[] asymmetricEncrypt(byte[] data, PublicKey publicKey) throws NoSuchAlgorithmException,
            NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        return mosipDAO.asymmetricEncrypt(publicKey, data);
    }


    public static String digestAsPlainText(byte[] data) {
        return DatatypeConverter.printHexBinary(data).toUpperCase();
    }

    public static byte[] generateHash(byte[] bytes) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        return messageDigest.digest(bytes);
    }

    public static String formatToISOString(LocalDateTime localDateTime) {
        return localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
    }

    public static String formatToISOString1(LocalDateTime localDateTime) {
        return localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    }

    public static LocalDateTime getUTCCurrentDateTime() {
        return ZonedDateTime.now(ZoneOffset.UTC).toLocalDateTime();
    }

    public static LocalDateTime getPSTCurrentDateTime() {
        return ZonedDateTime.now(ZoneId.of("Asia/Manila")).toLocalDateTime();
    }
}
