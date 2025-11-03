package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.MspPartnerRegSuspension;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MspRegPartSusRepo extends CrudRepository<MspPartnerRegSuspension, String>{

    @Query(value = "SELECT R FROM MspPartnerRegSuspension R  where R.performedby='suspended'    order by R.reason asc")
    public List<MspPartnerRegSuspension> findAllpartners();

    @Query(value = "SELECT R FROM MspPartnerRegSuspension R  where R.performedby='blacklisted'  order by R.reason asc")
    public List<MspPartnerRegSuspension> findAllBlacklisted();

    @Query(value = "SELECT R FROM MspPartnerRegSuspension R  where R.performedby='revoked'  order by R.reason asc")
    public List<MspPartnerRegSuspension> findAllRevoked();

    @Modifying(flushAutomatically = true)
    @Query(value = "update MspPartnerRegSuspension u set u.status=false where u.reason=:reason")
    public int DeActivate(String reason);

    @Query(value = "SELECT R FROM MspPartnerRegSuspension R  where R.performedby=:performedBy  and R.reason =:reason  order by R.reason asc")
    public MspPartnerRegSuspension findReasonList(String reason,String performedBy);

    MspPartnerRegSuspension findAllByReason(String type);

    @Query(value = "SELECT R FROM MspPartnerRegSuspension R  where R.sno=:sno")
    MspPartnerRegSuspension getReason(Integer sno);

    void deleteByReason(String id);
}
