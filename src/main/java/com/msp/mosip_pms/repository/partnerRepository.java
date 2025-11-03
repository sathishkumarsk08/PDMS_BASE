package com.msp.mosip_pms.repository;

import com.msp.mosip_pms.model.partner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface partnerRepository extends CrudRepository<partner, Boolean> {


    @Query(value = "SELECT R FROM partner R ")
    public List<partner> findAllpartners();

    @Query(value = "SELECT R FROM partner R where R.isActive=true and R.createdBy='superadmin'")
    public List<partner> getPartnersType();

    @Query(value = "SELECT R FROM partner R where  R.partnerType=:partnerType")
    partner getPartnerTypeByCode(String partnerType);

    partner findAllByPartnerType(String type);

    @Query(value = "SELECT count(R) FROM partner R where R.partnerType=:partnerType and R.partnerDesc=:partnerDesc and R.isActive=:status")
    int getPartnerTypeDetails(String partnerType, String partnerDesc, boolean status);

    void deleteByPartnerType(String id);
}
