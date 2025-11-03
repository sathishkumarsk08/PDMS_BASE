package com.msp.service;

import com.msp.ida.mosipidamodel.IDACaCertStore;
import com.msp.ida.mosipidarepository.IDACaCertStoreRepository;
import com.msp.keymanager.moispkeymanagermodel.KeyManagerPartnerCertStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Qualifier("mosipidaTransactionManager")
@Transactional("mosipidaTransactionManager")
public class IDACaCertStoreService {

    @Autowired
    IDACaCertStoreRepository idaCaCertStoreRepository;


    public void save(IDACaCertStore store) {
        idaCaCertStoreRepository.save(store);
    }

    public IDACaCertStore certdel(String organisation) {
        return   idaCaCertStoreRepository.certdel(organisation);
    }

    public void Delete(String val) {
        idaCaCertStoreRepository.deleteById(val);
    }

    public List<IDACaCertStore> certdeletion(String org, String type) {
        return   idaCaCertStoreRepository.certdeletion(org,type);
    }

    public int deleteCertificate(String certId) {
        return idaCaCertStoreRepository.deleteCertificate(certId);
    }

    public int isCertificateAlreadyExist(String certId) {
        return idaCaCertStoreRepository.isCertificateAlreadyExist(certId);
    }
}
