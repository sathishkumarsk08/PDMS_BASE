package com.msp.pms.msppmsmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "partner_type" ,schema ="msppms")
public class PartnerType implements java.io.Serializable{
    private String partnerType;
    private String partnerDesc;
    private Boolean policyRequired;
    private Boolean isActive;
    private String createdBy;
    private LocalDateTime createdDatetime;
    private String uploadBy;
    private LocalDateTime uploadDatetime;
    private Boolean isDeleted;
    private LocalDateTime deletedDatetime;
//    private String userId;
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }

    @Id
    @Column(name = "code")
    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }
    @Column(name = "partner_description")
    public String getPartnerDesc() {
        return partnerDesc;
    }

    public void setPartnerDesc(String partnerDesc) {
        this.partnerDesc = partnerDesc;
    }
    @Column(name = "is_policy_required")
    public Boolean isPolicyRequired() {
        return policyRequired;
    }

    public void setPolicyRequired(Boolean policyRequired) {
        this.policyRequired = policyRequired;
    }
    @Column(name = "is_active")
    public Boolean isActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
    @Column(name = "cr_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    @Column(name = "cr_dtimes")
    public LocalDateTime getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(LocalDateTime createdDatetime) {
        this.createdDatetime = createdDatetime;
    }
    @Column(name = "upd_by")
    public String getUploadBy() {
        return uploadBy;
    }

    public void setUploadBy(String uploadBy) {
        this.uploadBy = uploadBy;
    }
    @Column(name = "upd_dtimes")
    public LocalDateTime getUploadDatetime() {
        return uploadDatetime;
    }

    public void setUploadDatetime(LocalDateTime uploadDatetime) {
        this.uploadDatetime = uploadDatetime;
    }
    @Column(name = "is_deleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    @Column(name = "del_dtimes")
    public LocalDateTime getDeletedDatetime() {
        return deletedDatetime;
    }

    public void setDeletedDatetime(LocalDateTime deletedDatetime) {
        this.deletedDatetime = deletedDatetime;
    }
}
