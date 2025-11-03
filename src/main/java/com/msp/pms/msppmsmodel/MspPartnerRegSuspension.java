package com.msp.pms.msppmsmodel;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="partner_status",schema = "msppms")
public class MspPartnerRegSuspension {
    private Integer sno;
    private String reason;
    private boolean status;
    private String performedby;
    private String createdBy;
    private LocalDateTime crdtime;
    private String updBy;
    private LocalDateTime susUpdTime;
    private boolean isDel;
    private LocalDateTime susDelDtime;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "partner_sno")
    public Integer getSno() {
        return sno;
    }
    public void setSno(Integer sno) {
        this.sno = sno;
    }
    @Column (name = "reason")
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    @Column (name = "status")
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    @Column (name = "performed_by")
    public String getPerformedby() {
        return performedby;
    }
    public void setPerformedby(String performedby) {
        this.performedby = performedby;
    }

    @Column (name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    @Column (name = "cr_dtimes")
    public LocalDateTime getCrdtime() {
        return crdtime;
    }
    public void setCrdtime(LocalDateTime crdtime) {
        this.crdtime = crdtime;
    }
    @Column (name = "updated_by")
    public String getUpdBy() {
        return updBy;
    }
    public void setUpdBy(String updBy) {
        this.updBy = updBy;
    }
    @Column (name = "upd_dtimes")
    public LocalDateTime getSusUpdTime() {
        return susUpdTime;
    }
    public void setSusUpdTime(LocalDateTime susUpdTime) {
        this.susUpdTime = susUpdTime;
    }
    @Column (name = "is_deleted")
    public boolean isDel() {
        return isDel;
    }
    public void setDel(boolean del) {
        isDel = del;
    }
    @Column (name = "del_dtimes")
    public LocalDateTime getSusDelDtime() {
        return susDelDtime;
    }
    public void setSusDelDtime(LocalDateTime susDelDtime) {
        this.susDelDtime = susDelDtime;
    }
}
