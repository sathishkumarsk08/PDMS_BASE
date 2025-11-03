package com.msp.pms.msppmsrepository;

import com.msp.pms.msppmsmodel.MSPFeatureMaster;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface MSPFeatureMasterRepoistory extends CrudRepository<MSPFeatureMaster,Integer> {


    @Query(nativeQuery = true,value="SELECT * FROM msppms.feature_master as fm\n" +
            "\tleft join msppms.role_feature as role\n" +
            "\ton fm.feature_id = role.feature_id where fm.parant_id=0 and fm.is_menu =0 and role.role_id=:userRole order by fm.feature_order")
    List<MSPFeatureMaster> getParentManu(int userRole);

    @Query(nativeQuery = true,value="SELECT fm.feature_id FROM msppms.feature_master as fm\n" +
            "\tleft join msppms.role_feature as role\n" +
            "\ton fm.feature_id = role.feature_id where fm.parant_id=0 and fm.is_menu =0 and role.role_id=:userRole order by fm.feature_order")
    List<Integer> getParentManuId(int userRole);

    @Query(nativeQuery = true,value="SELECT * FROM msppms.feature_master as fm\n" +
            "\tleft join msppms.role_feature as role\n" +
            "\ton fm.feature_id = role.feature_id where fm.parant_id=:parentId and fm.is_menu =0 and role.role_id=:roleId and fm.menu_type='2' order by fm.parant_id,fm.feature_order")
    List<MSPFeatureMaster> getSubMenuOld(int roleId, int parentId);

    @Query(nativeQuery = true,value="SELECT * FROM msppms.feature_master as fm\n" +
            "\tleft join msppms.role_feature as role\n" +
            "\ton fm.feature_id = role.feature_id where fm.parant_id in :parentId and fm.is_menu =0 and role.role_id=:roleId and fm.menu_type='3' order by fm.parant_id,fm.feature_order ")
    List<MSPFeatureMaster> getSubMenuChild(int roleId,List<Integer> parentId);

    @Query(nativeQuery = true,value="SELECT * FROM msppms.feature_master as fm\n" +
            "\tleft join msppms.role_feature as role\n" +
            "\ton fm.feature_id = role.feature_id where fm.parant_id in :parentId and fm.is_menu =0 and role.role_id=:roleId and fm.menu_type='2' order by fm.parant_id,fm.feature_order")
    List<MSPFeatureMaster> getSubMenu(int roleId, List<Integer> parentId);

    @Query(nativeQuery = true,value="SELECT fm.feature_id FROM msppms.feature_master as fm\n" +
            "\tleft join msppms.role_feature as role\n" +
            "\ton fm.feature_id = role.feature_id where fm.parant_id in :parentId and fm.is_menu =0 and role.role_id=:roleId and fm.menu_type='2' order by fm.parant_id,fm.feature_order")
    List<Integer> getSubMenuId(int roleId, List<Integer> parentId);
}
