package tr.restApi.emergency.apiRequest;


import tr.util.classes.BaseApiRequest;

import java.util.Date;

public class CreateEmergencyApiRequest extends BaseApiRequest {
    private Long fkNumberId;
    private Long fkEmergencyTypeId;
    private Long fkEmergencyStatusId;

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
