package com.msp.keymanager.moispkeymanagermodel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "partner_cert_store",schema = "keymgr")
@Getter
@Setter
@ToString
public class KeyManagerPartnerCertStore {

    @Id
    @Column(name="cert_id")
    public String certId;
    @Column(name="cert_subject")
    public String certSubject;
    @Column(name="cert_issuer")
    public String certIssuer;
    @Column(name="issuer_id")
    public String issuerId;
    @Column(name="cert_not_before")
    public LocalDateTime certBefore;
    @Column(name="cert_not_after")
    public LocalDateTime certAfter;
    @Column(name="partner_domain")
    public String partDomain;
    @Column(name="cert_data")
    public String certData;
    @Column(name="signed_cert_data")
    public String signedCert;
    @Column(name="key_usage")
    public String keyusage;
    @Column(name="organization_name")
    public String orgname;
    @Column(name="cert_thumbprint")
    public String certThumbprint;
    @Column(name="cert_serial_no")
    public String certSerial;
    @Column(name="cr_by")
    public String crBy;
    @Column(name="cr_dtimes")
    public LocalDateTime crDTimes;
    @Column(name="upd_by")
    public String updBy;
    @Column(name="upd_dtimes")
    public LocalDateTime updDTimes;
    @Column(name="del_dtimes")
    public LocalDateTime delDTime;
    @Column(name="is_deleted")
    public boolean isDeleted;

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getCertSubject() {
        return certSubject;
    }

    public void setCertSubject(String certSubject) {
        this.certSubject = certSubject;
    }

    public String getCertIssuer() {
        return certIssuer;
    }

    public void setCertIssuer(String certIssuer) {
        this.certIssuer = certIssuer;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public LocalDateTime getCertBefore() {
        return certBefore;
    }

    public void setCertBefore(LocalDateTime certBefore) {
        this.certBefore = certBefore;
    }

    public LocalDateTime getCertAfter() {
        return certAfter;
    }

    public void setCertAfter(LocalDateTime certAfter) {
        this.certAfter = certAfter;
    }

    public String getSignedCert() {
        return signedCert;
    }

    public void setSignedCert(String signedCert) {
        this.signedCert = signedCert;
    }

    public String getCertData() {
        return certData;
    }

    public void setCertData(String certData) {
        this.certData = certData;
    }

    public String getCertThumbprint() {
        return certThumbprint;
    }

    public void setCertThumbprint(String certThumbprint) {
        this.certThumbprint = certThumbprint;
    }

    public String getCertSerial() {
        return certSerial;
    }

    public void setCertSerial(String certSerial) {
        this.certSerial = certSerial;
    }

    public String getPartDomain() {
        return partDomain;
    }

    public void setPartDomain(String partDomain) {
        this.partDomain = partDomain;
    }

    public String getCrBy() {
        return crBy;
    }

    public void setCrBy(String crBy) {
        this.crBy = crBy;
    }

    public LocalDateTime getCrDTimes() {
        return crDTimes;
    }

    public void setCrDTimes(LocalDateTime crDTimes) {
        this.crDTimes = crDTimes;
    }

    public String getUpdBy() {
        return updBy;
    }

    public void setUpdBy(String updBy) {
        this.updBy = updBy;
    }

    public LocalDateTime getUpdDTimes() {
        return updDTimes;
    }

    public void setUpdDTimes(LocalDateTime updDTimes) {
        this.updDTimes = updDTimes;
    }

    public LocalDateTime getDelDTime() {
        return delDTime;
    }

    public void setDelDTime(LocalDateTime delDTime) {
        this.delDTime = delDTime;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getKeyusage() {
        return keyusage;
    }

    public void setKeyusage(String keyusage) {
        this.keyusage = keyusage;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }
}
