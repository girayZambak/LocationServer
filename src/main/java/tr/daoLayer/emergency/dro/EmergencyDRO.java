package tr.daoLayer.emergency.dro;

import tr.util.classes.BaseDRO;

public class EmergencyDRO extends BaseDRO {
    private Long id;
    private Long fkNumberId;
    private Long fkEmergencyTypeId;
    private Long fkEmergencyStatusId;

    public EmergencyDRO(){

    }

    public EmergencyDRO(Long id, Long fkNumberId, Long fkEmergencyTypeId, Long fkEmergencyStatusId) {
        this.id = id;
        this.fkNumberId = fkNumberId;
        this.fkEmergencyTypeId = fkEmergencyTypeId;
        this.fkEmergencyStatusId = fkEmergencyStatusId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkNumberId() {
        return fkNumberId;
    }

    public void setFkNumberId(Long fkNumberId) {
        this.fkNumberId = fkNumberId;
    }

    public Long getFkEmergencyTypeId() {
        return fkEmergencyTypeId;
    }

    public void setFkEmergencyTypeId(Long fkEmergencyTypeId) {
        this.fkEmergencyTypeId = fkEmergencyTypeId;
    }

    public Long getFkEmergencyStatusId() {
        return fkEmergencyStatusId;
    }

    public void setFkEmergencyStatusId(Long fkEmergencyStatusId) {
        this.fkEmergencyStatusId = fkEmergencyStatusId;
    }
}
