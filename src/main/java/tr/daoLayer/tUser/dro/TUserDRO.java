package tr.daoLayer.tUser.dro;

import tr.util.classes.BaseDRO;

import java.util.Date;

public class TUserDRO extends BaseDRO {
    private Long id;
    private Long fkNumberId;
    private String name;
    private String surname;
    private String eMail;
    private String regId;
    private Date dateOfBirth;
    private String deviceId;
    private String simSerialNumber;
    private Boolean active;
    private Boolean isLogin;
    private Boolean isConfirmed;
    private String number;
    private String areaCode;

    public TUserDRO(){

    }

    public TUserDRO(Long id, Long fkNumberId, String name, String surname, String eMail, String regId, Date dateOfBirth, String deviceId, String simSerialNumber, Boolean active, Boolean isLogin, Boolean isConfirmed, String number, String areaCode) {
        this.id = id;
        this.fkNumberId = fkNumberId;
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
        this.regId = regId;
        this.dateOfBirth = dateOfBirth;
        this.deviceId = deviceId;
        this.simSerialNumber = simSerialNumber;
        this.active = active;
        this.isLogin = isLogin;
        this.isConfirmed = isConfirmed;
        this.number = number;
        this.areaCode = areaCode;
    }

    public Long getFkNumberId() {
        return fkNumberId;
    }

    public void setFkNumberId(Long fkNumberId) {
        this.fkNumberId = fkNumberId;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSimSerialNumber() {
        return simSerialNumber;
    }

    public void setSimSerialNumber(String simSerialNumber) {
        this.simSerialNumber = simSerialNumber;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Boolean isLogin) {
        this.isLogin = isLogin;
    }

    public Boolean getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
