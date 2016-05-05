package tr.restApi.emergency.apiRequest;


import tr.util.classes.BaseApiRequest;

public class CheckActiveEmergencyApiRequest extends BaseApiRequest {
    private Long fkNumberId;

    public Long getFkNumberId() {
        return fkNumberId;
    }

    public void setFkNumberId(Long fkNumberId) {
        this.fkNumberId = fkNumberId;
    }

}
