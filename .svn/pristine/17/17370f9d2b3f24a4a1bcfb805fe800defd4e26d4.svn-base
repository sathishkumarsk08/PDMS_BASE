package com.msp.pms.msppmsmodel;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "partner_revoked" ,schema ="msppms")
public class partnerRevoked implements java.io.Serializable {
    private Integer Sno;
    private String Id;
    private String partnerId;
    private String Reason;
    private LocalDateTime Effdate;
    private LocalDateTime Enddate;
    private Integer createdBy;
    private LocalDateTime crDtTime;
    private Integer userId;
    private Integer updBy;
    private LocalDateTime upDtTime;
    private boolean isDeleted;
    private LocalDateTime delDateTime;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "revoke_sno")
    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    @Column(name = "revoke_id")
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
    @Column(name = "partner_id")
    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }
    @Column(name = "reason_for_revoke")
    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }
    @Column(name = "eff_date_rev")

    public LocalDateTime getEffdate() {
        return Effdate;
    }

    public void setEffdate(LocalDateTime effdate) {
        Effdate = effdate;
    }
    @Column(name = "end_date_rev")

    public LocalDateTime getEnddate() {
        return Enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        Enddate = enddate;
    }
    @Column(name = "rev_created_by")

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
    @Column(name = "rev_crdtimes")

    public LocalDateTime getCrDtTime() {
        return crDtTime;
    }

    public void setCrDtTime(LocalDateTime crDtTime) {
        this.crDtTime = crDtTime;
    }
    @Column(name = "user_id")

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    @Column(name = "rev_upd_by")

    public Integer getUpdBy() {
        return updBy;
    }

    public void setUpdBy(Integer updBy) {
        this.updBy = updBy;
    }
    @Column(name = "rev_updtimes")

    public LocalDateTime getUpDtTime() {
        return upDtTime;
    }

    public void setUpDtTime(LocalDateTime upDtTime) {
        this.upDtTime = upDtTime;
    }
    @Column(name = "is_deleted")

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
    @Column(name = "rev_del_dtimes")

    public LocalDateTime getDelDateTime() {
        return delDateTime;
    }

    public void setDelDateTime(LocalDateTime delDateTime) {
        this.delDateTime = delDateTime;
    }
}
