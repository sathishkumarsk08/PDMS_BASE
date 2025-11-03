package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.MSPRoles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Component
@Repository
public interface MSPRoleRepository extends CrudRepository<MSPRoles,Integer> {

    @Query(value="select u from MSPRoles u where u.id not in (1,4) order by u.id")
     public ArrayList<MSPRoles> getRoleName();

    @Query(value="select u from MSPRoles u where u.id not in (4) order by u.id")
    public ArrayList<MSPRoles> getEditRoleName();

    @Query(value="select u.name from MSPRoles u where u.id=:roleId ")
    String getRoleType(int roleId);
}
