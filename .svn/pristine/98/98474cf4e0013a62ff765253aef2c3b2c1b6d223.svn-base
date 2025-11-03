package com.msp.service.msp_pms;

import com.msp.common.APIConnection;
import com.msp.mosip_pms.model.partner;
import com.msp.pms.msppmsmodel.PartnerType;
import com.msp.pms.msppmsrepository.MspPartnerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Qualifier("TransactionManager")
@Transactional("TransactionManager")
public class MspPartnerTypeService {
    @Autowired
    MspPartnerTypeRepository mspPartnerTypeRepository;

    public List<PartnerType> viewPartnerType(){
        return mspPartnerTypeRepository.viewPartnerType();
    }

    public PartnerType save(PartnerType partner){
        return  mspPartnerTypeRepository.save(partner);
    }

    public List<PartnerType> getPartnerTypeDetail(String partType) {
        return mspPartnerTypeRepository.getPartnerTypeId(partType);
    }


    public boolean updatePartnertype(PartnerType user, String userid) {
        boolean out = true;
        try {
            PartnerType s=mspPartnerTypeRepository.findAllByPartnerType(userid);
            s.setPartnerType(user.getPartnerType());
            s.setPartnerDesc(user.getPartnerDesc());
            s.setActive(user.isActive());
//            s.setUploadBy(user.getUserId());
            s.setUploadDatetime(APIConnection.getUTCCurrentDateTime());
            mspPartnerTypeRepository.save(s);

            out = true;
        } catch (Exception e) {
            e.printStackTrace();
            out = false;
        }

        return out;
    }

    public void deleteById(String id) {
        mspPartnerTypeRepository.deleteByPartnerType(id);
    }
}
