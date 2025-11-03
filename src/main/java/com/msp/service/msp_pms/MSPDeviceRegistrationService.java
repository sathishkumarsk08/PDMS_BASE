package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.DeviceRegistrationPms;
import com.msp.pms.msppmsmodel.MSPDeviceModelRegistration;
import com.msp.pms.msppmsmodel.MSPPartnerRegistration;
import com.msp.pms.msppmsrepository.MSPDeviceRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPDeviceRegistrationService {

    @Autowired
    private MSPDeviceRegistrationRepository mspDeviceRegistrationRepository;

    public String maxUserid() {

        return mspDeviceRegistrationRepository.maxPartnerId();
    }

    public void save(DeviceRegistrationPms reg){
        mspDeviceRegistrationRepository.save(reg);
    }


    public List<DeviceRegistrationPms> regNewDevList(){
        return mspDeviceRegistrationRepository.regNewDevList();
    }

    public DeviceRegistrationPms editNewDev(String deviceId) {
        return mspDeviceRegistrationRepository.editNewDev(deviceId);
    }

    public List<DeviceRegistrationPms> regNewDevListByModel(String deviceId) {
        return mspDeviceRegistrationRepository.regNewDevListByModel(deviceId);
    }
}
