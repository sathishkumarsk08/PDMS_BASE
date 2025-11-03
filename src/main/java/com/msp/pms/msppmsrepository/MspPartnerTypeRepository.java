package com.msp.pms.msppmsrepository;

import com.msp.mosip_pms.model.partner;
import com.msp.pms.msppmsmodel.PartnerType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface MspPartnerTypeRepository extends CrudRepository<PartnerType, String> {
    @Query(value = "SELECT u FROM PartnerType u ")
    public List<PartnerType> viewPartnerType();
    @Query(value = "SELECT t  from PartnerType t  where t.partnerType=:partType")
    List<PartnerType> getPartnerTypeId(String partType);

    PartnerType findAllByPartnerType(String type);

    void deleteByPartnerType(String id);
}
