package tr.restApi.emergencyPerson.apiRequest;


import tr.util.classes.BaseApiRequest;

public class GetFollowingEmergencyPersonsApiRequest extends BaseApiRequest {
    private Long fkNumberId;

    public Long getFkNumberId() {
        return fkNumberId;
    }

    public void setFkNumberId(Long fkNumberId) {
        this.fkNumberId = fkNumberId;
    }
}
