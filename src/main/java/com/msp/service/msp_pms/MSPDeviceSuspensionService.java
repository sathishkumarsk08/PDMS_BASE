package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.DeviceSuspended;
import com.msp.pms.msppmsrepository.MSPDeviceSuspensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPDeviceSuspensionService {

    @Autowired
//    @Qualifier("deviceSuspense")
    private MSPDeviceSuspensionRepository mspDeviceSuspensionRepository;

    public boolean save(DeviceSuspended policy){
        boolean out = true;
        try {
            mspDeviceSuspensionRepository.save(policy);
        } catch (Exception e) {
            e.printStackTrace();
            out = false;
        }

        return out;

    }

    public int checkPartnerId(String partnerId) {
        return mspDeviceSuspensionRepository.checkPartnerId(partnerId);
    }
    public String maxUserid() {
        return mspDeviceSuspensionRepository.maxPartnerId();
    }

    public List<DeviceSuspended> getExpiredDeviceSuspension(LocalDate yesterday, LocalDate today) {
        return mspDeviceSuspensionRepository.getExpiredDeviceSuspension(yesterday,today);
    }

    public String getReason(String partnerId) {
        return mspDeviceSuspensionRepository.getReason(partnerId);
    }

    public void delSusDev(String id) {
        mspDeviceSuspensionRepository.delSusDev(id);
    }

    public void deleteSusDevice(String id) {
        mspDeviceSuspensionRepository.deleteSusDevice(id);
    }
}
