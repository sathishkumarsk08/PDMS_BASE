package com.msp.pms.msppmsrepository;

import com.msp.mosip_pms.model.PolicyGroup;
import com.msp.pms.msppmsmodel.PolicyGroupPms;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Component
@Repository
public interface MSPPolicyGroupRepository extends CrudRepository<PolicyGroupPms, Integer> {

    @Query(value = "select t.id from PolicyGroupPms t where t.name=:policyGroupName")
      String getPolicyGroupId(String policyGroupName);

    @Query(value = "SELECT u FROM PolicyGroupPms u ")
     List<PolicyGroupPms> viewPolicyDetail();

    @Query(value = "SELECT u FROM PolicyGroupPms u where u.status='true' ")
    List<PolicyGroupPms> getPolicyGroupName();
    @Query(value = "SELECT t  from PolicyGroupPms t  where t.id=:policyid")
    List<PolicyGroupPms> getPolicygroupDetail(String policyid);

    PolicyGroupPms findAllById(String id);

    @Modifying(flushAutomatically = true)
    @Query(value = "delete from PolicyGroupPms u where u.id=:id ")
    void deleteById(String id);

    @Modifying(flushAutomatically = true)
    @Query(value = "update PolicyGroupPms u set u.id=:id  where u.id=:xyz ")
    void changeId(String id, String xyz);

    @Query(value = "select p from PolicyGroupPms p where p.name=:policyGroupName")
    Optional<PolicyGroupPms> getPolicyGroupByName(String policyGroupName);
}
