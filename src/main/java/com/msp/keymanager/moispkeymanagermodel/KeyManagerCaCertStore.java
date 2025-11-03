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
@Table(name = "ca_cert_store",schema = "keymgr")
@Getter
@Setter
@ToString
public class KeyManagerCaCertStore  implements java.io.Serializable {


    @Column(name="cert_data")
    public String certData;
    @Id
    @Column(name="cert_id")
    public String certId;
    @Column(name="cert_issuer")
    public String certIssuer;
    @Column(name="cert_not_after")
    public LocalDateTime certAfter;
    @Column(name="cert_not_before")
    public LocalDateTime certBefore;
    @Column(name="cert_serial_no")
    public String certSerial;
    @Column(name="cert_subject")
    public String certSubject;
    @Column(name="cert_thumbprint")
    public String certThumbprint;
    @Column(name="cr_by")
    public String crBy;
    @Column(name="cr_dtimes")
    public LocalDateTime crDTimes;
    @Column(name="crl_uri")
    public String crlURI;
    @Column(name="del_dtimes")
    public LocalDateTime delDTime;
    @Column(name="is_deleted")
    public boolean isDeleted;
    @Column(name="issuer_id")
    public String issuerId;
    @Column(name="partner_domain")
    public String partDomain;
    @Column(name="upd_by")
    public String updBy;
    @Column(name="upd_dtimes")
    public LocalDateTime updDTimes;

    public String getCertData() {
        return certData;
    }

    public void setCertData(String certData) {
        this.certData = certData;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getCertIssuer() {
        return certIssuer;
    }

    public void setCertIssuer(String certIssuer) {
        this.certIssuer = certIssuer;
    }

    public LocalDateTime getCertAfter() {
        return certAfter;
    }

    public void setCertAfter(LocalDateTime certAfter) {
        this.certAfter = certAfter;
    }

    public LocalDateTime getCertBefore() {
        return certBefore;
    }

    public void setCertBefore(LocalDateTime certBefore) {
        this.certBefore = certBefore;
    }

    public String getCertSerial() {
        return certSerial;
    }

    public void setCertSerial(String certSerial) {
        this.certSerial = certSerial;
    }

    public String getCertSubject() {
        return certSubject;
    }

    public void setCertSubject(String certSubject) {
        this.certSubject = certSubject;
    }

    public String getCertThumbprint() {
        return certThumbprint;
    }

    public void setCertThumbprint(String certThumbprint) {
        this.certThumbprint = certThumbprint;
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

    public String getCrlURI() {
        return crlURI;
    }

    public void setCrlURI(String crlURI) {
        this.crlURI = crlURI;
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

    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public String getPartDomain() {
        return partDomain;
    }

    public void setPartDomain(String partDomain) {
        this.partDomain = partDomain;
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
}