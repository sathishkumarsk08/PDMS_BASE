package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.MSPOtpRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public interface MSPOtpRequestRegistration extends CrudRepository<MSPOtpRequest,Integer> {

}
