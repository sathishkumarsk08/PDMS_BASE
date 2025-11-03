package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.DeviceSuspended;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Component
@Repository
public interface MSPDeviceSuspensionRepository extends CrudRepository<DeviceSuspended, Integer> {

    @Query("select count(u) from DeviceSuspended u where u.deviceId=:partnerId ")
    int checkPartnerId(String partnerId);

    @Query(nativeQuery = true, value = "select sus_id from msppms.device_suspension order by sus_crdtimes desc limit 1")
    public String maxPartnerId();

    @Query(nativeQuery = true , value = "select * from msppms.device_suspension d where d.is_deleted =false and d.end_date_sus between cast(:yesterday as timestamp) and cast(:today as timestamp)")
    List<DeviceSuspended> getExpiredDeviceSuspension(LocalDate yesterday, LocalDate today);

    @Query(nativeQuery = true , value = "select reason_for_sus from msppms.device_suspension where device_id =:partnerId order by sus_crdtimes desc limit 1")
    String getReason(String partnerId);

    @Modifying
    @Query(nativeQuery = true , value = "update msppms.device_suspension set is_deleted = true where sus_id =:id")
    void delSusDev(String id);

    @Modifying
    @Query(nativeQuery = true , value = "update msppms.device_suspension set is_deleted = true where sus_id = (select sus_id from msppms.device_suspension where device_id =:id order by sus_crdtimes desc limit 1)")
    void deleteSusDevice(String id);
}
