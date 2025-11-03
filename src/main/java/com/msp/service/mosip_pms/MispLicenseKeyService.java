package com.msp.service.mosip_pms;

import com.msp.mosip_pms.model.MispLicenseKey;
import com.msp.mosip_pms.repository.MispLicenseKeyRepository;
import com.msp.mosip_pms.repository.PartnerPolicyRepository;
import com.msp.pms.msppmsmodel.MSPMosipLicense;
import com.msp.pms.msppmsrepository.MSPMispLicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Service

@Transactional("TransactionManager")
@Qualifier("mosip_partner")
public class MispLicenseKeyService {

    @Autowired
    MispLicenseKeyRepository mispLicenseKeyRepository;


    public List<MispLicenseKey> getOnboardedLicense(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        return mispLicenseKeyRepository.getOnboardedLicense(startDateTime, endDateTime);
    }

    public List<MispLicenseKey> getOnboardedLicense(LocalDateTime startDateTime, LocalDateTime endDateTime,String userId) {
        return mispLicenseKeyRepository.getOnboardedLicense(startDateTime, endDateTime, userId);
    }

    public BigInteger getDashboarLicenseList() {
        return mispLicenseKeyRepository.getDashboarLicenseList();
    }

    public List<MispLicenseKey> viewPartnerLicense(boolean status) {
        return mispLicenseKeyRepository.viewPartnerLicense(status);
    }

    public int DeleteLicenseKey(String partId, String licenseKey) {
      return mispLicenseKeyRepository.DeleteLicenseKey(partId, licenseKey);
    }

    public int updateStatus(boolean status, String providerId, String licenseKey) {
      return   mispLicenseKeyRepository.updateStatus(status,providerId ,licenseKey);
    }

    public List<MispLicenseKey> getTSPPartnerDetails() {
        return mispLicenseKeyRepository.getTSPPartnerDetails();
    }

    public MispLicenseKey getLicenseKeyDetails(String partnerId) {
        return mispLicenseKeyRepository.getLicenseKeyDetails(partnerId);
    }

    public void changeUserId(String licenseKey, String userId) {
         mispLicenseKeyRepository.changeUserId(licenseKey, userId);
    }
}
