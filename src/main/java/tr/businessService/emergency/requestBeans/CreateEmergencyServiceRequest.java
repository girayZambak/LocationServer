package tr.businessService.emergency.requestBeans;

import tr.entity.Emergency;
import tr.restApi.emergency.apiRequest.CreateEmergencyApiRequest;
import tr.util.classes.BaseServiceRequest;

public class CreateEmergencyServiceRequest extends BaseServiceRequest {
    private Emergency emergency;

    public Emergency getEmergency() {
        return emergency;
    }

    public void setEmergency(Emergency emergency) {
        this.emergency = emergency;
    }

    public static class CreateEmergencyServiceRequestBuilder extends BaseServiceRequestBuilder<CreateEmergencyServiceRequest> {

        public CreateEmergencyServiceRequestBuilder() {
            this.serviceRequest = new CreateEmergencyServiceRequest();
        }

        public CreateEmergencyServiceRequest buildServiceRequest(CreateEmergencyApiRequest createEmergencyApiRequest) {
            Emergency emergency = new Emergency();

            emergency.setFkNumberId(createEmergencyApiRequest.getFkNumberId());
            emergency.setFkEmergencyStatusId(createEmergencyApiRequest.getFkEmergencyStatusId());
            emergency.setFkEmergencyTypeId(createEmergencyApiRequest.getFkEmergencyTypeId());

            serviceRequest.setEmergency(emergency);
            return serviceRequest;
        }

    }
}
