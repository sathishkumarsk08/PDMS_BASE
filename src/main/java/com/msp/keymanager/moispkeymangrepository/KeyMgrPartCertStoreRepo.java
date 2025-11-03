package com.msp.keymanager.moispkeymangrepository;

import com.msp.keymanager.moispkeymanagermodel.KeyManagerPartnerCertStore;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeyMgrPartCertStoreRepo  extends CrudRepository<KeyManagerPartnerCertStore,String> {

//    @Query(nativeQuery = true, value="select * from keymgr.partner_cert_store where cert_subject like :organisation order by cr_dtimes desc limit 1")
//    void certdel(String organisation);
    @Query(nativeQuery = true, value="select * from keymgr.partner_cert_store where cert_subject like :organisation order by cr_dtimes asc limit 1")
    KeyManagerPartnerCertStore certdel(String organisation);
    @Query(nativeQuery = true, value="select * from keymgr.partner_cert_store where cert_subject like :org and partner_domain=:parttype")
    List<KeyManagerPartnerCertStore> certdeletion(String org, String parttype);

    @Query(nativeQuery = true, value="select * from keymgr.partner_cert_store where cert_id=:org")
    KeyManagerPartnerCertStore getCertIdDetails(String org);

    @Modifying(flushAutomatically = true)
    @Query(value = "delete from KeyManagerPartnerCertStore k where k.certSubject like :organizationName and k.certThumbprint =:thumbPrint")
    int deletePartnerCert(String thumbPrint, String organizationName);


    @Modifying(flushAutomatically = true)
    @Query(value = "delete from KeyManagerPartnerCertStore k where k.certId =:certId")
    int deletePartnerCertificate(String certId);
}
