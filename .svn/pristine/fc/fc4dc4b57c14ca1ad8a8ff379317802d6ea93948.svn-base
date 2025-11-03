package com.msp.service.mosip_pms;

import com.msp.mosip_pms.repository.PartnerPolicyRepository;
import com.msp.mosip_pms.repository.PartnerPolicyRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional("TransactionManager")
@Qualifier("mosip_partner")
public class PartnerPolicyRequestService {

    @Autowired

    PartnerPolicyRequestRepository partnerPolicyRequestRepository;

    public ArrayList<Object[]> getMispDetails(){
        return partnerPolicyRequestRepository.getMispDetails();
    }
}
