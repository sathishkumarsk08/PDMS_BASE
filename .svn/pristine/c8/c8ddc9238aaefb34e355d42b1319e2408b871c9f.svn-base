package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.MSPPartnerPolicy;
import com.msp.pms.msppmsrepository.MSPPartnerPolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPPartnerPolicyService {

    @Autowired
//    @Qualifier("msp_partnerpolicy")
    MSPPartnerPolicyRepository mspPartnerPolicyRepository;

    public void save(MSPPartnerPolicy setApi) {
        mspPartnerPolicyRepository.save(setApi);
    }

    public ArrayList<Object[]> getAPIMispPartnerDetails(){
        return mspPartnerPolicyRepository.getAPIMispDetails();
    }

    public List<MSPPartnerPolicy> getOnboardedApi(LocalDateTime strtDate, LocalDateTime endDate) {
        return mspPartnerPolicyRepository.getOnboardedApi(strtDate,endDate);
    }

    public BigInteger getDashboardAPIList(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        return mspPartnerPolicyRepository.getDashboardAPIList(startDateTime,endDateTime);
    }

    public List<MSPPartnerPolicy> viewPartnerApi(boolean status) {
        return mspPartnerPolicyRepository.viewPartnerApi(status);
    }

    public int UpdateStatus(String Id ,boolean status, String apiKey) {
        return mspPartnerPolicyRepository.UpdateStatus(Id ,status ,apiKey);
    }

    public int DeleteApiKey(String partId, String apikey) {
     return   mspPartnerPolicyRepository. DeleteApiKey(partId,apikey);
    }
}
