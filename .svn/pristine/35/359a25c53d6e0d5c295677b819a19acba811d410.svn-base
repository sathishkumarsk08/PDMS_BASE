package com.msp.pms.msppmsmodel;

import javax.persistence.*;

@Entity
@Table(name = "roles", schema = "msppms")
public class MSPRoles {
    private Integer id;
    private String name;
    private  String predefined;
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
@Column(name = "role_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "predefined")
    public String getPredefined() {
        return predefined;
    }

    public void setPredefined(String predefined) {
        this.predefined = predefined;
    }
}
