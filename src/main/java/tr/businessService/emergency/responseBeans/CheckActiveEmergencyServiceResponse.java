package tr.businessService.emergency.responseBeans;


import tr.daoLayer.emergency.dro.EmergencyDRO;
import tr.entity.Emergency;
import tr.util.classes.BaseServiceResponse;

public class CheckActiveEmergencyServiceResponse extends BaseServiceResponse {
    private EmergencyDRO emergencyDRO;

    public EmergencyDRO getEmergencyDRO() {
        return emergencyDRO;
    }

    public void setEmergencyDRO(EmergencyDRO emergencyDRO) {
        this.emergencyDRO = emergencyDRO;
    }

    public static class CheckActiveEmergencyServiceResponseBuilder extends BaseServiceResponseBuilder<CheckActiveEmergencyServiceResponse> {
        public CheckActiveEmergencyServiceResponse buildServiceResponse(EmergencyDRO emergencyDRO) {

            serviceResponse.setEmergencyDRO(emergencyDRO);

            return serviceResponse;
        }
    }
}
