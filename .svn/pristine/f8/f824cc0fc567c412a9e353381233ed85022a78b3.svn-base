package com.msp.service.msp_pms;

import com.msp.common.APIConnection;
import com.msp.mosip_pms.model.partner;
import com.msp.pms.msppmsmodel.MspPartnerRegSuspension;
import com.msp.pms.msppmsrepository.MspRegPartSusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MspRegPartSuspension {

    @Autowired
    private MspRegPartSusRepo mspRegPartSusRepo;
    public void save(MspPartnerRegSuspension partnersus){
        mspRegPartSusRepo.save(partnersus);
    }
    public int DeActivate(String reason){
      return mspRegPartSusRepo.DeActivate(reason);
    }

    public ArrayList<MspPartnerRegSuspension> findAlldevice() {
        ArrayList<MspPartnerRegSuspension> type = (ArrayList<MspPartnerRegSuspension>) mspRegPartSusRepo.findAllpartners();
        return type;
    }

    public MspPartnerRegSuspension findReasonList(String reason,String performedBy) {
        MspPartnerRegSuspension type =  mspRegPartSusRepo.findReasonList(reason,performedBy);
        return type;
    }
    public ArrayList<MspPartnerRegSuspension> findAllBlacklisted() {
        ArrayList<MspPartnerRegSuspension> type = (ArrayList<MspPartnerRegSuspension>) mspRegPartSusRepo.findAllBlacklisted();
        return type;
    }

    public ArrayList<MspPartnerRegSuspension> findAllRevoked() {
        ArrayList<MspPartnerRegSuspension> type = (ArrayList<MspPartnerRegSuspension>) mspRegPartSusRepo.findAllRevoked();
        return type;
    }

    public boolean updateList(MspPartnerRegSuspension susp, String reason) {
        boolean out = true;

        try{
            MspPartnerRegSuspension s= mspRegPartSusRepo.findAllByReason(reason);
            s.setPerformedby(susp.getPerformedby());
            s.setReason(susp.getReason());
            s.setStatus(susp.isStatus());
//            s.setUpdBy(susp.getUserId());
            s.setSusUpdTime(APIConnection.getUTCCurrentDateTime());
            out = true;
        }catch (Exception e){
            e.printStackTrace();
            out = false;
        }
        return out;
    }


    public MspPartnerRegSuspension getReason(Integer sno) {
       return mspRegPartSusRepo.getReason(sno);
    }

    public void deleteById(String id) {
        mspRegPartSusRepo.deleteByReason(id);
    }
}
