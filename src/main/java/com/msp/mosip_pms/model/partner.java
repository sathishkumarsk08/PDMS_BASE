package com.msp.mosip_pms.model;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="partner_type",schema ="pms")
public class partner implements Serializable {

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

//    private  String userId;
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }

    public partner ()
{}

public partner (String partnerType, String partnerDesc, Boolean policyRequired, Boolean isActive,
                String createdBy, String createdDatetime, String uploadBy, String uploadDatetime, Boolean isDeleted,
                String deletedDatetime, String status){
    this.partnerType= partnerType;
    this.partnerDesc = partnerDesc;
    this.policyRequired =policyRequired;
    this.isActive = isActive;
    this.createdBy = createdBy;
    this.createdDatetime = LocalDateTime.parse(createdDatetime);
    this.uploadBy = uploadBy;
    this. uploadDatetime = LocalDateTime.parse(uploadDatetime);
    this.isDeleted = isDeleted;
    this. deletedDatetime = LocalDateTime.parse(deletedDatetime);

}



    @Id
    @Column(name = "code", unique = true, nullable = false)
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
    public Boolean getPolicyRequired() {
        return policyRequired;
    }

    public void setPolicyRequired(Boolean policyRequired) {
        this.policyRequired = policyRequired;
    }

    @Column(name = "is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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
