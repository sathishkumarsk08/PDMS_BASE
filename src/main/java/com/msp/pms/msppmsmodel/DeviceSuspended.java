package com.msp.pms.msppmsmodel;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "device_suspension" ,schema ="msppms")
public class DeviceSuspended implements java.io.Serializable {
    private Integer Sno;
    private String Id;
    private String deviceId;
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
    private Integer count;
    @Column (name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sus_sno")
    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    @Column(name = "sus_id")
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
    @Column(name = "device_id")
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }


    @Column(name = "reason_for_sus")
    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }
    @Column(name = "eff_date_sus")

    public LocalDateTime getEffdate() {
        return Effdate;
    }

    public void setEffdate(LocalDateTime effdate) {
        Effdate = effdate;
    }
    @Column(name = "end_date_sus")

    public LocalDateTime getEnddate() {
        return Enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        Enddate = enddate;
    }
    @Column(name = "sus_created_by")

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
    @Column(name = "sus_crdtimes")

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
    @Column(name = "sus_upd_by")

    public Integer getUpdBy() {
        return updBy;
    }

    public void setUpdBy(Integer updBy) {
        this.updBy = updBy;
    }
    @Column(name = "sus_updtimes")

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
    @Column(name = "sus_del_dtimes")

    public LocalDateTime getDelDateTime() {
        return delDateTime;
    }

    public void setDelDateTime(LocalDateTime delDateTime) {
        this.delDateTime = delDateTime;
    }
}
