package com.msp.service.mosip_pms;

import com.msp.common.APIConnection;
import com.msp.mosip_pms.model.PolicyGroup;
import com.msp.mosip_pms.model.partner;
import com.msp.mosip_pms.repository.PolicyGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Qualifier("TransactionManager")
@Transactional("TransactionManager")
public class PolicyGroupService {

    @Autowired
    PolicyGroupRepository policyGroupRepository;
//
//    @Autowired
//    MSPPolicyGroupService mspPolicyGroupRepository;

    public List<PolicyGroup> getPolicyGroupName(){
        return policyGroupRepository.getPolicyGroupName();
    }


    public String getPolicyGroupId(String policyGrp) {
        return policyGroupRepository.getPolicyGroupId(policyGrp);
    }

    public String getPolicyGroupDetail(String policyGrp) {
        return policyGroupRepository.getPolicyGroupName(policyGrp);
    }

    public  List<PolicyGroup> getAllPolicyGroup(List<String> policyGroupId){
        return policyGroupRepository.findAllByIdIn(policyGroupId);
    }

    public List<PolicyGroup> getPolicygroupDetail(String policyid) {
        return policyGroupRepository.getPolicygroupDetail(policyid);
    }

    public PolicyGroup editPolicygroupId(String pgId) {
        return policyGroupRepository.editPolicygroupId(pgId);
    }


    public int getPolicyGroupDetails(String name, String id){
        return policyGroupRepository.getPolicyGroupDetails(name,id);
    }

    public boolean updateMOSIPPolicyGroup(PolicyGroup user, String id) {
            boolean out = true;
            try {
                PolicyGroup s=policyGroupRepository.findAllById(id);
                s.setName(user.getName());
                s.setDescr(user.getDescr());
                s.setActive(user.getActive());
                s.setUpdBy(user.getUpdBy());
                s.setUpdDtimes(APIConnection.getUTCCurrentDateTime());

                policyGroupRepository.save(s);

                out = true;
            } catch (Exception e) {
                e.printStackTrace();
                out = false;
            }

            return out;
        }

    public List<PolicyGroup> getListPolicyGroupName() {

            return policyGroupRepository.getListPolicyGroupName();
        }
        public List<PolicyGroup> getListPolicyGroupName(String userId) {

            return policyGroupRepository.getListPolicyGroupName(userId);
        }

    public void changeUserId(String userId, String id) {
         policyGroupRepository.changeUserId(userId,id);
    }

    public void deleteById(String id) {
        policyGroupRepository.deleteById(id);
    }

    public int getCount(String userId) {
        return policyGroupRepository.getCount(userId);
    }

    public int checkPolicy(String userId) {
        return policyGroupRepository.checkPolicy(userId);
    }
    public int getRoleBasedCount() {
        return policyGroupRepository.getCount();
    }

//    public void updateCrBy(String id, String userId) {
//         policyGroupRepository.updateCrBy(id, userId);
//    }
}


//    public void save(PolicyGroupPms policy){
//        mspPolicyGroupRepository.save(policy);
//    }


//
//    public List<PolicyGroupPms> viewPolicyDetail(){
//        return policyGroupRepository.viewPolicyDetail();
//    }


//    public void save(PolicyGroup policy){
//
//
//        mspPolicyGroupRepository.save(policy);
//    }



