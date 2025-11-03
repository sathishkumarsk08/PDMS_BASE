package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.MSPPartnerRegistration;
import com.msp.pms.msppmsmodel.MSPPartnerSuspension;
import com.msp.pms.msppmsrepository.MSPPartnerSuspensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPPartnerSuspensionService {
    @Autowired
//    @Qualifier("test")
    private MSPPartnerSuspensionRepository mspPartnerSuspensionRepository;

    public boolean save(MSPPartnerSuspension policy) {
        boolean out = true;
        try {
            mspPartnerSuspensionRepository.save(policy);
        } catch (Exception e) {
            e.printStackTrace();
            out = false;
        }

        return out;

    }

    public List<MSPPartnerSuspension> getExpiredPartnerSuspension(LocalDate yesterday, LocalDate today) {
        return mspPartnerSuspensionRepository.getExpiredPartnerSuspension(yesterday,today);
    }

//
//    public List<MSPPartnerSuspension> viewPartnerReg(String val, boolean action){
//        return mspPartnerSuspensionRepository.viewPartnerReg(val,action);
//    }//

    public int checkPartnerId(String partnerId) {
        return mspPartnerSuspensionRepository.checkPartnerId(partnerId);
    }

    public String maxUserid() {
        return mspPartnerSuspensionRepository.maxPartnerId();
    }

    public String getReason(String partnerId) {
        return mspPartnerSuspensionRepository.getReason(partnerId);
    }

    public void delSusPartner(String susId) {
        mspPartnerSuspensionRepository.delSusPartner(susId);
    }

    public void deleteSusPartner(String id) {
        mspPartnerSuspensionRepository.deleteSusPartner(id);
    }
}
