package com.msp.service.mosip_pms;

import com.msp.common.APIConnection;
import com.msp.mosip_pms.model.partner;
import com.msp.mosip_pms.repository.partnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

//@ComponentScan(basePackages = {"com.msp.service"})
//@ComponentScan(basePackages = {"com.msp.service"})
@Service
@Qualifier("TransactionManager")
@Transactional("TransactionManager")
public class partnerService  {

//    @PersistenceContext
//   @Autowired
//   @Qualifier("TransactionManager")
//    private EntityManager em;

//    @Qualifier("partnerRepository")
    @Autowired
    private partnerRepository partnerRepository;


    public List<partner> findAllpartners() {
        ArrayList<partner> type = (ArrayList<partner>) partnerRepository.findAllpartners();
        return type;

    }
    public List<partner> getPartnersType() {
        ArrayList<partner> type = (ArrayList<partner>) partnerRepository.getPartnersType();
        return type;

    }
    public partner save(partner type){
     return   partnerRepository.save(type);
    }

    public partner getPartnerTypeByCode(String partnerType) {
       return partnerRepository.getPartnerTypeByCode(partnerType);
    }

   public boolean updatePartnertype(partner user, String userid) {
            boolean out = true;
            try {
                partner s=partnerRepository.findAllByPartnerType(userid);
                s.setPartnerType(user.getPartnerType());
                s.setPartnerDesc(user.getPartnerDesc());
                s.setIsActive(user.getIsActive());
//                s.setUploadBy(user.getUserId());
                s.setUploadDatetime(APIConnection.getUTCCurrentDateTime());
                partnerRepository.save(s);

                out = true;
            } catch (Exception e) {
                e.printStackTrace();
                out = false;
            }

            return out;
        }

   public int getPartnerTypeDetails(String partnerType, String partnerDesc, boolean status){
        return partnerRepository.getPartnerTypeDetails(partnerType, partnerDesc, status );
   }

    public void deleteById(String id) {
         partnerRepository.deleteByPartnerType(id);
    }
}
