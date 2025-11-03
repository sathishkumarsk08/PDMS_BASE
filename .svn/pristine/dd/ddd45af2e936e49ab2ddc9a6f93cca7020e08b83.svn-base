package com.msp.pms.msppmsmodel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
@Entity
@Table(name = "sign_cert_store", schema = "msppms")
@Getter
@Setter
public class MSPSignCertStore {
    @Id
    @Column(name = "partner_id")
    private String partId;
    @Column(name = "sign_cert")
    private String signCert;
    @Column(name = "cert_id")
    private String certId;
    @Column(name = "updated_by")
    private int updBy;
    @Column(name = "updated_dtimes")
    private LocalDateTime updDtime;
    @Column(name = "status")
    private String status;
    @Column(name = "performed_by")
    private String performedBy;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getSignCert() {
        return signCert;
    }

    public void setSignCert(String signCert) {
        this.signCert = signCert;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public int getUpdBy() {
        return updBy;
    }

    public void setUpdBy(int updBy) {
        this.updBy = updBy;
    }

    public LocalDateTime getUpdDtime() {
        return updDtime;
    }

    public void setUpdDtime(LocalDateTime updDtime) {
        this.updDtime = updDtime;
    }
}
