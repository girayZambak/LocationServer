package tr.restApi.emergencyPerson.apiRequest;


import tr.util.classes.BaseApiRequest;

public class DeleteEmergencyPersonApiRequest extends BaseApiRequest {
    private Long fkEmergencyPersonId;

    public Long getFkEmergencyPersonId() {
        return fkEmergencyPersonId;
    }

    public void setFkEmergencyPersonId(Long fkEmergencyPersonId) {
        this.fkEmergencyPersonId = fkEmergencyPersonId;
    }
}
