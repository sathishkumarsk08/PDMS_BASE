package com.msp.pms.msppmsmodel;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="partner_policy",schema = "msppms")
@Getter
@Setter
public class MSPPartnerPolicy implements java.io.Serializable{

    @Id
    @Column(name="policy_api_key")
    private String id;
    @Column(name="part_id")
    private String partId;
    @Column(name="policy_id")
    private String policyId;
    @Column(name="cr_by")
    private String crBy;
    @Column(name="upd_by")
    private String updBy;
    @Column(name="is_active")
    private boolean isActive;
    @Column(name="is_deleted")
    private boolean isDeleted;
    @Column(name="valid_to_datetime")
    private LocalDateTime validTo;
    @Column(name="valid_from_datetime")
    private LocalDateTime validFrom;
    @Column(name="upd_dtimes")
    private LocalDateTime updDtime;
    @Column(name="cr_dtimes")
    private LocalDateTime crtDtime;
    @Column(name="del_dtimes")
    private LocalDateTime delDtime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getPolicyId(String policyId) {
        return this.policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getCrBy() {
        return crBy;
    }

    public void setCrBy(String crBy) {
        this.crBy = crBy;
    }

    public String getUpdBy() {
        return updBy;
    }

    public void setUpdBy(String updBy) {
        this.updBy = updBy;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public LocalDateTime getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDateTime validTo) {
        this.validTo = validTo;
    }

    public LocalDateTime getValidFrom(LocalDateTime validFrom) {
        return this.validFrom;
    }

    public void setValidFrom(LocalDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDateTime getUpdDtime() {
        return updDtime;
    }

    public void setUpdDtime(LocalDateTime updDtime) {
        this.updDtime = updDtime;
    }

    public LocalDateTime getCrtDtime() {
        return crtDtime;
    }

    public void setCrtDtime(LocalDateTime crtDtime) {
        this.crtDtime = crtDtime;
    }

    public LocalDateTime getDelDtime() {
        return delDtime;
    }

    public void setDelDtime(LocalDateTime delDtime) {
        this.delDtime = delDtime;
    }
}
