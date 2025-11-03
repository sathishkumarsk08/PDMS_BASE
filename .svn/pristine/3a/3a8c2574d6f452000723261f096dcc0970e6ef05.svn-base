package com.msp.pms.msppmsmodel;

import javax.persistence.*;

@Entity
@Table(name="otp_validation",schema = "msppms")
public class MSPOtpRequest implements java.io.Serializable {
    private Integer id;
    private String contact;
    private String email;
    private String otp;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "contact_no")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "otp_validation")
    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
