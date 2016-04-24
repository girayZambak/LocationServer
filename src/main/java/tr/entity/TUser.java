package tr.entity;

import tr.util.classes.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_USER", catalog = "")
@SequenceGenerator(name = "DEFAULT_ID_GENERATOR", sequenceName = "T_USER_SEQ", allocationSize = 1)
public class TUser extends BaseEntity {
    @Column(name="FK_NUMBER_ID")
    private Long fkNumberId;

    @ManyToOne
    @JoinColumn(name = "FK_NUMBER_ID", insertable = false, updatable = false)
    private Number number;

    @Column(name="NAME")
    private String name;

    @Column(name="SURNAME")
    private String surname;

    @Column(name="E_MAIL")
    private String eMail;

    @Column(name="REG_ID")
    private String regId;

    @Column(name="DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Column(name="DEVICE_ID")
    private String deviceId;

    @Column(name="SIM_SERIAL_NUMBER")
    private String simSerialNumber;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="ACTIVE")
    private Boolean active;

    @Column(name="IS_LOGIN")
    private Boolean isLogin;

    @Column(name="IS_CONFIRMED")
    private Boolean isConfirmed;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
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

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }
}
