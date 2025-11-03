package com.msp.service.msp_pms;

import com.msp.pms.msppmsmodel.MSPRoles;
import com.msp.pms.msppmsrepository.MSPRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MSPRoleService {

    @Autowired
    MSPRoleRepository mspRoleRepository;


    public ArrayList<MSPRoles> getRoleName() {
      return  mspRoleRepository.getRoleName();
    }

    public ArrayList<MSPRoles> getEditRoleName() {
        return  mspRoleRepository.getEditRoleName();
    }

    public String getRoleType(int roleId) {
        return mspRoleRepository.getRoleType(roleId);
    }
}
