package com.msp.pms.msppmsmodel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "policy_group" ,schema ="msppms")
@Getter
@Setter
public class PolicyGroupPms implements java.io.Serializable{


    @Column(name = "policy_group_id", unique = true, nullable = false)
        private String id;
    @Column(name="policy_group_name")
        private String  name;
    @Column(name="policy_group_name_description")
        private String descr;
    @Column(name="policy_group_status")
        private String status;
    @Column(name="user_id")
        private String  userId;
    @Column(name="policy_group_created_by")
        private String   crBy;
    @Column(name="policy_group_crdtimes")
        private LocalDateTime crDtimes;
    @Column(name="policy_group_upd_by")
        private String  updBy;
    @Column(name="policy_group_updtimes")
        private LocalDateTime updDtimes;
    @Column(name="is_deleted")
        private Boolean  isDeleted;
    @Column(name="policy_group_del_dtimes")
        private LocalDateTime delDtimes;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_group_sno")
        private Integer sno;



    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }



        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescr() {
            return descr;
        }

        public void setDescr(String descr) {
            this.descr = descr;
        }

        public String getStatus() {
        return status;
    }

        public void setStatus(String status) {
        this.status = status;
    }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getCrBy() {
            return crBy;
        }

        public void setCrBy(String crBy) {
            this.crBy = crBy;
        }

        public LocalDateTime getCrDtimes() {
            return crDtimes;
        }

        public void setCrDtimes(LocalDateTime crDtimes) {
            this.crDtimes = crDtimes;
        }

        public String getUpdBy() {
            return updBy;
        }

        public void setUpdBy(String updBy) {
            this.updBy = updBy;
        }

        public LocalDateTime getUpdDtimes() {
            return updDtimes;
        }

        public void setUpdDtimes(LocalDateTime updDtimes) {
            this.updDtimes = updDtimes;
        }

        public Boolean getDeleted() {
            return isDeleted;
        }

        public void setDeleted(Boolean deleted) {
            isDeleted = deleted;
        }

        public LocalDateTime getDelDtimes() {
            return delDtimes;
        }

        public void setDelDtimes(LocalDateTime delDtimes) {
            this.delDtimes = delDtimes;
        }
}
