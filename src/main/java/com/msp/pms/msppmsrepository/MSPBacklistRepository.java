package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.partnerblacklisted;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Repository
public interface MSPBacklistRepository extends CrudRepository<partnerblacklisted, Integer> {

    @Query(nativeQuery = true , value = "select * from msppms.partner_blacklisted p where p.is_deleted =false and p.end_date_bl between cast(:yesterday as timestamp) and cast(:today as timestamp)")
    ArrayList<partnerblacklisted> getExpiredPartnerBlackListed(LocalDate yesterday, LocalDate today);

    @Query(nativeQuery = true, value = "select bl_id from msppms.partner_blacklisted order by bl_crdtimes desc limit 1 ")
    public String maxPartnerId();

    @Query(nativeQuery = true , value = "select reason_for_bl from msppms.partner_blacklisted where partner_id =:partnerId order by bl_crdtimes desc limit 1")
    String getReason(String partnerId);

    @Modifying
    @Query(nativeQuery = true , value = "update msppms.partner_blacklisted set is_deleted = true where bl_id=:id")
    void delBlackPartner(String id);

    @Modifying
    @Query(nativeQuery = true , value = "update msppms.partner_blacklisted set is_deleted = true where bl_id = (select bl_id from msppms.partner_blacklisted where partner_id =:id order by bl_crdtimes desc limit 1)")
    void deleteBlackPartner(String id);
}
