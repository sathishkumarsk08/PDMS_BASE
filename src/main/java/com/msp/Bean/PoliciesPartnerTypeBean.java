package com.msp.Bean;

import com.msp.mosip_pms.model.PartnerRegistration;
import com.msp.mosip_pms.model.PolicyGroup;
import com.msp.mosip_pms.model.PolicyType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoliciesPartnerTypeBean {
    private List<PartnerRegistration> partner;
    private List<PolicyGroup> policyGroup;
    private List<PolicyType> policyType;
}
