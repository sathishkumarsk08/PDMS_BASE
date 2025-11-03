package com.msp.Bean;

import com.msp.mosip_pms.model.MispLicenseKey;
import com.msp.mosip_pms.model.PartnerRegistration;
import com.msp.pms.msppmsmodel.MSPDeviceModelRegistration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthPartnerRegistrationBean {
  private  PartnerRegistration  partner;
  private String selfAssess;
  private String otherDoc;
  private String disclose;
  private String pasApproval;
  private String selectedType;
  private String tspSelected;
  private List<Certificate> certificateList;
  private List<Policies> policiesList;
  private MSPDeviceModelRegistration device;
  private MispLicenseKey tspKey;
  private String susBlackStatus;

}
