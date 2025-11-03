package com.msp.dao;

import javax.annotation.PostConstruct;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Arrays;
import java.util.Base64;

public class AuthenticationMosipDAO {
    private SecureRandom secureRandom;
    private String symmetricAlgorithm = "AES/GCM/PKCS5Padding";
    private String asymmetricAlgorithm = "RSA/ECB/OAEPWITHSHA-256ANDMGF1PADDING";
    private int tagLength = 128;

    @PostConstruct
    public void init() {
        this.secureRandom = new SecureRandom();
    }

    public byte[]

    symmetricEncrypt(SecretKey key, byte[] data, byte[] aad) {
        Cipher cipher = null;
        byte[] output = null;
        try {
            cipher = Cipher.getInstance(this.symmetricAlgorithm);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException var12) {
            var12.printStackTrace();
        }

        byte[] randomIV = this.generateIV(cipher.getBlockSize());

        try {
            SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");
            GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(this.tagLength, randomIV);
            cipher.init(1, keySpec, gcmParameterSpec);
            output = new byte[cipher.getOutputSize(data.length) + cipher.getBlockSize()];
            if (aad != null && aad.length != 0) {
                cipher.updateAAD(aad);
            }

            byte[] processData = this.doFinal(data, cipher);
            System.arraycopy(processData, 0, output, 0, processData.length);
            System.arraycopy(randomIV, 0, output, processData.length, randomIV.length);

        } catch (InvalidKeyException var10) {
            var10.printStackTrace();
        } catch (InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException var11) {
            var11.printStackTrace();
        }
        return output;
    }

    public byte[] symmetricEncrypt(SecretKey key, byte[] data, byte[] iv, byte[] aad) throws IllegalBlockSizeException, BadPaddingException {
        if (iv == null) {
            return this.symmetricEncrypt(key, data, aad);
        } else {
            Cipher cipher = null;
            try {
                cipher = Cipher.getInstance(this.symmetricAlgorithm);
            } catch (NoSuchPaddingException | NoSuchAlgorithmException var10) {
                var10.printStackTrace();
            }

            try {
                SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");
                GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(this.tagLength, iv);
                cipher.init(1, keySpec, gcmParameterSpec);
                if (aad != null && aad.length != 0) {
                    cipher.updateAAD(aad);
                }


            } catch (InvalidKeyException var8) {
                var8.printStackTrace();
            } catch (InvalidAlgorithmParameterException var9) {
                var9.printStackTrace();
            }
            return this.doFinal(data, cipher);
        }
    }

    public byte[] asymmetricEncrypt(PublicKey key, byte[] data) throws IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance(this.asymmetricAlgorithm);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException var8) {
            var8.printStackTrace();
        }
        OAEPParameterSpec oaepParams = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
        try {
            cipher.init(1, key, oaepParams);
        } catch (InvalidKeyException var6) {
            var6.printStackTrace();
        } catch (InvalidAlgorithmParameterException var7) {
            var7.printStackTrace();
        }
        return this.doFinal(data, cipher);
    }

    public static byte[][] GenerateKeyAndIV(int keyLength, int ivLength, int iterations, byte[] salt, byte[] password, MessageDigest md) {

        int digestLength = md.getDigestLength();
        int requiredLength = (keyLength + ivLength + digestLength - 1) / digestLength * digestLength;
        byte[] generatedData = new byte[requiredLength];
        int generatedLength = 0;

        try {
            md.reset();

            // Repeat process until sufficient data has been generated
            while (generatedLength < keyLength + ivLength) {

                // Digest data (last digest if available, password data, salt if available)
                if (generatedLength > 0)
                    md.update(generatedData, generatedLength - digestLength, digestLength);
                md.update(password);
                if (salt != null)
                    md.update(salt, 0, 8);
                md.digest(generatedData, generatedLength, digestLength);

                // additional rounds
                for (int i = 1; i < iterations; i++) {
                    md.update(generatedData, generatedLength, digestLength);
                    md.digest(generatedData, generatedLength, digestLength);
                }

                generatedLength += digestLength;
            }

            // Copy key and IV into separate byte arrays
            byte[][] result = new byte[2][];
            result[0] = Arrays.copyOfRange(generatedData, 0, keyLength);
            if (ivLength > 0)
                result[1] = Arrays.copyOfRange(generatedData, keyLength, keyLength + ivLength);

            return result;

        } catch (DigestException e) {
            throw new RuntimeException(e);

        } finally {
            // Clean out temporary data
            Arrays.fill(generatedData, (byte) 0);
        }
    }
    public String encrypt(String strToEncrypt) {
        try {
            String SECRET_KEY = "MSP IDA ENCRYPTED KEY @123456789";
            String defValue = "AAAAAAAAAAAAAAAA";

            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2");


            KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), defValue.getBytes(), 65536, 256);

            SecretKey tmp = factory.generateSecret(spec);


            SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");

            IvParameterSpec ivspec = new IvParameterSpec(defValue.getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    public String symmetricDecrypt(String data) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidKeySpecException {

        String secret = "MSP IDA ENCRYPTED KEY @123456789";




        String cipherText =data;
        byte[] cipherData = Base64.getDecoder().decode(cipherText);
        byte[] saltData = Arrays.copyOfRange(cipherData, 8, 16);

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        final byte[][] keyAndIV = GenerateKeyAndIV(32, 16, 1, saltData, secret.getBytes(StandardCharsets.UTF_8), md5);
        SecretKeySpec key = new SecretKeySpec(keyAndIV[0], "AES");
        IvParameterSpec iv = new IvParameterSpec(keyAndIV[1]);

        byte[] encrypted = Arrays.copyOfRange(cipherData, 16, cipherData.length);
        Cipher aesCBC = Cipher.getInstance("AES/CBC/PKCS5Padding");
        aesCBC.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] decryptedData = aesCBC.doFinal(encrypted);
        String decryptedText = new String(decryptedData, StandardCharsets.UTF_8);
        System.out.println("decryptedText :"+decryptedText);
        return decryptedText;
    }

    private byte[] generateIV(int blockSize) {
        byte[] byteIV = new byte[blockSize];
        return byteIV;
    }

    private byte[] doFinal(byte[] data, Cipher cipher) throws IllegalBlockSizeException, BadPaddingException {
        return cipher.doFinal(data);
    }
}