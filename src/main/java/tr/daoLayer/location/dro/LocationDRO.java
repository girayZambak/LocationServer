package tr.daoLayer.location.dro;

import tr.util.classes.BaseDRO;
import tr.util.enums.EmergencyStatusEnum;

public class LocationDRO extends BaseDRO {
    private Long id;
    private Double latitude;
    private Double longitude;
    private Long fkEmergencyId;
    private Long fkLocationSendType;
    private Boolean isEmergencyActive;
    private String locationSendType;

    public LocationDRO() {
    }

    public LocationDRO(Long id, Double latitude, Double longitude, Long fkEmergencyId, Long fkLocationSendType) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.fkEmergencyId = fkEmergencyId;
        this.fkLocationSendType = fkLocationSendType;
    }

    public LocationDRO(Long id, Double latitude, Double longitude, Long fkEmergencyId, Long fkLocationSendType, Boolean isEmergencyActive, String locationSendType) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.fkEmergencyId = fkEmergencyId;
        this.fkLocationSendType = fkLocationSendType;
        this.isEmergencyActive = isEmergencyActive;
        this.locationSendType = locationSendType;
    }

    public LocationDRO(Long id, Double latitude, Double longitude, Long fkEmergencyId, Long fkLocationSendType, Long isEmergencyActive, String locationSendType) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.fkEmergencyId = fkEmergencyId;
        this.fkLocationSendType = fkLocationSendType;
        this.isEmergencyActive = isEmergencyActive == EmergencyStatusEnum.ACTIVE.getValue();
        this.locationSendType = locationSendType;
    }

    public String getLocationSendType() {
        return locationSendType;
    }

    public void setLocationSendType(String locationSendType) {
        this.locationSendType = locationSendType;
    }

    public Boolean getIsEmergencyActive() {
        return isEmergencyActive;
    }

    public void setIsEmergencyActive(Boolean isEmergencyActive) {
        this.isEmergencyActive = isEmergencyActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
