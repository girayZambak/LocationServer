package tr.restApi.location.apiRequest;


import tr.util.classes.BaseApiRequest;

public class CreateLocationApiRequest extends BaseApiRequest {
    private Double latitude;
    private Double longitude;
    private Long fkEmergencyId;
    private Long fkLocationSendType;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Long getFkEmergencyId() {
        return fkEmergencyId;
    }

    public void setFkEmergencyId(Long fkEmergencyId) {
        this.fkEmergencyId = fkEmergencyId;
    }

    public Long getFkLocationSendType() {
        return fkLocationSendType;
    }

    public void setFkLocationSendType(Long fkLocationSendType) {
        this.fkLocationSendType = fkLocationSendType;
    }
}
