package com.msp.controller;

import com.msp.common.APIConnection;
import com.msp.common.ResponseCodes;
import com.msp.dao.EncryptionKeyDAO;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

@RestController


public class GenerateKeyPairController {
    public static final String BEGIN_CERT = "-----BEGIN CERTIFICATE-----";
    public static final String END_CERT = "-----END CERTIFICATE-----";
    public final static String LINE_SEPARATOR = System.getProperty("line.separator");

    @Autowired
    AdminApprovalController adminApprovalController;
    static EncryptionKeyDAO keyDAO= new EncryptionKeyDAO();

    private static final Logger LOGGER = LoggerFactory.getLogger(RPController.class);
    public static final String KEY_ALGORITHM = "RSA";
    private static final int KEY_LENGTH = 2048;
    public static final String PUBLIC_KEY = "PublicKey";
    public static final String PRIVATE_KEY = "PrivateKey";
    private static final String key = "aesEncryptionKey";
    private static final String initVector = "encryptionIntVec";
    private static SecretKey secretKey;
    private static String SHARED_KEY = "MSP IDA ENCRYPTED KEY @123456789";

    @RequestMapping("/tspGenerateKey")
    public String requestingAPIKey(@RequestBody String request) throws Exception {
        String tspResponse="";
       String value=  request.replaceAll("^\"|\"$", "");
        adminApprovalController. turnOffSslChecking();
        APIConnection.authenticate();
        ResourceBundle bundle = APIConnection.readConfig();
        String apiRequest= APIConnection.connectApi(bundle.getString("base.url")+bundle.getString("version")+bundle.getString("partnermanager.partner.url")+
              "/"+ value+"/apikey/request","GET","","Cookie");
        if(apiRequest != null) {
            JSONObject jsonObject = new JSONObject(apiRequest);
            JSONArray responseApi = jsonObject.getJSONArray("response");
            JSONObject response = responseApi.getJSONObject(0);
            String apiKey = response.getString("apiKeyReqID");
            String publicKeyPK= getPartnerPublicKey();
//             String publicKeyPK = pk.toString();
            JSONObject tspRequest = new JSONObject();
            tspRequest.put("publicKey", publicKeyPK);
            tspRequest.put("apiKey", apiKey);
            tspRequest.put("partnerId", value);
             tspResponse = idAuthRequest(tspRequest.toString());
            System.out.println("responseData:" + tspResponse);
        }else{
            tspResponse=reaponseJson();
        }

//        String tspRequest= APIConnection.connectApi(bundle.getString("tsp.url")+bundle.getString("version")+bundle.getString("partnermanager.partner.url")+
//                "/"+ value+"/"+apiKey+"/"+pk+"","GET","","Cookie");


//        String licenseRequest= APIConnection.connectApi(bundle.getString("base.url")+
//                "/partnermanagement/v1/misps/"+ value+"/licensekey","GET","","Cookie");
//        System.out.println("licenseRequest:" +licenseRequest);
//        if(response.length() != 0){
////            String apiKey=response.getString("apiKeyReqID");
//            try {
//               // generateKeyPair( value,apiKey);
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }else{
//
//        }

//        return APIConnection.connectApi(bundle.getString("base.url")+bundle.getString("version")+bundle.getString("partnermanager.partner.url")+
//                "/"+ value+"/apikey/request","GET","","Cookie");
        return tspResponse;


    }
    private String reaponseJson(){
        String responseJSONTemplate = "{ \"responsecode\": \"\", \"responseMessage\":\"\", \"authStatus\": \"false\",\"authToken\":\"\"," +
                "\"transactionID\":\"\", \"responsetime\": \"\"," +
                " \"transaction_type\": \"\""+
                "}";
            JSONObject jsonObject=null;
            jsonObject = new JSONObject(responseJSONTemplate);
            jsonObject.put("responsecode", ResponseCodes.UNABLE_TOPROCESS.getErrorCode());
            jsonObject.put("responseMessage", "");

        return jsonObject.toString();
    }
    public String idAuthRequest(String request){
        ResourceBundle bundle = APIConnection.readConfig();
        String https_url =bundle.getString("tsp.url")+"/tsppublickey";

        //  String https_url = "http://192.168.1.159:8082/v1/identity/authenticate?id="+uin+"&idType=UIN&partnerUrlSuffix=ntBPTyhadGBtLAMoiOFYpAnn6hnW6qCNuUPRjTySD5iZ0F3zlf/127/768192";
        String response = "";
//        String myCookie = "Authorization="+authToken;
//        System.out.println(new Date()+"\t Request from TSP to MOSIP :\t"+request);
//        String mycookie = "";
        try {
            turnOffSslChecking();
            URL url = new URL(https_url);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoOutput(true);
            urlConnection.setRequestProperty("Connection", "keep-alive");
            urlConnection.setRequestProperty("Content-Type", "application/json; utf-8");
            urlConnection.setRequestProperty("Accept", "application/json");
//            urlConnection.setRequestProperty("Cookie", myCookie);
//            urlConnection.setRequestProperty("Authorization", authToken);
//            urlConnection.setRequestProperty("signature",signature);
            OutputStream outputStream = urlConnection.getOutputStream();
            outputStream.write(request.getBytes());
            outputStream.flush();

            // logger.info("IDAuthentication Response Code - " + urlConnection.getResponseCode() );
            if (urlConnection.getResponseCode() >= 200 && urlConnection.getResponseCode() < 400) {
                InputStream inputStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String tempstr = null;
                while ((tempstr = reader.readLine()) != null) {
                    response = tempstr;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }
    public static void turnOffSslChecking() throws NoSuchAlgorithmException, KeyManagementException {
        // Install the all-trusting trust manager
        final SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, UNQUESTIONING_TRUST_MANAGER, null);
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
    }
    public static final TrustManager[] UNQUESTIONING_TRUST_MANAGER = new TrustManager[] { new X509TrustManager() {
        @Override
        public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

        }

        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return null;
        }



        /* (non-Javadoc)
         * @see javax.net.ssl.X509TrustManager#checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String)
         */
        @Override
        public void checkServerTrusted(X509Certificate[] arg0, String arg1)
                throws java.security.cert.CertificateException {
            // TODO Auto-generated method stub

        }
    } };
//    @RequestMapping("/tspGenerateKey")
    public String getPartnerPublicKey() throws UnrecoverableEntryException, NoSuchAlgorithmException, KeyStoreException, IOException, CertificateException, IOException, InvalidKeySpecException {
        String filePath = new FileSystemResource("").getFile().getAbsolutePath()+ "/Certificate/ida-partner.cer";
        Path path = Paths.get(filePath);
        String certificateData = Files.readString(path);
        StringReader strReader = new StringReader(certificateData);
        PemReader pemReader = new PemReader(strReader);
        PemObject pemObject = pemReader.readPemObject();
        byte[] certBytes = pemObject.getContent();
//        byte[] encodedBytes = Base64.encodeBase64(certBytes);
//        System.out.println("Base64:"+encodedBytes);
//        String publicKey= encryptionMessage(String.valueOf(encodedBytes));
//        System.out.println(publicKey);
        CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
        X509Certificate certificate = (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(certBytes));
        PublicKey pk = certificate.getPublicKey();
        System.out.println("publicKey:"+pk);
        //byte[] encodedBytes1 = Base64.encodeBase64(pk.getEncoded());
       String encryptionMess= encryptionMessage(pk.toString());
//
       // byte[] encodeByte= Base64.encodeBase64(encryptionMess.getBytes(StandardCharsets.UTF_8));
        String b64PublicKey = Base64.getEncoder().encodeToString(encryptionMess.getBytes(StandardCharsets.UTF_8));
        System.out.println("Encode Data:"+b64PublicKey.toString());
        return b64PublicKey;

//                      decode method ---------------Begin
//        byte[] decodedBytes= Base64.getDecoder().decode(b64PublicKey);
//        String decodedString = new String(decodedBytes);
//        System.out.println("decode Data:"+decodedString);
//
//        String decryption=DecryptionMessage(decodedString);
//        return decryption;
//                            decode method --------------End
//        byte[] encodedPublicKey = pk.getEncoded();
//        String b64PublicKey = Base64.getEncoder().encodeToString(encodedPublicKey);
//        System.out.println("\n encoded STRING KEY::" + b64PublicKey);
//
//
//
//        //byte[] decodedBytes = Base64.getDecoder().decode(b64PublicKey);
//        byte[] decodedBytes= Base64.getDecoder().decode(b64PublicKey);
//        String decodedString = new String(decodedBytes);
//
//
//
//       // final Base64.Encoder encoder = Base64.getMimeEncoder(64, LINE_SEPARATOR.getBytes());
//        final Base64.Decoder decod= Base64.getMimeDecoder();
//
//        final byte[] rawCrtText =Base64.getDecoder().decode(b64PublicKey);
//        final String encodedCertText = new String(decod.decode(rawCrtText));
//
//         String prettified_cert = BEGIN_CERT + LINE_SEPARATOR + encodedCertText + LINE_SEPARATOR + END_CERT;
//
//
//        StringReader strReader1 = new StringReader(prettified_cert);
//        PemReader pemReader1 = new PemReader(strReader1);
//        PemObject pemObject1 = pemReader1.readPemObject();
//        byte[] certBytes1 = pemObject1.getContent();
//        X509Certificate certificate1 = (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(certBytes1));
//        PublicKey pk1 = certificate1.getPublicKey();
//
//        X509Certificate DecodeCertificate = (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(decodedBytes));
////        PublicKey decodepk = DecodeCertificate.getPublicKey();
//        System.out.println("\ndecoded STRING KEY::" + pk1);
//
//
//
//        return pk;
    }


    public static boolean generateKeyPair (String partnerId,String licenseId) throws Exception {
        //Get one instance of KeyPairGenerator with RSA.
        Map< String, Object > keyMap= new HashMap<String, Object>() ;
            KeyPairGenerator keyPairGenerator = null;
            try {
                keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
            } catch (NoSuchAlgorithmException ex) {

//                LOGGER.getLogger(RSAHelper.class.getName()).log(Level.SEVERE,
//                        null, ex);
                return false;
            }
            //Get a random seed.
            SecureRandom secureRandom = new SecureRandom();

            //Use current datetime as random seed.

//        String currentDateTime = new SimpleDateFormat("yyyyMMddHHmmssSSS",
//                Locale.getDefault()).format(new Date());
        LocalDateTime currentDateTime = ZonedDateTime.now(ZoneOffset.UTC).toLocalDateTime();
        secureRandom.setSeed((currentDateTime).toString().getBytes(StandardCharsets.UTF_8));
        secureRandom.setSeed(partnerId.getBytes());
        secureRandom.setSeed("fBOJlWBWHAUWUL5TW0vCCDoKOSca95lQm1gCo8k4vtsEl0mcNq".getBytes());

        //Initialze the key generator with the random number provider. We need to call initialze everytime to get a NEW key pair.
        keyPairGenerator.initialize(KEY_LENGTH, secureRandom);


            //Ready to generate a key pair.
            KeyPair keyPair = keyPairGenerator.genKeyPair();

            //Get public and private key.
            PublicKey publicKey = keyPair.getPublic();
            PrivateKey privateKey = keyPair.getPrivate();

            keyMap.put(PUBLIC_KEY, publicKey.getEncoded());
            keyMap.put(PRIVATE_KEY, privateKey.getEncoded());
            System.out.println("Public- Key:" +publicKey);
            System.out.println("Private-Key" + privateKey);

        try{
            sendMessage(publicKey.toString());
        }catch (Exception e){
            e.printStackTrace();
        }




        return true;
    }
    public static void setKey(String myKey) {
        try {
            byte[] raw = HexToByteNew(myKey);
            secretKey = new SecretKeySpec(raw, "AES");
            System.out.println("setKey: " + secretKey);
        } catch (Exception e) {
            System.out.println("error setKey: " + e.toString());
        }
    }
    public static byte[] HexToByteNew(String keyData) {
        byte[] val = null;
        try {
            val = new byte[keyData.length() / 2];
            for (int i = 0; i < val.length; i++) {
                int index = i * 2;
                int j = Integer.parseInt(keyData.substring(index, index + 2), 16);
                val[i] = (byte) j;
            }
            return val;
        } catch (Exception ex) {
            System.out.println("Error HexToByteNew  : " + ex.getMessage());
            return val;
        }
    }
    public static String ByteToHexNew(byte[] publicKey) {
        String outValue = "";
        StringBuffer retString = new StringBuffer();
        try {
            for (int i = 0; i < publicKey.length; ++i) {
                retString.append(Integer.toHexString(0x0100 + (publicKey[i] & 0x00FF)).substring(1));
            }
            outValue = retString.toString();
            return outValue;
        } catch (Exception ex) {
            System.out.println("Error ByteToHexNew : " + ex.getMessage());
            return outValue;
        }
    }
    public String encryptionMessage(String message){
        String encryptionData="";
        byte[] encrypted = new byte[0];

        System.out.println("---------------------------------------------------");
        System.out.println("original encryption data:" + message);
        try {
//            System.out.println("secret"+secret);
            setKey(SHARED_KEY);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8"))); //For Base64 output
            encryptionData= ByteToHexNew(cipher.doFinal(message.getBytes(StandardCharsets.UTF_8)));  //For Hex output
            System.out.println("Encryption Data:" +encryptionData );
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return encryptionData;
    }
    public String DecryptionMessage(String message){

        String decryptionData="";

        System.out.println("---------------------------------------------------");
        System.out.println("original Decryption data:" + message);
        try {
            setKey(SHARED_KEY);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            // return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt))); //For Base64 input
            decryptionData= new String(cipher.doFinal(HexToByteNew(message))); //For Hex input
            System.out.println(" Decryption Data:" +decryptionData);
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return decryptionData;

    }


    public static void sendMessage(String message) throws Exception {
        String encryptionData="";
        String decryptionData="";
        byte[] encrypted = new byte[0];

        System.out.println("---------------------------------------------------");
        System.out.println("original encryption data:" + message);
        //Generate AES key for encrypt message
//        KeyGenerator keyGenerator=KeyGenerator.getInstance("AES");
//        Integer keyBitSize=256;
//        keyGenerator.init(keyBitSize);
//        SecretKey simKey=keyGenerator.generateKey();
//        System.out.println("AES KEY: "+simKey.getEncoded()+"\n");
//        try {
//            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
//            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
//
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
//            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
//
//          encrypted = cipher.doFinal(message.getEncoded());
//            System.out.println("encryption data: "+encrypted);
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        //Encrypt message
     //Encryption Data
        try {
//            System.out.println("secret"+secret);
            setKey(SHARED_KEY);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8"))); //For Base64 output
             encryptionData= ByteToHexNew(cipher.doFinal(message.getBytes(StandardCharsets.UTF_8)));  //For Hex output
            System.out.println("Encryption Data:" +encryptionData );
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        //Decrypt message
//        try {
//            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
//            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
//
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
//            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
//            byte[] original = cipher.doFinal((encrypted));
//            System.out.println("Chk :"+new String(original));
//            System.out.println("Decryuption data: " +original);
//
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }


        //Encrypt AES key
//        byte[] KeyToEnc=simKey.getEncoded();
//        cipher=Cipher.getInstance("RSA/ECB/PKCS1Padding");
//        cipher.init(Cipher.ENCRYPT_MODE, receiver.getPub());
//        cipher.update(KeyToEnc);
//        byte[] AESEncWrt=cipher.doFinal();
//        String aeskeyString=new String(Base64.getEncoder().encodeToString(AESEncWrt));
//        System.out.println("AES ENC:"+aeskeyString+"\n");

        //Decrypt AES key
//        byte[] KeyToDec=Base64.getDecoder().decode(aeskeyString.getBytes());
//        cipher.init(Cipher.DECRYPT_MODE, receiver.getPriv());
//        cipher.update(KeyToDec);
//        byte[] decAesKey=cipher.doFinal();
//        System.out.println("AES DEC: "+decAesKey+"\n");


        //Write message and AES key in file
//        BufferedWriter messFile=new BufferedWriter(new FileWriter(receiver.getInbox()+"/"+getUsername()+".txt"));
//        System.out.println("WRITING TO FILE:"+messToWrite+"\n");
//        messFile.write(messToWrite);
//        messFile.close();
//        BufferedWriter aeswrite=new BufferedWriter(new FileWriter(receiver.getInbox()+"/"+getUsername()+"key.txt"));
//        System.out.println("WRT KEY:"+aeskeyString+"\n");
//        aeswrite.write(aeskeyString);
//        aeswrite.close();
//Decryption Data
        try {
            setKey(SHARED_KEY);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            // return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt))); //For Base64 input
            decryptionData= new String(cipher.doFinal(HexToByteNew(encryptionData))); //For Hex input
            System.out.println(" Decryption Data:" +decryptionData);
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        System.out.println("-------------------------------");
    }
    }
