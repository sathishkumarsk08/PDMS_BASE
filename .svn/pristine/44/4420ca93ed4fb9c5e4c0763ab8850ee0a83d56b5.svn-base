package com.msp.service;

import com.msp.Bean.Certificate;
import com.msp.keymanager.moispkeymanagermodel.KeyManagerCaCertStore;
import com.msp.keymanager.moispkeymangrepository.KeyManagrCaCertStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Qualifier("moispkeymangTransactionManager")
@Transactional("moispkeymangTransactionManager")
public class KeyMgrCaCertStoreService {
    @Autowired
    KeyManagrCaCertStoreRepository keyManagrCaCertStoreRepository;


    public List<KeyManagerCaCertStore> getOrganisationRecord(String organisation, String domain) {
        System.out.println("testing" +organisation);
        return keyManagrCaCertStoreRepository.getOrganisationRecord(organisation,domain);
    }
    public KeyManagerCaCertStore certdel(String organisation) {
      return   keyManagrCaCertStoreRepository.certdel(organisation);
    }
    public List<KeyManagerCaCertStore> certdeletion(String org, String type) {
        return   keyManagrCaCertStoreRepository.certdeletion(org,type);
    }

    public void Delete(String val) {
        keyManagrCaCertStoreRepository.deleteById(val);
        System.out.println("deleted successfully"+val);
    }

   public List<KeyManagerCaCertStore> findByPartnerDomain(String partnerDomain){
       return keyManagrCaCertStoreRepository.findByPartDomain(partnerDomain);
   }

    public int deleteCert(String thumbPrint, String organizationName) {
       return keyManagrCaCertStoreRepository.deleteCert(thumbPrint,"%O="+organizationName+",%");
    }


    public HashMap<String , KeyManagerCaCertStore> separateCert(List<KeyManagerCaCertStore> list){

//        System.out.println("List Cert " + list);
        System.out.println("List Cert size" + list.size());

        System.out.println();

        HashMap<String , KeyManagerCaCertStore> certificates = new HashMap<>();

        for (KeyManagerCaCertStore certificate : list) {

            if (certificate.certId.equals(certificate.issuerId) && !certificate.certIssuer.contains("www.mosip")) {
//                System.out.println("Root Certificate  " + list.get(i));
                certificates.put("Root", certificate);

            } else if (!(certificate.certId.equals(certificate.issuerId)) && !certificate.certIssuer.contains("www.mosip")) {
//                System.out.println("Intermediate Certificate  " + list.get(i));
                certificates.put("Intermediate", certificate);
            } else if (!(certificate.certId.equals(certificate.issuerId)) && certificate.certIssuer.contains("www.mosip")) {
//                System.out.println("Signed Certificate  " + list.get(i));
                certificates.put("Signed", certificate);
            }

        }

        return certificates;

    }

    public int deleteCertificate(String[] certId) {
     return keyManagrCaCertStoreRepository.deleteCertificate(certId);
    }
}
