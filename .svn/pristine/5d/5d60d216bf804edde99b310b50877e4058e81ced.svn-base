package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.AuditLogs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface MSPAuditLogRepository extends CrudRepository<AuditLogs,Integer> {


    @Query(nativeQuery = true, value = "SELECT log_id from msppms.app_msppms_log ORDER BY log_dtimes DESC limit 1 ")
    public String maxUserid();



}
