package com.msp.mosip_pms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "misp_license" ,schema ="pms")
@Getter
@Setter
public class MispLicenseKey implements java.io.Serializable{

    @Id
    @Column(name = "misp_id")
    private String id;
    @Column(name = "license_key")
    private String key;
    @Column(name = "valid_from_date")
    private LocalDateTime validFrom;
    @Column(name = "valid_to_date")
    private LocalDateTime validTo;
    @Column(name = "is_active")
    private boolean active;
    @Column(name = "cr_by")
    private String crBy;
    @Column(name = "cr_dtimes")
    private  LocalDateTime crDtimes;
    @Column(name = "upd_by")
    private String updBy;
    @Column(name = "upd_dtimes")
    private LocalDateTime updDtimes;
    @Column(name = "is_deleted")
    private boolean deleted;
    @Column(name = "del_dtimes")
    private LocalDateTime delDtimes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDateTime getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDateTime validTo) {
        this.validTo = validTo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCrBy() {
        return crBy;
    }

    public void setCrBy(String crBy) {
        this.crBy = crBy;
    }

    public LocalDateTime getCrDtimes() {
        return crDtimes;
    }

    public void setCrDtimes(LocalDateTime crDtimes) {
        this.crDtimes = crDtimes;
    }

    public String getUpdBy() {
        return updBy;
    }

    public void setUpdBy(String updBy) {
        this.updBy = updBy;
    }

    public LocalDateTime getUpdDtimes() {
        return updDtimes;
    }

    public void setUpdDtimes(LocalDateTime updDtimes) {
        this.updDtimes = updDtimes;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public LocalDateTime getDelDtimes() {
        return delDtimes;
    }

    public void setDelDtimes(LocalDateTime delDtimes) {
        this.delDtimes = delDtimes;
    }
}
