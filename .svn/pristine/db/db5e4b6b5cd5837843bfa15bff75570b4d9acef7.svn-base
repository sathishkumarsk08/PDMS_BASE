package com.msp.pms.msppmsrepository;


import com.msp.pms.msppmsmodel.MSPPartnerPolicy;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
//@Repository("msp_partnerpolicy")
public interface MSPPartnerPolicyRepository extends CrudRepository<MSPPartnerPolicy,String> {



    @Query(nativeQuery = true, value="  select pp.part_id, pp.policy_api_key,pp.policy_id,ml.license_key,ml.is_active from msppms.partner_policy as pp\n" +
            "    inner join msppms.misp_license ml on ml.misp_id=pp.part_id\n" +
            "    where ml.is_active ='true' and pp.is_active='true' order by ml.cr_dtimes desc")
    ArrayList<Object[]> getAPIMispDetails();

    @Query("select u from MSPPartnerPolicy u where  u.crtDtime>=:strtDate and u.crtDtime<=:endDate order by u.crtDtime desc")
    List<MSPPartnerPolicy> getOnboardedApi(LocalDateTime strtDate, LocalDateTime endDate);

    @Query("select count(u) from MSPPartnerPolicy u where  u.crtDtime>=:strtDate and u.crtDtime<=:endDate and u.isActive=true ")
    BigInteger getDashboardAPIList(LocalDateTime strtDate, LocalDateTime endDate);

    @Query(value = "SELECT t  from MSPPartnerPolicy t where t.isActive=:status")
    List<MSPPartnerPolicy> viewPartnerApi(boolean status);

    @Modifying
    @Query(value = "update  MSPPartnerPolicy u set u.isActive=:status where u.partId= :id and u.id= :apiKey")
    int UpdateStatus(String id, boolean status, String apiKey);

//    @Modifying
//    @Query(value = "update MSPPartnerPolicy t set t.isDeleted=true,t.delDtime=current_timestamp where t.partId=:partId and t.id=:apikey")
//    int DeleteApiKey(String partId, String apikey);

    @Modifying
    @Query(value = "delete from MSPPartnerPolicy t   where t.partId=:partId and t.id=:apikey")
    int DeleteApiKey(String partId, String apikey);
}
