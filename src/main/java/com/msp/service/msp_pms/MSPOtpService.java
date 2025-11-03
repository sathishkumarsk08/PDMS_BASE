package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.MSPOtpRequest;
import com.msp.pms.msppmsrepository.MSPOtpRequestRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPOtpService {

    @Autowired
   MSPOtpRequestRegistration mspOtpRequestRegistration;

    public boolean save(MSPOtpRequest policy) {
        boolean out = true;
        try {
            mspOtpRequestRegistration.save(policy);
        } catch (Exception e) {
            e.printStackTrace();
            out = false;
        }

        return out;

    }

}
