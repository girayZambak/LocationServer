package tr.restApi.emergency.apiRequest;


import tr.util.classes.BaseApiRequest;

public class DisableEmergencyApiRequest extends BaseApiRequest {
    private Long emergencyId;

    public Long getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(Long emergencyId) {
        this.emergencyId = emergencyId;
    }
}
