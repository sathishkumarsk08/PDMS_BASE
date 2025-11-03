package com.msp.pms.msppmsmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="otp_validation",schema = "msppms")
public class MSPCertificateStore implements java.io.Serializable {
    private String id;
    private String subject;
    private String issuer;
    private String issuerId;
    private String notBefore;
    private String notAfter;
    private  String uri;
    private String data;
    private String thumbPrint;
    private String serialNo;
    private  String domain;
    private String crBy;
    private String crDtime;
    private String updBy;
    private String updDtime;
    private String isDeleted;
    private String delDtimes;

    @Id
    @Column(name = "cert_id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Column(name = "cert_subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Column(name = "cert_issuer")
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
    @Column(name = "issuer_id")
    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }
    @Column(name = "cert_not_before")
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }
    @Column(name = "cert_not_after")
    public String getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(String notAfter) {
        this.notAfter = notAfter;
    }
    @Column(name = "crl_uri")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
    @Column(name = "cert_data")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    @Column(name = "cert_thumbprint")
    public String getThumbPrint() {
        return thumbPrint;
    }

    public void setThumbPrint(String thumbPrint) {
        this.thumbPrint = thumbPrint;
    }
    @Column(name = "cert_serial_no")
    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    @Column(name = "partner_domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    @Column(name = "cr_by")
    public String getCrBy() {
        return crBy;
    }

    public void setCrBy(String crBy) {
        this.crBy = crBy;
    }
    @Column(name = "cr_dtimes")
    public String getCrDtime() {
        return crDtime;
    }

    public void setCrDtime(String crDtime) {
        this.crDtime = crDtime;
    }
    @Column(name = "upd_by")
    public String getUpdBy() {
        return updBy;
    }

    public void setUpdBy(String updBy) {
        this.updBy = updBy;
    }
    @Column(name = "upd_dtimes")
    public String getUpdDtime() {
        return updDtime;
    }

    public void setUpdDtime(String updDtime) {
        this.updDtime = updDtime;
    }
    @Column(name = "is_deleted")
    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
    @Column(name = "del_dtimes")
    public String getDelDtimes() {
        return delDtimes;
    }

    public void setDelDtimes(String delDtimes) {
        this.delDtimes = delDtimes;
    }


}
