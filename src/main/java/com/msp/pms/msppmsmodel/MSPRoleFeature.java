package com.msp.pms.msppmsmodel;

import javax.persistence.*;

@Entity
@Table(name = "role_feature", schema = "mspms")
public class MSPRoleFeature {
    private Integer id;
    private Integer roleId;
    private Integer featureId;
    private String data;
    @Id
    @Column(name = "role_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "role_id")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    @Column(name = "feature_id")
    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }
    @Column(name = "additional_data")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
