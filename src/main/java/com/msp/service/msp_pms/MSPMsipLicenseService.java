package com.msp.service.msp_pms;

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
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPMsipLicenseService {

    @Autowired
    MSPMispLicenseRepository mspMispLicenseRepository;
    public void save(MSPMosipLicense lic) {
        mspMispLicenseRepository.save(lic);
    }

    public List<MSPMosipLicense> getOnboardedLicense(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        return mspMispLicenseRepository.getOnboardedLicense(startDateTime,endDateTime);
    }

    public BigInteger getDashboarLicenseList(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        return mspMispLicenseRepository.getDashboarLicenseList(startDateTime,endDateTime);
    }

    public List<MSPMosipLicense> getValidationSchedule(LocalDateTime fromThirty,LocalDateTime toThirty) {
        return mspMispLicenseRepository.getValidationSchedule(fromThirty,toThirty );
    }
    public List<MSPMosipLicense> viewPartnerLicense(boolean status) {
       return mspMispLicenseRepository.viewPartnerLicense(status);
    }
    public int UpdateStatus(boolean status,String Id,String key){
        return mspMispLicenseRepository.UpdateStatus(status,Id, key);
    }

    public int UpdateStatusfalse(String Id) {
        return mspMispLicenseRepository.UpdateStatusfalse(Id);

    }

    public int DeleteLicenseKey(String partId, String licenseKey) {
       return mspMispLicenseRepository.DeleteLicenseKey(partId,licenseKey);
    }
}
