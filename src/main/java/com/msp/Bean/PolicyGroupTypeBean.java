package com.msp.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PolicyGroupTypeBean {

    private String policyTypeId;
    private String policyGroupId;
    private String organisation;
    private String policyTypeName;
    private String PolicyGroupName;
    private boolean status;
    private String typeSelected;
    private String partnerId;
    private String APIKey;
    private String mispKey;
    private String reason;
    private int flag;
    private String url;
    private String table;
//    public PolicyGroupPms getPolicyGroupId() {
//        return policyGroupId;
//    }
//
//    public void setPolicyGroupId(PolicyGroupPms policyGroupId) {
//        this.policyGroupId = policyGroupId;
//    }
//
//    public String getPolicyTypeId() {
//        return policyTypeId;
//    }
//
//    public void setPolicyTypeId(String policyTypeId) {
//        this.policyTypeId = policyTypeId;
//    }
//
//
//
//    public String getPolicyTypeName() {
//        return policyTypeName;
//    }
//
//    public void setPolicyTypeName(String policyTypeName) {
//        this.policyTypeName = policyTypeName;
//    }
//
//    public String getPolicyGroupName() {
//        return PolicyGroupName;
//    }
//
//    public void setPolicyGroupName(String policyGroupName) {
//        PolicyGroupName = policyGroupName;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
}
