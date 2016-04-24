package tr.entity;


import tr.util.classes.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "EMERGENCY_PERSON", catalog = "")
@SequenceGenerator(name = "DEFAULT_ID_GENERATOR", sequenceName = "EMERGENCY_PERSON_SEQ", allocationSize = 1)
public class EmergencyPerson extends BaseEntity {
    @Column(name="FK_SENDER_NUMBER_ID")
    private Long fkSenderNumberId;

    @Column(name="FK_RECEIVER_NUMBER_ID")
    private Long fkReceiverNumberId;

    @Column(name="NAME")
    private String name;

    @Column(name="SURNAME")
    private String surname;

    @Column(name="ACTIVE")
    private Boolean active;

    @Column(name="IS_CONFIRMED")
    private Boolean isConfirmed;

    public Long getFkSenderNumberId() {
        return fkSenderNumberId;
    }

    public void setFkSenderNumberId(Long fkSenderNumberId) {
        this.fkSenderNumberId = fkSenderNumberId;
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
}
