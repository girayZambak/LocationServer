package tr.businessService.emergency.responseBeans;


import tr.daoLayer.emergency.dro.EmergencyDRO;
import tr.util.classes.BaseServiceResponse;

public class DisableEmergencyServiceResponse extends BaseServiceResponse {
    private Boolean isEmergencyDisabled;

    public Boolean getIsEmergencyDisabled() {
        return isEmergencyDisabled;
    }

    public void setIsEmergencyDisabled(Boolean isEmergencyDisabled) {
        this.isEmergencyDisabled = isEmergencyDisabled;
    }

    public static class DisableEmergencyServiceResponseBuilder extends BaseServiceResponseBuilder<DisableEmergencyServiceResponse> {
        public DisableEmergencyServiceResponse buildServiceResponse(Boolean isEmergencyDisabled) {

            serviceResponse.setIsEmergencyDisabled(isEmergencyDisabled);

            return serviceResponse;
        }
    }
}
