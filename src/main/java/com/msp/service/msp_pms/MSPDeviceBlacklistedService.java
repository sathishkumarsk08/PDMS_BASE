package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.DeviceBlacklisted;
import com.msp.pms.msppmsrepository.MSPDeviceBlacklistedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPDeviceBlacklistedService {

    @Autowired
    private MSPDeviceBlacklistedRepository mspDeviceBlacklistedRepository;

    public boolean save(DeviceBlacklisted policy){
        boolean out = true;
        try {
            mspDeviceBlacklistedRepository.save(policy);
        } catch (Exception e) {
            e.printStackTrace();
            out = false;
        }

        return out;

    }
    public String maxUserid() {
        return mspDeviceBlacklistedRepository.maxPartnerId();
    }

    public ArrayList<DeviceBlacklisted> getExpiredDeviceBlackListed(LocalDate yesterday, LocalDate today) {
        return mspDeviceBlacklistedRepository.getExpiredDeviceBlackListed(yesterday,today);
    }

    public String getReason(String partnerId) {
        return mspDeviceBlacklistedRepository.getReason(partnerId);
    }

    public void delBlackDev(String id) {
        mspDeviceBlacklistedRepository.delBlackDev(id);
    }

    public void deleteBlackDevice(String id) {
        mspDeviceBlacklistedRepository.deleteBlackDevice(id);
    }
}
