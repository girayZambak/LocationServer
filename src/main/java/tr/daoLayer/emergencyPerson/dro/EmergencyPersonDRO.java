package tr.daoLayer.emergencyPerson.dro;

import tr.util.classes.BaseDRO;

public class EmergencyPersonDRO extends BaseDRO {
    private Long id;
    private Long fkSenderUserId;
    private Long fkReceiverNumberId;
    private String areaCode;
    private String number;
    private String name;
    private String surname;
    private Boolean active;
    private Boolean isConfirmed;

    public EmergencyPersonDRO(){

    }

    public EmergencyPersonDRO(Long id, Long fkSenderUserId, Long fkReceiverNumberId, String name, String surname) {
        this.id = id;
        this.fkSenderUserId = fkSenderUserId;
        this.fkReceiverNumberId = fkReceiverNumberId;
        this.name = name;
        this.surname = surname;
    }

    public EmergencyPersonDRO(Long id, Long fkSenderUserId, Long fkReceiverNumberId, String name, String surname, Boolean active, Boolean isConfirmed) {
        this.id = id;
        this.fkSenderUserId = fkSenderUserId;
        this.fkReceiverNumberId = fkReceiverNumberId;
        this.name = name;
        this.surname = surname;
        this.active = active;
        this.isConfirmed = isConfirmed;
    }

    public EmergencyPersonDRO(Long id, Long fkSenderUserId, Long fkReceiverNumberId, String areaCode, String number, String name, String surname, Boolean active, Boolean isConfirmed) {
        this.id = id;
        this.fkSenderUserId = fkSenderUserId;
        this.fkReceiverNumberId = fkReceiverNumberId;
        this.areaCode = areaCode;
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.active = active;
        this.isConfirmed = isConfirmed;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
