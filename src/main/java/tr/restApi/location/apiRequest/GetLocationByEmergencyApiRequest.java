package tr.restApi.location.apiRequest;


import tr.util.classes.BaseApiRequest;

public class GetLocationByEmergencyApiRequest extends BaseApiRequest {
    private Long fkEmergencyId;

    public Long getFkEmergencyId() {
        return fkEmergencyId;
    }

    public void setFkEmergencyId(Long fkEmergencyId) {
        this.fkEmergencyId = fkEmergencyId;
    }
}
