package com.msp.controller;

import com.msp.common.SendEmail;
import com.msp.service.KeyMgrCaCertStoreService;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RestController;

import javax.activation.DataSource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.security.*;
import java.security.cert.*;
import java.security.cert.Certificate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.*;


@RestController
public class ApiController {

	@Value("false")
	private boolean disableTrustStoreCache;

	@Autowired
	private KeyMgrCaCertStoreService caCertificateStoreRepository;

//	@Autowired
//	MstRoleToGroupService mstRoleToGroupService;
//	@Autowired
//	RolesAccessService rolesAccessService;
//	@Autowired
//	MstRoleGroupService mstRoleGroupService;
//
//	@Autowired
//	UserdetailsService userService;

//	@GetMapping("loadEditUserGroup/{val}")
//	public List<String> loadEditUserGroup(@PathVariable int val, HttpServletRequest request) {
//		/*
//		 * HttpSession session = request.getSession(false);
//		 * session.setMaxInactiveInterval(600);
//		 */
//		System.out.println("loadEditUserGroup-------");
//		ArrayList<MstRoleToGroup> assignedRoles = mstRoleToGroupService.findbyGroupId(val);
//		ArrayList<String> mst = new ArrayList<String>();
//		for (MstRoleToGroup mstRoleToGroup : assignedRoles) {
//			// MstRoles mstRoles =
//			// rolesAccessService.findbyRoleId(mstRoleToGroup.getMstRoles().getRoleid());
//			mst.add(mstRoleToGroup.getMstRoles().getRoleid());
//		}
//
//		return mst;
//	}

//	@PostMapping("checkGroupName/{val}")
//	public Boolean checkGroupName(@PathVariable String val, HttpServletRequest request) {
//
//		boolean isGroupName = true;
//		try {
//			/*
//			 * HttpSession session = request.getSession(false);
//			 * session.setMaxInactiveInterval(600);
//			 */
//			List<MstRoleGroup> roleGroup = mstRoleGroupService.findByGroupName(val);
//			if (roleGroup != null && roleGroup.size() > 0) {
//				isGroupName = true;
//			} else {
//				isGroupName = false;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return isGroupName;
//	}

//	@GetMapping("contactnum/{contactnumber}")
//	public String getuserPhonenum(@PathVariable String contactnumber, HttpServletRequest request) {
//		/*
//		 * HttpSession session = request.getSession(false);
//		 * session.setMaxInactiveInterval(600);
//		 */
//		String phonenumber = userService.findByphone(contactnumber);
//		return phonenumber;
//	}
//
//	@GetMapping("contactnumById/{contactnumber}/{userid}")
//	public String getuserPhonenumByuserId(@PathVariable String contactnumber, @PathVariable String userid,
//			HttpServletRequest request) {
//		/*
//		 * HttpSession session = request.getSession(false);
//		 * session.setMaxInactiveInterval(600);
//		 */
//		String phonenumber = userService.findByphoneByuserid(contactnumber, userid);
//		return phonenumber;
//	}

	/*
	 * @PostMapping("sendingOtpByEmailId") public String
	 * sendingOtpByEmailId(@ModelAttribute("applicantbean") ApplicantBean app,
	 * HttpServletRequest request) { String otp = null; String otpenc = null; //
	 * String plantId = null; try {
	 * System.out.println("app.getApplicant().getFirstname()>>" +
	 * app.getApplicant().getFirstname());
	 * System.out.println("app.getApplicant().getEmail()>>>" +
	 * app.getApplicant().getEmail());
	 * 
	 * HttpSession session = request.getSession(false);
	 * session.setMaxInactiveInterval(600);
	 * 
	 * otpenc = new SimpleOTPGenerator().random(4); otp = new
	 * UtilClass().encrypt(otpenc);
	 * 
	 * String template =
	 * "Dear {0}, <br>\n<br>\n\t BANGLADESH ROAD TRANSPORT AUTHORITY WELCOMES YOU!<br>\n<br>\n Your One Time Password for Learner License Registration is : {1}.<br>\n<br>\n kindly enter your OTP to register into the system.<br>\n<br>\nThanks and Best Regards<br>\n<br>\nBANGLADESH ROAD TRANSPORT AUTHORITY."
	 * ; String message = MessageFormat.format(template,
	 * app.getApplicant().getFirstname(), otpenc); if (new
	 * ApiController().sendmailprocess(app.getApplicant().getEmail(),
	 * "BANGLADESH ROAD TRANSPORT AUTHORITY - ONE TIME PASSWORD", message)) {
	 * System.out.println("OtpSend"); // plantId = "otpsend"; } else {
	 * System.out.println("not send"); // plantId = " "; } // String smsMessage =
	 * "ONE TIME PASSWORD - BANGLADESH ROAD TRANSPORT AUTHORITY // :" + otpenc; //
	 * new ApiController().sendSMSprocess(mobilenumber, smsMessage); } catch
	 * (Exception e) { e.printStackTrace(); }
	 * 
	 * return otpenc; }
	 */

	public boolean sendmailprocess(String tomail, String subject, String mailMessage) {
		boolean flag = false;
		try {
			System.out.println("sending mail");
			SendEmail email = new SendEmail();
			email.configfile();
			flag = email.sendExternalMail(tomail, subject, mailMessage);
		} catch (IOException ex) {
			flag = false;
			ex.printStackTrace();
		}
		return flag;
	}

	public boolean sendmailprocessWithattach(String tomail, String subject, String mailMessage, String filename,
			DataSource attach) {
		boolean flag = false;
		try {
			System.out.println("sending attach mail");
			SendEmail email = new SendEmail();
			email.configfile();
			flag = email.sendExternalMailWithAttachement(tomail, subject, mailMessage, filename, attach);
		} catch (IOException ex) {
			flag = false;
			ex.printStackTrace();
		}
		return flag;
	}
	public Certificate convertToCertificate(String certData) {
		try {
			StringReader strReader = new StringReader(certData);
			PemReader pemReader = new PemReader(strReader);
			PemObject pemObject = pemReader.readPemObject();
			byte[] certBytes = pemObject.getContent();
			CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
			return certFactory.generateCertificate(new ByteArrayInputStream(certBytes));
		} catch(IOException | CertificateException e) {
			e.printStackTrace();
			return null;
		}
	}
	public  List<? extends Certificate> getCertificateTrustPath(X509Certificate reqX509Cert, String partnerDomain) {

		try {
			Map<String, Set<?>> trustStoreMap = getTrustAnchors(partnerDomain);
			Set<TrustAnchor> rootTrustAnchors = (Set<TrustAnchor>) trustStoreMap
					.get("TrustRoot");
			Set<X509Certificate> interCerts = (Set<X509Certificate>) trustStoreMap
					.get("TrustInter");

//			LOGGER.info(PartnerCertManagerConstants.SESSIONID, PartnerCertManagerConstants.CERT_TRUST_VALIDATION,
//					PartnerCertManagerConstants.EMPTY, "Certificate Trust Path Validation for domain: " + partnerDomain);
//			LOGGER.info(PartnerCertManagerConstants.SESSIONID, PartnerCertManagerConstants.CERT_TRUST_VALIDATION,
//					PartnerCertManagerConstants.EMPTY, "Total Number of ROOT Trust Found: " + rootTrustAnchors.size());
//			LOGGER.info(PartnerCertManagerConstants.SESSIONID, PartnerCertManagerConstants.CERT_TRUST_VALIDATION,
//					PartnerCertManagerConstants.EMPTY, "Total Number of INTERMEDIATE Trust Found: " + interCerts.size());

			X509CertSelector certToVerify = new X509CertSelector();
			certToVerify.setCertificate(reqX509Cert);

			PKIXBuilderParameters pkixBuilderParams = new PKIXBuilderParameters(rootTrustAnchors, certToVerify);
			pkixBuilderParams.setRevocationEnabled(false);

			CertStore interCertStore = CertStore.getInstance("Collection",
					new CollectionCertStoreParameters(interCerts));
			pkixBuilderParams.addCertStore(interCertStore);

			// Building the cert path and verifying the certification chain
			CertPathBuilder certPathBuilder = CertPathBuilder.getInstance("PKIX");
			//certPathBuilder.build(pkixBuilderParams);
			PKIXCertPathBuilderResult result = (PKIXCertPathBuilderResult) certPathBuilder.build(pkixBuilderParams);

			X509Certificate rootCert = result.getTrustAnchor().getTrustedCert();
			List<? extends Certificate> certList = result.getCertPath().getCertificates();
			List<Certificate> trustCertList = new ArrayList<>();
			certList.stream().forEach(cert -> {
				trustCertList.add(cert);
			});
			trustCertList.add(rootCert);
			return trustCertList;
		} catch (CertPathBuilderException | InvalidAlgorithmParameterException | NoSuchAlgorithmException exp ) {
//			LOGGER.debug(PartnerCertManagerConstants.SESSIONID, PartnerCertManagerConstants.UPLOAD_CA_CERT,
//					PartnerCertManagerConstants.EMPTY,
//					"Ignore this exception, the exception thrown when trust validation failed.");
			exp.printStackTrace();
		}
		return null;
	}

	public  Map<String, Set<?>> getTrustAnchors(String partnerDomain) {
		Set<TrustAnchor> rootTrust = new HashSet<>();
		Set<X509Certificate> intermediateCerts = new HashSet<>();
		caCertificateStoreRepository.findByPartnerDomain(partnerDomain).stream().forEach(
				trustCert -> {
					String certificateData = trustCert.getCertData();
					X509Certificate x509Cert = (X509Certificate) convertToCertificate(certificateData);
					if (isCertificateDatesValid(x509Cert)) {
						if (isSelfSignedCertificate(x509Cert)) {
							rootTrust.add(new TrustAnchor(x509Cert, null));
						} else{
							intermediateCerts.add(x509Cert);
						}
					}
				}
		);
		Map<String, Set<?>> hashMap = new HashMap<>();
		hashMap.put("TrustRoot", rootTrust);
		hashMap.put("TrustInter", intermediateCerts);
		return hashMap;
	}
	public static boolean isCertificateDatesValid(X509Certificate x509Cert) {

		try {
			Date currentDate = Date.from(getUTCCurrentDateTime().atZone(ZoneId.systemDefault()).toInstant());
			x509Cert.checkValidity(currentDate);
			return true;
		} catch(CertificateExpiredException | CertificateNotYetValidException exp) {

			System.out.println("Ignore this exception, the exception thrown when certificate dates are not valid.");
		}
		try {
			// Checking both system default timezone & UTC Offset timezone. Issue found in reg-client during trust validation.
			x509Cert.checkValidity();
			return true;
		} catch(CertificateExpiredException | CertificateNotYetValidException exp) {
			System.out.println("Ignore this exception, the exception thrown when certificate dates are not valid.");

		}
		return false;
	}
	public static boolean isSelfSignedCertificate(X509Certificate x509Cert) {
		try {
			x509Cert.verify(x509Cert.getPublicKey());
			return true;
		} catch (CertificateException | NoSuchAlgorithmException | InvalidKeyException | SignatureException
				| NoSuchProviderException exp) {

			System.out.println("Ignore this exception, the exception thrown when signature validation failed.");
		}
		return false;
	}
	public static LocalDateTime getUTCCurrentDateTime() {
		return ZonedDateTime.now(ZoneOffset.UTC).toLocalDateTime();
	}

//	public boolean sendSMSprocess(String tomail, String mailMessage) {
//		boolean flag = false;
//		try {
//			SendSMS email = new SendSMS();
//			email.configfile();
//			flag = email.sendExternalSMS(tomail, mailMessage);
//
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
//		return flag;
//	}

//	@GetMapping("otpDecrypt/{generatedOTP}")
//	public String otpDecrypt(@PathVariable String generatedOTP, HttpServletRequest request) {
//		String otpDec = null;
//		try {
//			/*
//			 * HttpSession session = request.getSession(false);
//			 * session.setMaxInactiveInterval(600);
//			 */
//			System.out.println("generatedOTP>>>>>>>>" + generatedOTP);
//			otpDec = new UtilClass().decrypt(generatedOTP);
//			System.out.println("otpDec:" + otpDec);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return otpDec;
//	}

}
