package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.MSPSignCertStore;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MSPSignCertStoreRepository extends CrudRepository<MSPSignCertStore, String> {

    @Query(value = "Select t  from MSPSignCertStore t where t.performedBy=:performedBy and t.status IS NOT NULL order by t.updDtime desc ")
    ArrayList<MSPSignCertStore> getSignatureDetail(String performedBy);

    @Query(value = "Select t from MSPSignCertStore t where t.partId=:signstore order by t.updDtime desc  ")
    MSPSignCertStore getSignatureCertificate(String signstore);

    @Query(value = "Select t from MSPSignCertStore t where t.partId=:id order by t.updDtime desc ")
    MSPSignCertStore getdevicesignedcertificate(String id);

    @Modifying(flushAutomatically = true)
    @Query(value = "update  MSPSignCertStore u set  u.status=null where u.partId=:partnerId ")
    void certdel(String partnerId);
//    @Query(value = "Select t from MSPSignCertStore t where t.partId=:signstore order by t.updDtime desc  ")
//    MSPSignCertStore getSignatureCertificate(MSPSignCertStore signstore);


//    @Query(value = "Select *  from sign_cert_store  where =:id order by t.updDtime desc limit 1")
//    MSPSignCertStore getSignatureCertificate(String id);

}
