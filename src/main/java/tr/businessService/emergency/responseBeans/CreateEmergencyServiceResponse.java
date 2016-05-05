package tr.businessService.emergency.responseBeans;


import tr.daoLayer.emergency.dro.EmergencyDRO;
import tr.daoLayer.number.dro.NumberDRO;
import tr.daoLayer.tUser.dro.TUserDRO;
import tr.entity.Emergency;
import tr.entity.TUser;
import tr.util.classes.BaseServiceResponse;

public class CreateEmergencyServiceResponse extends BaseServiceResponse {
    private EmergencyDRO emergencyDRO;

    public EmergencyDRO getEmergencyDRO() {
        return emergencyDRO;
    }

    public void setEmergencyDRO(EmergencyDRO emergencyDRO) {
        this.emergencyDRO = emergencyDRO;
    }

    public static class CreateEmergencyServiceResponseBuilder extends BaseServiceResponseBuilder<CreateEmergencyServiceResponse> {
        public CreateEmergencyServiceResponse buildServiceResponse(Emergency emergency) {

            EmergencyDRO emergencyDRO = new EmergencyDRO(emergency.getId(),emergency.getFkNumberId(),emergency.getFkEmergencyTypeId(),emergency.getFkEmergencyStatusId());

            serviceResponse.setEmergencyDRO(emergencyDRO);

            return serviceResponse;
        }

        public CreateEmergencyServiceResponse buildServiceResponse(EmergencyDRO emergencyDRO) {

            serviceResponse.setEmergencyDRO(emergencyDRO);

            return serviceResponse;
        }
    }
}
