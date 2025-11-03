package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.MSPPartnerPolicyRequest;
import com.msp.pms.msppmsrepository.MSPPartnerPolicyRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPPartnerPolicyRequestService {

    @Autowired
    private MSPPartnerPolicyRequestRepository mspPartnerPolicyRequestRepository;

    public void save(MSPPartnerPolicyRequest req) {
         mspPartnerPolicyRequestRepository.save(req);

    }

    public void changeStatus(String apiKey) {
        mspPartnerPolicyRequestRepository.changeStatus(apiKey);
    }

    public ArrayList<Object[]> getMispDetails(){
        return mspPartnerPolicyRequestRepository.getMispDetails();
    }

    public ArrayList<Object[]> getApiRequestDetails() {
        return mspPartnerPolicyRequestRepository.getApiRequestDetails();
    }

    public List<MSPPartnerPolicyRequest> notificationList() {
        return mspPartnerPolicyRequestRepository.notificationList();
    }

    public void changeNotificationList(String partner, String api) {
         mspPartnerPolicyRequestRepository.changeNotificationList(partner,api);
    }

    public List<MSPPartnerPolicyRequest> getPartnerId() {
        return mspPartnerPolicyRequestRepository.getPartnerId();
    }

    public Long flagCount() {
        return mspPartnerPolicyRequestRepository.flagCount();
    }
}
