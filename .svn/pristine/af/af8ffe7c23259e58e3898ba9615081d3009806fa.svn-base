package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.MspDeviceStatus;
import com.msp.pms.msppmsmodel.MspPartnerRegSuspension;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MspRegDevStatusRepo  extends CrudRepository<MspDeviceStatus, String> {
    @Query(value = "SELECT R FROM MspDeviceStatus R  where R.performedby='suspended' order by R.reason asc")
    public List<MspDeviceStatus> findAllpartners();

    @Query(value = "SELECT R FROM MspDeviceStatus R  where R.performedby='blacklisted' order by R.reason asc")
    public List<MspDeviceStatus> findAllBlacklisted();
    @Query(value = "SELECT R FROM MspDeviceStatus R  where R.performedby='revoked' order by R.reason asc")
    public List<MspDeviceStatus> findAllRevoked();

    @Modifying(flushAutomatically = true)
    @Query(value = "update MspDeviceStatus u set u.status=false  where u.reason=:reason")
    public int DeActivate(String reason);


    @Query(value = "SELECT R FROM MspDeviceStatus R  where R.performedby=:performedBy  and R.reason =:reason  order by R.reason asc")
    public MspDeviceStatus findReasonList(String reason, String performedBy);

    MspDeviceStatus findAllByReason(String type);

    @Query(value = "SELECT R FROM MspDeviceStatus R  where R.sno=:sno")
    MspDeviceStatus getReason(Integer sno);

    void deleteByReason(String id);
}
