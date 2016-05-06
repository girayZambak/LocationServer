package tr.restApi.emergencyPerson.apiRequest;


import tr.util.classes.BaseApiRequest;

public class ConfirmEmergencyPersonApiRequest extends BaseApiRequest {
    private Long fkEmergencyPersonId;
    private Long fkUserId;

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }


    public Long getFkEmergencyPersonId() {
        return fkEmergencyPersonId;
    }

    public void setFkEmergencyPersonId(Long fkEmergencyPersonId) {
        this.fkEmergencyPersonId = fkEmergencyPersonId;
    }
}
