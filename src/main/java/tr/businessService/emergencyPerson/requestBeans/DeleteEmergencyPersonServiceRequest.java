package tr.businessService.emergencyPerson.requestBeans;

import tr.restApi.emergencyPerson.apiRequest.ConfirmEmergencyPersonApiRequest;
import tr.restApi.emergencyPerson.apiRequest.DeleteEmergencyPersonApiRequest;
import tr.util.classes.BaseServiceRequest;

public class DeleteEmergencyPersonServiceRequest extends BaseServiceRequest {
    private Long fkEmergencyPersonId;

    public Long getFkEmergencyPersonId() {
        return fkEmergencyPersonId;
    }

    public void setFkEmergencyPersonId(Long fkEmergencyPersonId) {
        this.fkEmergencyPersonId = fkEmergencyPersonId;
    }

    public static class DeleteEmergencyPersonServiceRequestBuilder extends BaseServiceRequestBuilder<DeleteEmergencyPersonServiceRequest> {

        public DeleteEmergencyPersonServiceRequestBuilder() {
            this.serviceRequest = new DeleteEmergencyPersonServiceRequest();
        }

        public DeleteEmergencyPersonServiceRequest buildServiceRequest(DeleteEmergencyPersonApiRequest deleteEmergencyPersonApiRequeste) {
            serviceRequest.setFkEmergencyPersonId(deleteEmergencyPersonApiRequeste.getFkEmergencyPersonId());
            return serviceRequest;
        }

    }
}
