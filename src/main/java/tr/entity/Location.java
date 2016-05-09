package tr.entity;


import tr.util.classes.BaseEntity;

import javax.persistence.*;
@Entity
@Table(name = "LOCATION", catalog = "")
@SequenceGenerator(name = "DEFAULT_ID_GENERATOR", sequenceName = "LOCATION_SEQ", allocationSize = 1)
public class Location extends BaseEntity {

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name="FK_EMERGENCY_ID")
    private Long fkEmergencyId;

    @ManyToOne
    @JoinColumn(name = "FK_EMERGENCY_ID", insertable = false, updatable = false)
    private Emergency emergency;

    @Column(name="FK_LOCATION_SEND_TYPE")
    private Long fkLocationSendType;

    @ManyToOne
    @JoinColumn(name = "FK_LOCATION_SEND_TYPE", insertable = false, updatable = false)
    private LocationSendType locationSendType;

    public Emergency getEmergency() {
        return emergency;
    }

    public void setEmergency(Emergency emergency) {
        this.emergency = emergency;
    }

    public LocationSendType getLocationSendType() {
        return locationSendType;
    }

    public void setLocationSendType(LocationSendType locationSendType) {
        this.locationSendType = locationSendType;
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
