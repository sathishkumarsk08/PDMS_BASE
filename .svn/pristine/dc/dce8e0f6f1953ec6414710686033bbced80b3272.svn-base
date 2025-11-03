package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.DeviceBlacklisted;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
@Repository
public interface MSPDeviceBlacklistedRepository extends CrudRepository<DeviceBlacklisted, Integer> {

    @Query(nativeQuery = true, value = "select bl_id from msppms.device_blacklisted order by bl_crdtimes desc limit 1 ")
    public String maxPartnerId();

    @Query(nativeQuery = true,value = "select * from msppms.device_blacklisted d where d.is_deleted =false and d.end_date_bl between cast(:yesterday as timestamp) and cast(:today as timestamp)")
    ArrayList<DeviceBlacklisted> getExpiredDeviceBlackListed(LocalDate yesterday, LocalDate today);

    @Query(nativeQuery = true , value = "select reason_for_bl from msppms.device_blacklisted where device_id =:partnerId order by bl_crdtimes desc limit 1")
    String getReason(String partnerId);

    @Modifying
    @Query(nativeQuery = true , value = "update msppms.device_blacklisted set is_deleted = true where bl_id =:id")
    void delBlackDev(String id);

    @Modifying
    @Query(nativeQuery = true , value = "update msppms.device_blacklisted set is_deleted = true where bl_id = (select bl_id from msppms.device_blacklisted where device_id =:id order by bl_crdtimes desc limit 1)")
    void deleteBlackDevice(String id);
}
