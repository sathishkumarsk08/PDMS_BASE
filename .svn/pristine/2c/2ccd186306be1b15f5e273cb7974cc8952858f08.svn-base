package com.msp.pms.msppmsmodel;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "partner_registration_old" ,schema ="msppms")

public class MSPPartnerRegistration implements java.io.Serializable {

    private Integer partnerSno;

    private String partnerId;

    private String organisationName;

    private String authenticationRepName;

    private String partnerType;

    private String mobileNumber;

    private String emailId;

    private String psaApproval;

    private String selfAssessment;

    private String nonDisclosureAgreement;

    private String otherDocument;

    private String partStatus;

    private String partcreatedBy;

    private  LocalDateTime partcrDtTime;

    private String userId;

    private Integer partupdBy;
    private Integer flag;

    private LocalDateTime partupDtTime;

    private boolean isDeleted;

    private LocalDateTime delDateTime;

    private String policyGroup;

    private String suspended;

    private String blacklisted;

    private String revoked;

    private String certificateAlias;

    private boolean isactive;

    private String tspPartner;

    private String selectedType;

    private String susBlackStatus;

    @Column(name = "sus_black_status")
    public String getSusBlackStatus() {
        return susBlackStatus;
    }

    public void setSusBlackStatus(String susBlackStatus) {
        this.susBlackStatus = susBlackStatus;
    }

    @Column(name = "selected_type")

    public String getSelectedType() {
        return selectedType;
    }

    public void setSelectedType(String selectedType) {
        this.selectedType = selectedType;
    }

    @Column(name = "tsp_partner")
    public String getTspPartner() {
        return tspPartner;
    }

    public void setTspPartner(String tspPartner) {
        this.tspPartner = tspPartner;
    }

    @Column(name = "is_active")
    public boolean isIsactive() {return isactive;}

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }
    @Column(name = "certificate_alias")
    public String getCertificateAlias() {
        return certificateAlias;
    }

    public void setCertificateAlias(String certificateAlias) {
        this.certificateAlias = certificateAlias;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partner_reg_sno")
    public Integer getPartnerSno() {
        return partnerSno;
    }

    public void setPartnerSno(Integer partnerSno) {
        this.partnerSno = partnerSno;
    }

    @Column(name = "partner_id")
    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }
    @Column(name = "orga_name")
    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }
    @Column(name = "auth_rep_name")
    public String getAuthenticationRepName() {
        return authenticationRepName;
    }

    public void setAuthenticationRepName(String authenticationRepName) {
        this.authenticationRepName = authenticationRepName;
    }
    @Column(name = "partner_type")
    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }
    @Column(name = "mobile_no")
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    @Column(name = "email_id")
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    @Column(name = "psa_approval")
    public String getPsaApproval() {
        return psaApproval;
    }

    public void setPsaApproval(String psaApproval) {
        this.psaApproval = psaApproval;
    }
    @Column(name = "self_ass")
    public String getSelfAssessment() {
        return selfAssessment;
    }

    public void setSelfAssessment(String selfAssessment) {
        this.selfAssessment = selfAssessment;
    }
    @Column(name = "non_disclose_agg")
    public String getNonDisclosureAgreement() {
        return nonDisclosureAgreement;
    }

    public void setNonDisclosureAgreement(String nonDisclosureAgreement) {
        this.nonDisclosureAgreement = nonDisclosureAgreement;
    }
    @Column(name = "other_documents")
    public String getOtherDocument() {
        return otherDocument;
    }

    public void setOtherDocument(String otherDocument) {
        this.otherDocument = otherDocument;
    }
    @Column(name = "part_status")
    public String getPartStatus() {
        return partStatus;
    }

    public void setPartStatus(String partStatus) {
        this.partStatus = partStatus;
    }
    @Column(name = "part_created_by")
    public String getPartcreatedBy() {
        return partcreatedBy;
    }

    public void setPartcreatedBy(String partcreatedBy) {
        this.partcreatedBy = partcreatedBy;
    }
    @Column(name = "part_crdtimes")
    public LocalDateTime getPartcrDtTime() {
        return partcrDtTime;
    }

    public void setPartcrDtTime(LocalDateTime partcrDtTime) {
        this.partcrDtTime = partcrDtTime;
    }
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Column(name = "part_updated_by")
    public Integer getPartupdBy() {
        return partupdBy;
    }

    public void setPartupdBy(Integer partupdBy) {
        this.partupdBy = partupdBy;
    }
    @Column(name = "part_updtimes")
    public LocalDateTime getPartupDtTime() {
        return partupDtTime;
    }

    public void setPartupDtTime(LocalDateTime partupDtTime) {
        this.partupDtTime = partupDtTime;
    }
    @Column(name = "is_deleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
    @Column(name = "part_del_dtimes")
    public LocalDateTime getDelDateTime() {
        return delDateTime;
    }

    public void setDelDateTime(LocalDateTime delDateTime) {
        this.delDateTime = delDateTime;
    }
    @Column(name = "policy_group")
    public String getPolicyGroup() {
        return policyGroup;
    }

    public void setPolicyGroup(String policyGroup) {
        this.policyGroup = policyGroup;
    }
    @Column(name = "partner_suspended")
    public String getSuspended() {
        return suspended;
    }

    public void setSuspended(String suspended) {
        this.suspended = suspended;
    }
    @Column(name = "partner_blacklisted")
    public String getBlacklisted() {
        return blacklisted;
    }

    public void setBlacklisted(String blacklisted) {
        this.blacklisted = blacklisted;
    }
    @Column(name = "partner_revoked")
    public String getRevoked() {
        return revoked;
    }

    public void setRevoked(String revoked) {
        this.revoked = revoked;
    }
    @Column(name = "flag")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
