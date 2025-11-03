package com.msp.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MasterPartnerBean {
    private String partnerType;
    private String partnerDesc;
    private Boolean policyRequired;
    private Boolean isActive;
    private String createdBy;
    private String logAction;
    private String userId;
    private String uploadBy;


}
