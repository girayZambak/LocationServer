package tr.restApi.emergencyPerson.apiRequest;


import tr.util.classes.BaseApiRequest;

public class CreateEmergencyPersonApiRequest extends BaseApiRequest {
    private Long fkSenderUserId;
    private String areaCode;
    private String number;
    private String name;
    private String surname;

    public Long getFkSenderUserId() {
        return fkSenderUserId;
    }

    public void setFkSenderUserId(Long fkSenderUserId) {
        this.fkSenderUserId = fkSenderUserId;
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
