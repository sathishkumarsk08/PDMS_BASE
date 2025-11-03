package com.msp.common;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.UUID;

@Component
public class SendEmail {



	String strServerName;
	String strServerPort;
	String strFrom;
	String strUserName;
	String strPassword;


	public void configfile() throws IOException {
		
		try {
            /* For Depolying tomcat use below catalina file */
//			File catalinaBase = new File(System.getProperty("catalina.base")).getAbsoluteFile();
//			File propertyFile = new File(catalinaBase, "bin/Mail.conf");
//			File propertyFile = new File("bin/Conf/Mail.conf");
			File catalinaBase = new File(System.getProperty("catalina.base")).getAbsoluteFile();
			File	propertyFile = new File(catalinaBase, "bin/Mail.conf");
//			String pathName = new FileSystemResource("").getFile().getAbsolutePath();
//			File propertyFile = new File(pathName+"/Mail.conf");
			System.out.println("path"+propertyFile.getAbsolutePath());
			InputStream in = new FileInputStream(propertyFile);
			ResourceBundle resource = new PropertyResourceBundle(in);
			strServerName = resource.getString("Mail.Server");
			strServerPort = resource.getString("Mail.Port");
			strFrom = resource.getString("Mail.From");
			strUserName = resource.getString("Mail.User");
			strPassword = resource.getString("Mail.Password");
//	            strServerName = "mail.eaglesoftware.in";
//	            strServerPort = "25";
//	            strFrom = "appdev@eaglesoftware.in";
//	            strUserName = "appdev";
//	            strPassword = "!@#esilapp@2018#@!";

		} catch (Exception e) {			
			e.printStackTrace();			
		}
	}

	public boolean sendExternalMail(String tm, String subject, String mailMsg) throws IOException {
		boolean flag = false;
		String to = tm;


		String host = strServerName;
		String port = strServerPort;
		String from = strFrom;
		String username = strUserName;
		String password = strPassword;


		Properties properties = new Properties();
//	        Local
		System.out.println("host:"+host);
		System.out.println("port:"+port);
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.debug", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.port", port);
		properties.put("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.starttls.required", "true");
		properties.put("mail.properties.mail.smtp.ssl.trust","*");
		properties.put("mail.properties.mail.smtp.ssl.protocols","TLSv1.2");


		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {


			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {

			File imagePath = new ClassPathResource("philippines_logo.jpg").getFile();

//			System.out.println("createDir.getAbsolutePath() :" + imagePath);
			MimeMessage mimeMessage = new MimeMessage(session);
			InternetAddress[] fromAddress = InternetAddress.parse(from);
			InternetAddress[] toAddresses = InternetAddress.parse(to);
			// mimeMessage.setFrom(fromAddress[0]);
			mimeMessage.setFrom(new InternetAddress(fromAddress[0].toString(), "PSA"));
//			mimeMessage.setFrom(new InternetAddress(fromAddress[0].toString(), "TestMailEagle"));
			mimeMessage.setRecipients(RecipientType.TO, toAddresses);
			mimeMessage.setSubject(subject, "UTF-8");

			MimeMultipart mainPart = new MimeMultipart("related");
			MimeBodyPart messageWrapper = new MimeBodyPart();
			MimeMultipart messagesPart = new MimeMultipart("alternative");
			MimeBodyPart html = new MimeBodyPart();
			messagesPart.addBodyPart(html);

			messageWrapper.setContent(messagesPart);
			mainPart.addBodyPart(messageWrapper);
			MimeBodyPart sigAttachment = new MimeBodyPart();
			mainPart.addBodyPart(sigAttachment);

			// create the details for the sig content
			String embeddedAttachmentId = UUID.randomUUID().toString();
			String mailHTMLWithSig = "<html><body>" + mailMsg + "<p><img src=\"cid:" + embeddedAttachmentId
					+ "\" alt=\"ATTACHMENT\"></p></body></html>";
			File sigFile = new File(String.valueOf(imagePath));
			sigAttachment.attachFile(sigFile);
			sigAttachment.setContentID("<" + embeddedAttachmentId + ">");
			sigAttachment.setHeader("Content-Type", "image/jpg");
			sigAttachment.setFileName(sigFile.getName());

			html.setText(mailHTMLWithSig, "utf-8", "html");
			mimeMessage.setContent(mainPart);

			Transport.send(mimeMessage);

			System.out.println("mail reached");
			flag = true;
		} catch (MessagingException e) {

			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return flag;
	}

	public boolean sendExternalMailHtml(String tm, String subject, String mailMsg) {		
		boolean flag = false;
		String to = tm;
		final String from = "test@eagle.com";
		final String username = "appdev";
		final String password = "!@#esilapp@2020#@!";

		String host = strServerName;
		String port = strServerPort;

		Properties properties = new Properties();
//	        LOCAL
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "false");
		properties.put("mail.smtp.host", "192.168.1.10");
		properties.put("mail.smtp.port", "25");

		// LIVE
//	        properties.setProperty("mail.smtp.host", host);
//	        properties.put("mail.smtp.port", port);
//	        properties.put("mail.smtp.auth", "true");		
//	        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//	        properties.put("mail.smtp.socketFactory.fallback", "true");
//	        properties.put("mail.transport.protocol", "smtp");
		// Get the Session object.
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText(mailMsg);
			message.setContent(mailMsg, "text/html");
			Transport.send(message);			
			flag = true;
		} catch (MessagingException e) {			
			throw new RuntimeException(e);
		}
		return flag;
	}

	public boolean sendExternalMailWithAttachement(String tm, String subject, String mailMsg, String filename,
			DataSource aAttachment) throws IOException {	
		boolean flag = false;
		String to = tm;
		final String from = "test@eagle.com";
		final String username = "appdev";
		final String password = "!@#esilapp@2020#@!";

		String host = strServerName;
		String port = strServerPort;

		Properties properties = new Properties();
//	        LOCAL
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "false");
		properties.put("mail.smtp.host", "192.168.1.10");
		properties.put("mail.smtp.port", "25");

		// LIVE
//	        properties.setProperty("mail.smtp.host", host);
//	        properties.put("mail.smtp.port", port);
//	        properties.put("mail.smtp.auth", "true");
//	        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//	        properties.put("mail.smtp.socketFactory.fallback", "true");
//	        properties.put("mail.transport.protocol", "smtp");
		// Get the Session object.
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			MimeMessage message2 = new MimeMessage(session);
			InternetAddress[] fromAddress = InternetAddress.parse(from);
			InternetAddress[] toAddresses = InternetAddress.parse(to);
			//message2.setFrom(new InternetAddress(from));
			message2.setFrom(new InternetAddress(fromAddress[0].toString(), "BANGLADESH"));
			message2.setRecipients(RecipientType.TO, toAddresses);
			//message2.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message2.setSubject(subject);
//	            BodyPart messageBodyPart1 = new MimeBodyPart();
//	            messageBodyPart1.setText(mailMsg);

//	            Multipart multipart1 = new MimeMultipart();
//	            multipart1.addBodyPart(messageBodyPart1);
//	            messageBodyPart1 = new MimeBodyPart();
//	            messageBodyPart1.setDataHandler(new DataHandler(aAttachment));
//	            messageBodyPart1.setFileName(filename);
//	            multipart1.addBodyPart(messageBodyPart1);
//	            message2.setContent(multipart1);
//	            String getDirToLog = "SignImage/EDSL_logo.png";
//	            File createDir = new File(getDirToLog);
			
			
	/* For Depolying tomcat use below catalina image path */
			
//			File catalinaBase = new File(System.getProperty("catalina.base")).getAbsoluteFile();
//			String imagePath = new File(catalinaBase, "bin/SignImage/brta.png").toString();


			String pathNmae = new FileSystemResource("").getFile().getAbsolutePath();
//	  		String imagePath = new File("bin/img/brta.png").toString();
			String imagePath = new File(pathNmae+"/src/main/webapp/philippines_logo.jpg").toString();

//	            String imagePath = createDir.getAbsolutePath();
			MimeMultipart mainPart = new MimeMultipart("related");

			MimeBodyPart messageWrapper = new MimeBodyPart();
			MimeBodyPart html = new MimeBodyPart();
			MimeBodyPart sigAttachment = new MimeBodyPart();
			MimeBodyPart attachment = new MimeBodyPart();

			MimeMultipart messagesPart = new MimeMultipart("alternative");

			messagesPart.addBodyPart(html);

			messageWrapper.setContent(messagesPart);
			mainPart.addBodyPart(messageWrapper);

			mainPart.addBodyPart(sigAttachment);
			mainPart.addBodyPart(attachment);

			// create the details for the sig content
			String embeddedAttachmentId = UUID.randomUUID().toString();
			String mailHTMLWithSig = "<html><body>" + mailMsg + "<p><img src=\"cid:" + embeddedAttachmentId
					+ "\" alt=\"ATTACHMENT\"></p></body></html>";
//	            String sigPath = "D:/sys/RRA_Logo.png";
			File sigFile = new File(imagePath);
			sigAttachment.attachFile(sigFile);
			sigAttachment.setContentID("<" + embeddedAttachmentId + ">");
			sigAttachment.setHeader("Content-Type", "image/jpg");
			sigAttachment.setFileName(sigFile.getName());

			attachment.setDataHandler(new DataHandler(aAttachment));
			attachment.setFileName(filename);
			html.setText(mailHTMLWithSig, "utf-8", "html");
			message2.setContent(mainPart);
			Transport.send(message2);		
			flag = true;

		} catch (MessagingException e) {			
			throw new RuntimeException(e);
		}
		return flag;
	}



	/***** Checking FP Device Ends ******/
	public static final TrustManager[] UNQUESTIONING_TRUST_MANAGER = new TrustManager[]{new X509TrustManager() {
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
	}};

}
