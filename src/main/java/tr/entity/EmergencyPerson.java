package tr.entity;


import tr.util.classes.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EMERGENCY_PERSON", catalog = "")
@SequenceGenerator(name = "DEFAULT_ID_GENERATOR", sequenceName = "EMERGENCY_PERSON_SEQ", allocationSize = 1)
public class EmergencyPerson extends BaseEntity {
    @Column(name="FK_SENDER_USER_ID")
    private Long fkSenderUserId;

    @ManyToOne
    @JoinColumn(name = "FK_SENDER_USER_ID", insertable = false, updatable = false)
    private TUser sender;

    @Column(name="FK_RECEIVER_NUMBER_ID")
    private Long fkReceiverNumberId;

    @ManyToOne
    @JoinColumn(name = "FK_RECEIVER_NUMBER_ID", insertable = false, updatable = false)
    private Number number;

    @Column(name="NAME")
    private String name;

    @Column(name="SURNAME")
    private String surname;

    @Column(name="ACTIVE")
    private Boolean active;

    @Column(name="IS_CONFIRMED")
    private Boolean isConfirmed;

    public TUser getSender() {
        return sender;
    }

    public void setSender(TUser sender) {
        this.sender = sender;
    }

    public Long getFkSenderUserId() {
        return fkSenderUserId;
    }

    public void setFkSenderUserId(Long fkSenderUserId) {
        this.fkSenderUserId = fkSenderUserId;
    }

    public Long getFkReceiverNumberId() {
        return fkReceiverNumberId;
    }

    public void setFkReceiverNumberId(Long fkReceiverNumberId) {
        this.fkReceiverNumberId = fkReceiverNumberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }
}
