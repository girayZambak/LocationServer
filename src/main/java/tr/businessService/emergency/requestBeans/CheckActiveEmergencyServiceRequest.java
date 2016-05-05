package tr.businessService.emergency.requestBeans;

import tr.entity.Emergency;
import tr.restApi.emergency.apiRequest.CheckActiveEmergencyApiRequest;
import tr.restApi.emergency.apiRequest.CreateEmergencyApiRequest;
import tr.util.classes.BaseServiceRequest;

public class CheckActiveEmergencyServiceRequest extends BaseServiceRequest {
    private Long fkNumberId;

    public Long getFkNumberId() {
        return fkNumberId;
    }

    public void setFkNumberId(Long fkNumberId) {
        this.fkNumberId = fkNumberId;
    }

    public static class CheckActiveEmergencyServiceRequestBuilder extends BaseServiceRequestBuilder<CheckActiveEmergencyServiceRequest> {

        public CheckActiveEmergencyServiceRequestBuilder() {
            this.serviceRequest = new CheckActiveEmergencyServiceRequest();
        }

        public CheckActiveEmergencyServiceRequest buildServiceRequest(CheckActiveEmergencyApiRequest checkActiveEmergencyApiRequest) {
            serviceRequest.setFkNumberId(checkActiveEmergencyApiRequest.getFkNumberId());
            return serviceRequest;
        }

    }
}
