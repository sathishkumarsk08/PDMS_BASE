package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.MSPMosipLicense;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Component
@Repository
public interface MSPMispLicenseRepository extends CrudRepository<MSPMosipLicense,String> {


    @Query("select u from MSPMosipLicense u where  u.crDtimes>=:strtDate and u.crDtimes<=:endDate order by u.crDtimes desc")
    List<MSPMosipLicense> getOnboardedLicense(LocalDateTime strtDate, LocalDateTime endDate);
    @Query("select count(u) from MSPMosipLicense u where  u.crDtimes>=:strtDate and u.crDtimes<=:endDate and u.active=true ")
    BigInteger getDashboarLicenseList(LocalDateTime strtDate, LocalDateTime endDate);

    @Query("select u from MSPMosipLicense u where u.validTo>=:fromThirty and u.validTo <=:toThirty order by u.crDtimes desc")
    List<MSPMosipLicense>getValidationSchedule(LocalDateTime fromThirty, LocalDateTime toThirty);
    @Query(value = "SELECT t  from MSPMosipLicense t where t.active=:status")
    List<MSPMosipLicense> viewPartnerLicense(boolean status);

    @Modifying
    @Query(value = "update  MSPMosipLicense u set u.active=:status where u.id= :id and u.key=:key")
    int UpdateStatus(boolean status,@Param("id") String id,String key);

    @Modifying
    @Query(value = "update  MSPMosipLicense u set u.active=false where u.id= :id")
    int UpdateStatusfalse(String id);

//    @Modifying
//    @Query(value = "update MSPMosipLicense t set t.deleted=true, t.delDtimes=current_timestamp where t.id=:partId and t.key=:licenseKey")
//    int DeleteLicenseKey(String partId, String licenseKey);

    @Modifying
    @Query(value = "delete from  MSPMosipLicense t  where t.id=:partId and t.key=:licenseKey")
    int DeleteLicenseKey(String partId, String licenseKey);
}
