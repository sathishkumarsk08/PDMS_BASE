package com.msp.pms.msppmsmodel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification_system" ,schema ="msppms")
@Getter
@Setter
public class NotificationSystem implements java.io.Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sno")
    private int sno;
    @Column(name = "flag")
    private int flag;
    @Column(name = "cr_dtimes")
    private LocalDateTime crdtimes;
    @Column(name = "content")
    private String content;
    @Column(name = "partner_id")
    private String partnerId;
    @Column(name = "auth_type")
    private String authType;
    @Column(name = "policy_type_id")
    private String policyTypeId;
    @Column(name = "partner_policy_request")
    private String partnerPolicyRqt;
    @Column(name = "is_active")
    private boolean active;
    @Column(name = "cr_by")
    private String crBy;
    @Column(name = "notification_type")
    private String type;
    @Column(name = "url")
    private String url;
    @Column(name = "image_icon")
    private String icon;
    @Column(name = "event_type")
    private String eventType;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCrBy() {
        return crBy;
    }

    public void setCrBy(String crBy) {
        this.crBy = crBy;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public LocalDateTime getCrdtimes() {
        return crdtimes;
    }

    public void setCrdtimes(LocalDateTime crdtimes) {
        this.crdtimes = crdtimes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getPolicyTypeId() {
        return policyTypeId;
    }

    public void setPolicyTypeId(String policyTypeId) {
        this.policyTypeId = policyTypeId;
    }

    public String getPartnerPolicyRqt() {
        return partnerPolicyRqt;
    }

    public void setPartnerPolicyRqt(String partnerPolicyRqt) {
        this.partnerPolicyRqt = partnerPolicyRqt;
    }




}
