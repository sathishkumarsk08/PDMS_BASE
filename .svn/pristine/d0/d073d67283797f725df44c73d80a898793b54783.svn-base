package com.msp.mosip_pms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="partner_policy_request",schema = "pms")
public class PartnerPolicyRequest implements java.io.Serializable {
    private String apiKey;
    private String partId;
    private String policyId;
    private String statusCode;
    private String requestDet;
    private LocalDateTime requestDtime;
    private String updBy;
    private LocalDateTime updDtimes;
    private String crBy;
    private LocalDateTime crDtime;
    private LocalDateTime delDtime;
    private boolean isDel;

    private int flag;

    @Column(name = "notifi_flag")
    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Id
    @Column(name = "id")

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
    @Column(name = "part_id")
    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }
    @Column(name = "policy_id")
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }
    @Column(name = "status_code")
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    @Column(name = "request_detail")
    public String getRequestDet() {
        return requestDet;
    }

    public void setRequestDet(String requestDet) {
        this.requestDet = requestDet;
    }
    @Column(name = "request_datetimes")
    public LocalDateTime getRequestDtime() {
        return requestDtime;
    }

    public void setRequestDtime(LocalDateTime requestDtime) {
        this.requestDtime = requestDtime;
    }
    @Column(name = "upd_by")
    public String getUpdBy() {
        return updBy;
    }

    public void setUpdBy(String updBy) {
        this.updBy = updBy;
    }
    @Column(name = "upd_dtimes")
    public LocalDateTime getUpdDtimes() {
        return updDtimes;
    }

    public void setUpdDtimes(LocalDateTime updDtimes) {
        this.updDtimes = updDtimes;
    }
    @Column(name = "cr_by")
    public String getCrBy() {
        return crBy;
    }

    public void setCrBy(String crBy) {
        this.crBy = crBy;
    }
    @Column(name = "cr_dtimes")
    public LocalDateTime getCrDtime() {
        return crDtime;
    }

    public void setCrDtime(LocalDateTime crDtime) {
        this.crDtime = crDtime;
    }
    @Column(name = "del_dtimes")
    public LocalDateTime getDelDtime() {
        return delDtime;
    }

    public void setDelDtime(LocalDateTime delDtime) {
        this.delDtime = delDtime;
    }
    @Column(name = "is_deleted")
    public boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(boolean isDel) {
        this.isDel = isDel;
    }

}
