package com.msp.ida.mosipidamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "key_alias",schema = "ida")
public class IDAFIRcertstore {
    @Id
    @Column(name="id")
    public String Id;
    @Column(name="app_id")
    public String AppId;
    @Column(name="ref_id")
    public String RefId;
    @Column(name="key_gen_dtimes")
    public LocalDateTime KeyGen;
    @Column(name="key_expire_dtimes")
    public LocalDateTime KeyExpire;
    @Column(name="status_code")
    public String status;
    @Column(name="lang_code")
    public String lang;
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
    @Column(name="cert_thumbprint")
    public String certThumbprint;
    @Column(name="uni_ident")
    public String iden;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAppId() {
        return AppId;
    }

    public void setAppId(String appId) {
        AppId = appId;
    }

    public String getRefId() {
        return RefId;
    }

    public void setRefId(String refId) {
        RefId = refId;
    }

    public LocalDateTime getKeyGen() {
        return KeyGen;
    }

    public void setKeyGen(LocalDateTime keyGen) {
        KeyGen = keyGen;
    }

    public LocalDateTime getKeyExpire() {
        return KeyExpire;
    }

    public void setKeyExpire(LocalDateTime keyExpire) {
        KeyExpire = keyExpire;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
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

    public String getCertThumbprint() {
        return certThumbprint;
    }

    public void setCertThumbprint(String certThumbprint) {
        this.certThumbprint = certThumbprint;
    }

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }
}
