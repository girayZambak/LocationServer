package tr.entity;


import tr.util.classes.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMERGENCY", catalog = "")
@SequenceGenerator(name = "DEFAULT_ID_GENERATOR", sequenceName = "EMERGENCY_SEQ", allocationSize = 1)
public class Emergency extends BaseEntity {
    @Column(name="FK_NUMBER_ID")
    private Long fkNumberId;

    @Column(name="FK_EMERGENCY_STATUS_ID")
    private Long fkEmergencyStatusId;

    public Long getFkNumberId() {
        return fkNumberId;
    }

    public void setFkNumberId(Long fkNumberId) {
        this.fkNumberId = fkNumberId;
    }

    public Long getFkEmergencyStatusId() {
        return fkEmergencyStatusId;
    }

    public void setFkEmergencyStatusId(Long fkEmergencyStatusId) {
        this.fkEmergencyStatusId = fkEmergencyStatusId;
    }
}
