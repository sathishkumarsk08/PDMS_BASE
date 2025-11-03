package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.partnerblacklisted;
import com.msp.pms.msppmsrepository.MSPBacklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPBacklistService {
    @Autowired
     MSPBacklistRepository mspBacklistRepository;

    public boolean save(partnerblacklisted policy){
        boolean out = true;
        try {
            mspBacklistRepository.save(policy);
        } catch (Exception e) {
            e.printStackTrace();
            out = false;
        }

        return out;

    }

    public ArrayList<partnerblacklisted> getExpiredPartnerBlackListed(LocalDate yesterday, LocalDate today) {
        return mspBacklistRepository.getExpiredPartnerBlackListed(yesterday, today);

    }
    public String maxUserid() {
        return mspBacklistRepository.maxPartnerId();
    }

    public String getReason(String partnerId) {
        return mspBacklistRepository.getReason(partnerId);
    }

    public void delBlackPartner(String id) {
        mspBacklistRepository.delBlackPartner(id);
    }

    public void deleteBlackPartner(String id) {
        mspBacklistRepository.deleteBlackPartner(id);
    }
}

