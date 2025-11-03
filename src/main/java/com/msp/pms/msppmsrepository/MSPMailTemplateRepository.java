package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.MSPMailTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface MSPMailTemplateRepository extends CrudRepository<MSPMailTemplate, String> {
}
