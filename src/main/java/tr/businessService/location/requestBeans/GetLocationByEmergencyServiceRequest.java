package tr.businessService.location.requestBeans;

import tr.restApi.location.apiRequest.GetLocationByEmergencyApiRequest;
import tr.util.classes.BaseServiceRequest;

public class GetLocationByEmergencyServiceRequest extends BaseServiceRequest {
    private Long fkEmergencyId;

    public Long getFkEmergencyId() {
        return fkEmergencyId;
    }

    public void setFkEmergencyId(Long fkEmergencyId) {
        this.fkEmergencyId = fkEmergencyId;
    }

    public static class GetLocationByEmergencyServiceRequestBuilder extends BaseServiceRequestBuilder<GetLocationByEmergencyServiceRequest> {

        public GetLocationByEmergencyServiceRequestBuilder() {
            this.serviceRequest = new GetLocationByEmergencyServiceRequest();
        }

        public GetLocationByEmergencyServiceRequest buildServiceRequest(GetLocationByEmergencyApiRequest getLocationByEmergencyApiRequest) {
            serviceRequest.setFkEmergencyId(getLocationByEmergencyApiRequest.getFkEmergencyId());
            return serviceRequest;
        }

    }
}
