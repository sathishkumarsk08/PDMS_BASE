package com.msp.service.msp_pms;

import com.msp.common.APIConnection;
import com.msp.pms.msppmsmodel.MspDeviceStatus;
import com.msp.pms.msppmsmodel.MspPartnerRegSuspension;
import com.msp.pms.msppmsrepository.MspRegDevStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MspRegDeviceStatusService {
    @Autowired
    private MspRegDevStatusRepo mspRegDevStatusRepo;
    public void save(MspDeviceStatus device){
        mspRegDevStatusRepo.save(device);
    }

    public ArrayList<MspDeviceStatus> findAlldevice() {
        ArrayList<MspDeviceStatus> type = (ArrayList<MspDeviceStatus>) mspRegDevStatusRepo.findAllpartners();
        return type;
    }
    public ArrayList<MspDeviceStatus> findAllBlacklisted() {
        ArrayList<MspDeviceStatus> type = (ArrayList<MspDeviceStatus>) mspRegDevStatusRepo.findAllBlacklisted();
        return type;
    }

    public ArrayList<MspDeviceStatus> findAllRevoked() {
        ArrayList<MspDeviceStatus> type = (ArrayList<MspDeviceStatus>) mspRegDevStatusRepo.findAllRevoked();
        return type;
    }
    public MspDeviceStatus findReasonList(String reason,String performedBy) {
        MspDeviceStatus type =  mspRegDevStatusRepo.findReasonList(reason,performedBy);
        return type;
    }

    public int DeActivate(String reason){
        return mspRegDevStatusRepo.DeActivate(reason);
    }

    public MspDeviceStatus getReason(Integer sno) {
        return mspRegDevStatusRepo.getReason(sno);
    }
    public boolean updateList(MspDeviceStatus susp, String reason) {
        boolean out = true;

        try{
            MspDeviceStatus s= mspRegDevStatusRepo.findAllByReason(reason);
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

    public void deleteById(String id) {
        mspRegDevStatusRepo.deleteByReason(id);
    }
}
