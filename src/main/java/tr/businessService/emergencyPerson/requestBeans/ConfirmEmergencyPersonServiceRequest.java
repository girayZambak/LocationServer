package tr.businessService.emergencyPerson.requestBeans;

import tr.restApi.emergencyPerson.apiRequest.ConfirmEmergencyPersonApiRequest;
import tr.util.classes.BaseServiceRequest;

public class ConfirmEmergencyPersonServiceRequest extends BaseServiceRequest {
    private Long fkEmergencyPersonId;
    private Long fkUserId;

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public Long getFkEmergencyPersonId() {
        return fkEmergencyPersonId;
    }

    public void setFkEmergencyPersonId(Long fkEmergencyPersonId) {
        this.fkEmergencyPersonId = fkEmergencyPersonId;
    }

    public static class ConfirmEmergencyPersonServiceRequestBuilder extends BaseServiceRequestBuilder<ConfirmEmergencyPersonServiceRequest> {

        public ConfirmEmergencyPersonServiceRequestBuilder() {
            this.serviceRequest = new ConfirmEmergencyPersonServiceRequest();
        }

        public ConfirmEmergencyPersonServiceRequest buildServiceRequest(ConfirmEmergencyPersonApiRequest confirmEmergencyPersonApiRequest) {
            serviceRequest.setFkEmergencyPersonId(confirmEmergencyPersonApiRequest.getFkEmergencyPersonId());
            serviceRequest.setFkUserId(confirmEmergencyPersonApiRequest.getFkUserId());
            return serviceRequest;
        }

    }
}
