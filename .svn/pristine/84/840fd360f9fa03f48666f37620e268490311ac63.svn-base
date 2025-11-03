package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.MSPPartnerPolicyRequest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public interface MSPPartnerPolicyRequestRepository extends CrudRepository<MSPPartnerPolicyRequest, String>{

    @Modifying(flushAutomatically = true)
    @Query(value = "update MSPPartnerPolicyRequest u set u.statusCode='approved' where u.apiKey=:apiKey ")
    void changeStatus(String apiKey);

//    @Query(nativeQuery = true, value="select pp.part_id, pr.orga_name from msppms.partner_policy_request as pp \n " +
//            "inner join msppms.partner_registration_old pr on pr.partner_id=pp.part_id \n" +
//            "where pp.status_code ='approved' and pp.part_id not in (select misp_id from msppms.misp_license) group by pp.part_id,pr.orga_name")
//    ArrayList<Object[]> getMispDetails();


    @Query(nativeQuery = true, value="select pr.partner_id, pr.orga_name, pr.partner_type from msppms.partner_registration_old pr\n" +
            "where pr.part_status ='approved' and pr.partner_type in ('Auth_Partner','MISP_Partner','Credential_Partner') and pr.partner_id not in (select misp_id from msppms.misp_license) \n" +
            "group by pr.partner_id,pr.orga_name,pr.partner_type\n" +
            "order by pr.part_crdtimes desc\t")
    ArrayList<Object[]> getMispDetails();

    @Query(nativeQuery = true,value = "select pt.policy_type_name,ppr.part_id ,ppr.id,ppr.status_code from msppms.partner_policy_request as ppr inner join msppms.policy_type as pt on ppr.policy_id = pt.policy_type_id where status_code ='InProgress'")
    ArrayList<Object[]> getApiRequestDetails();

    @Query ("select t from MSPPartnerPolicyRequest t order by t.flag asc")
    List<MSPPartnerPolicyRequest> notificationList();

    @Modifying(flushAutomatically = true)
    @Query(value = "update MSPPartnerPolicyRequest u set u.flag=1 where u.apiKey=:api and u.partId=:partner")
    void changeNotificationList(String partner,String api);

    @Query(value = "SELECT t  from MSPPartnerPolicyRequest t  where t.partId=''")
    List<MSPPartnerPolicyRequest> getPartnerId();

    @Query(value = "SELECT count(t)  from MSPPartnerPolicyRequest t  where t.flag=0")
    Long flagCount();
}
