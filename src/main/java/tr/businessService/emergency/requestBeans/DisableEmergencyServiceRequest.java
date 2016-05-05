package tr.businessService.emergency.requestBeans;

import tr.restApi.emergency.apiRequest.DisableEmergencyApiRequest;
import tr.util.classes.BaseServiceRequest;

public class DisableEmergencyServiceRequest extends BaseServiceRequest {
    private Long emergencyId;

    public Long getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(Long emergencyId) {
        this.emergencyId = emergencyId;
    }

    public static class DisableEmergencyServiceRequestBuilder extends BaseServiceRequestBuilder<DisableEmergencyServiceRequest> {

        public DisableEmergencyServiceRequestBuilder() {
            this.serviceRequest = new DisableEmergencyServiceRequest();
        }

        public DisableEmergencyServiceRequest buildServiceRequest(DisableEmergencyApiRequest disableEmergencyApiRequest) {
            //TODO: Þifre Kontrolüde yapýlmalý
            serviceRequest.setEmergencyId(disableEmergencyApiRequest.getEmergencyId());
            return serviceRequest;
        }

    }
}
