package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.partnerRevoked;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public interface MSPPartnerRevokeRepository extends CrudRepository<partnerRevoked, Integer> {

    @Query(nativeQuery = true,value = "select p.revoke_id from msppms.partner_revoked p order by p.rev_crdtimes desc limit 1")
    String maxUserid();

    @Query(nativeQuery = true , value = "select reason_for_revoke from msppms.partner_revoked where partner_id =:partnerId order by rev_crdtimes desc limit 1")
    String getReason(String partnerId);

    @Modifying
    @Query(nativeQuery = true , value = "update msppms.partner_revoked set is_deleted = true where revoke_id = (select revoke_id from msppms.partner_revoked where partner_id =:id order by rev_crdtimes desc limit 1)")
    void deleteRevPartner(String id);
}
