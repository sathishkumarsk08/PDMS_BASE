package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.MSPSignCertStore;
import com.msp.pms.msppmsrepository.MSPSignCertStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPSignCertStoreService {
    @Autowired
    MSPSignCertStoreRepository mspSignCertStoreRepository;

    public void save(MSPSignCertStore cert) {
        mspSignCertStoreRepository.save(cert);
    }

    public void delete(MSPSignCertStore cert) {
        mspSignCertStoreRepository.delete(cert);
    }

    public ArrayList<MSPSignCertStore> getSignatureDetail(String performedBy) {
        return mspSignCertStoreRepository.getSignatureDetail(performedBy);
    }
//    public MSPSignCertStore getSignatureCertificate(String signstore) {
//        return mspSignCertStoreRepository.getSignatureCertificate(signstore);
//    }

    public MSPSignCertStore getdevicesignedcertificate(String id) {
        return mspSignCertStoreRepository.getdevicesignedcertificate(id);
    }

//    public MSPSignCertStore getSignatureCertificate(String id) {
//        return mspSignCertStoreRepository.getSignatureCertificate(id);
//    }
    public void certdel(String partnerId) {
     mspSignCertStoreRepository.certdel(partnerId);
}

    public MSPSignCertStore getSignatureCertificate(String signstore) {
        return mspSignCertStoreRepository.getSignatureCertificate(signstore);
    }
}
