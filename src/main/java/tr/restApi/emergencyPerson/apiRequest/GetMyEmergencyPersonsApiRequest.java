package tr.restApi.emergencyPerson.apiRequest;


import tr.util.classes.BaseApiRequest;

public class GetMyEmergencyPersonsApiRequest extends BaseApiRequest {
    private Long fkUserId;

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }
}
