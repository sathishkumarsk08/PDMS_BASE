package com.msp.mosip_pms.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "policy_group" ,schema ="pms")
public class PolicyGroup implements java.io.Serializable {

    private String id;
    private String  name;
    private String descr;
    private String  userId;
    private Boolean isActive;
    private String   crBy;
    private LocalDateTime crDtimes;
    private String  updBy;
    private LocalDateTime updDtimes;
    private Boolean  isDeleted;
    private LocalDateTime delDtimes;

    @Id
    @Column(name = "id", unique = true, nullable = false)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name="descr")
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
    @Column(name="user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Column(name="is_active")
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
    @Column(name="cr_by")
    public String getCrBy() {
        return crBy;
    }

    public void setCrBy(String crBy) {
        this.crBy = crBy;
    }
    @Column(name="cr_dtimes")
    public LocalDateTime getCrDtimes() {
        return crDtimes;
    }

    public void setCrDtimes(LocalDateTime crDtimes) {
        this.crDtimes = crDtimes;
    }
    @Column(name="upd_by")
    public String getUpdBy() {
        return updBy;
    }

    public void setUpdBy(String updBy) {
        this.updBy = updBy;
    }
    @Column(name="upd_dtimes")
    public LocalDateTime getUpdDtimes() {
        return updDtimes;
    }

    public void setUpdDtimes(LocalDateTime updDtimes) {
        this.updDtimes = updDtimes;
    }
    @Column(name="is_deleted")
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
    @Column(name="del_dtimes")
    public LocalDateTime getDelDtimes() {
        return delDtimes;
    }

    public void setDelDtimes(LocalDateTime delDtimes) {
        this.delDtimes = delDtimes;
    }
}
