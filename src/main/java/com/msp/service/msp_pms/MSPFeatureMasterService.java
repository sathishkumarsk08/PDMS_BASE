package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.MSPFeatureMaster;
import com.msp.pms.msppmsrepository.MSPFeatureMasterRepoistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("mspPmsTransactionManager")
@Transactional("mspPmsTransactionManager")
public class MSPFeatureMasterService {

    @Autowired
    private MSPFeatureMasterRepoistory mspFeatureMasterRepoistory;

    public List<MSPFeatureMaster> getParentManu(int userRole) {
      return  mspFeatureMasterRepoistory.getParentManu(userRole);
    }
    public List<Integer> getParentManuId(int userRole) {
      return  mspFeatureMasterRepoistory.getParentManuId(userRole);
    }

    public List<MSPFeatureMaster> getSubMenu(int roleId, List<Integer> parentId) {
        return  mspFeatureMasterRepoistory.getSubMenu(roleId ,parentId);

    }   public List<Integer> getSubMenuId(int roleId, List<Integer> parentId) {
        return  mspFeatureMasterRepoistory.getSubMenuId(roleId ,parentId);
    }

    public List<MSPFeatureMaster> getSubMenuChild(int roleId,List<Integer> parentId) {
        return  mspFeatureMasterRepoistory.getSubMenuChild(roleId ,parentId);
    }
}
