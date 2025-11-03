package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.DeviceRevoked;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public interface MSPDeviceRevokeRepository extends CrudRepository<DeviceRevoked, Integer> {

    @Query(nativeQuery = true,value = "select d.revoke_id from msppms.device_revoked d order by d.rev_crdtimes desc limit 1")
    String maxUserid();

    @Query(nativeQuery = true , value = "select reason_for_revoke from msppms.device_revoked where device_id =:partnerId order by rev_crdtimes desc limit 1")
    String getReason(String partnerId);

    @Modifying
    @Query(nativeQuery = true , value = "update msppms.device_revoked set is_deleted = true where revoke_id = (select revoke_id from msppms.device_revoked where device_id =:id order by rev_crdtimes desc limit 1)")
    void deleteRevDevice(String id);
}
