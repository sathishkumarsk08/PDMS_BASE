package com.msp.service.msp_pms;

import com.msp.pms.msppmsrepository.MSPMailTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPMailTemplateService {

    @Autowired
    MSPMailTemplateRepository mspMailTemplate;
}
