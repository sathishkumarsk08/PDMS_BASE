package com.msp.Bean;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class UserdetailBean implements Serializable {

    private String userid;
    private String email;
    private String placeAssigned;
    private String firstnameEn;
    private String belongsTo;
    private String activeDeactive;
    private String lockstatus;
    private String loginStatus;
    private String roleIdName;
    private char activestatus;
    private int userRoleId;
    private String roleName;
    private List<ParentBean> userMenu;
    private RegistratedCount count;

}
