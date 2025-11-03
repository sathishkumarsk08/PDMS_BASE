package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.NotificationSystem;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationSystemRepository extends CrudRepository<NotificationSystem, Integer> {

    @Query(value = "SELECT count(t)  from NotificationSystem t  where t.flag=0 and t.crBy = :loginUserId")
    Long flagCount(String loginUserId);

    @Query(value = "SELECT t from NotificationSystem t  where t.flag=0 and t.active= true and t.crBy =:loginUserId order by t.crdtimes desc")
    List<NotificationSystem> notificationList(String loginUserId);

    @Query(value = "SELECT t from NotificationSystem t  where t.flag=0 and t.active= true and t.eventType='Policy' and t.crBy is null order by t.crdtimes desc")
    List<NotificationSystem> notificationListPolicyAdmin();

    @Query(value = "SELECT t from NotificationSystem t  where t.flag=0 and t.active= true order by t.crdtimes desc")
    List<NotificationSystem> notificationListSuperAdmin();

    @Modifying(flushAutomatically = true)
    @Query(value = "update NotificationSystem u set u.flag=1 where u.sno=:sno")
    void changeNotificationList(int sno);
}
