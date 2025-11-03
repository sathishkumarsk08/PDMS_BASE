package com.msp.common;

import com.google.gson.Gson;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.ResourceBundle;

@Component
public class MailService {

    @Autowired
    Gson gson;

    @Autowired
    SendEmail sendEmail;

    public EmailNotifyResponseDto emailNotification(String key, String subject, String content, String filePath) throws  Exception {
        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("mailTo", key);
        body.add("mailSubject", subject);
        body.add("mailContent", content);


        ResourceBundle bundle = APIConnection.readConfig();

        try {
            System.out.println("mail content:" + body);

            boolean val1 = Boolean.parseBoolean(bundle.getString("mail.notification.enable"));

            if(val1){
                String Url =  bundle.getString("base.url") + bundle.getString("version") + bundle.getString("mail.url");
                return gson.fromJson(APIConnection.postRest(body,Url),EmailNotifyResponseDto.class);
            }else{
                System.out.println("mail send fail");
                return null;
            }

        } catch (IOException | NoSuchAlgorithmException | KeyManagementException | KeyStoreException | JSONException e) {
            throw new Exception("Exception occured while accessing ", e);
        }

    }
    public EmailNotifyResponseDto attachedEmailNotification(String key, String subject, String content,  HttpEntity<byte[]> fileEntity) throws  Exception {
        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("mailTo", key);
        body.add("mailSubject", subject);
        body.add("mailContent", content);
        body.add("attachments", fileEntity);

        ResourceBundle bundle = APIConnection.readConfig();

        try {
            System.out.println("mail content:" + body);

            boolean val1 = Boolean.parseBoolean(bundle.getString("mail.notification.enable"));

            if(val1){
                String Url =  bundle.getString("base.url") + bundle.getString("version") + bundle.getString("mail.url");
                return gson.fromJson(APIConnection.postRest(body,Url),EmailNotifyResponseDto.class);
            }else{
                System.out.println("mail send fail");
                return null;
            }

        } catch (IOException | NoSuchAlgorithmException | KeyManagementException | KeyStoreException | JSONException e) {
            throw new Exception("Exception occured while accessing ", e);
        }

    }
}
