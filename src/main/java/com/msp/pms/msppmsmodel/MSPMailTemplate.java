package com.msp.pms.msppmsmodel;

import javax.persistence.*;

@Entity
@Table(name="mail_template",schema = "msppms")
public class MSPMailTemplate implements java.io.Serializable {
    @Id
    @Column(name = "menu_id")
    private String id;
    @Column(name = "template")
    private String template;
    @Column(name = "is_active")
    private boolean active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
