package tr.entity;


import tr.util.classes.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "CONFIRM", catalog = "")
@SequenceGenerator(name = "DEFAULT_ID_GENERATOR", sequenceName = "CONFIRM_SEQ", allocationSize = 1)
public class Confirm extends BaseEntity {
    @Column(name="FK_T_USER_ID")
    private Long fkTUserId;

    @ManyToOne
    @JoinColumn(name = "FK_T_USER_ID", insertable = false, updatable = false)
    private TUser tUser;

    @Column(name="CODE")
    private String code;

    @Column(name="FK_CONFIRM_TYPE_ID")
    private Long fkConfirmTypeId;

    @ManyToOne
    @JoinColumn(name = "FK_CONFIRM_TYPE_ID", insertable = false, updatable = false)
    private ConfirmType confirmType;

    @Column(name="ACTIVE")
    private Boolean active;

    public Long getFkTUserId() {
        return fkTUserId;
    }

    public void setFkTUserId(Long fkTUserId) {
        this.fkTUserId = fkTUserId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getFkConfirmTypeId() {
        return fkConfirmTypeId;
    }

    public void setFkConfirmTypeId(Long fkConfirmTypeId) {
        this.fkConfirmTypeId = fkConfirmTypeId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }

    public ConfirmType getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(ConfirmType confirmType) {
        this.confirmType = confirmType;
    }
}
