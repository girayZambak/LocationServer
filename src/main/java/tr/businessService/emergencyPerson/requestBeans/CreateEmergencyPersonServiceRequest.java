package tr.businessService.emergencyPerson.requestBeans;

import tr.businessService.number.requestBeans.CheckNumberServiceRequest;
import tr.entity.EmergencyPerson;
import tr.restApi.emergencyPerson.apiRequest.CreateEmergencyPersonApiRequest;
import tr.util.classes.BaseServiceRequest;
import tr.util.enums.ActiveEnum;

public class CreateEmergencyPersonServiceRequest extends BaseServiceRequest {
    private EmergencyPerson emergencyPerson;
    private CheckNumberServiceRequest checkNumberServiceRequest;

    public CheckNumberServiceRequest getCheckNumberServiceRequest() {
        return checkNumberServiceRequest;
    }

    public void setCheckNumberServiceRequest(CheckNumberServiceRequest checkNumberServiceRequest) {
        this.checkNumberServiceRequest = checkNumberServiceRequest;
    }

    public EmergencyPerson getEmergencyPerson() {
        return emergencyPerson;
    }

    public void setEmergencyPerson(EmergencyPerson emergencyPerson) {
        this.emergencyPerson = emergencyPerson;
    }

    public static class CreateEmergencyPersonServiceRequestBuilder extends BaseServiceRequestBuilder<CreateEmergencyPersonServiceRequest> {

        public CreateEmergencyPersonServiceRequestBuilder() {
            this.serviceRequest = new CreateEmergencyPersonServiceRequest();
        }

        public CreateEmergencyPersonServiceRequest buildServiceRequest(CreateEmergencyPersonApiRequest createEmergencyPersonApiRequest) {
            EmergencyPerson emergencyPerson = new EmergencyPerson();
            CheckNumberServiceRequest.CheckNumberServiceRequestBuilder checkNumberServiceRequestBuilder = new CheckNumberServiceRequest.CheckNumberServiceRequestBuilder();

            emergencyPerson.setFkSenderUserId(createEmergencyPersonApiRequest.getFkSenderUserId());
            emergencyPerson.setName(createEmergencyPersonApiRequest.getName());
            emergencyPerson.setSurname(createEmergencyPersonApiRequest.getSurname());
            emergencyPerson.setActive(ActiveEnum.ACTIVE.getValue());
            emergencyPerson.setIsConfirmed(ActiveEnum.PASSIVE.getValue());

            serviceRequest.setCheckNumberServiceRequest(checkNumberServiceRequestBuilder.buildServiceRequest(createEmergencyPersonApiRequest.getAreaCode(),createEmergencyPersonApiRequest.getNumber()));
            serviceRequest.setEmergencyPerson(emergencyPerson);
            return serviceRequest;
        }

    }
}
