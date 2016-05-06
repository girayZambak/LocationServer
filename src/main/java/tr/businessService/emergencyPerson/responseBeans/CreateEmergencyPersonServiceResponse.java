package tr.businessService.emergencyPerson.responseBeans;


import tr.daoLayer.emergency.dro.EmergencyDRO;
import tr.daoLayer.emergencyPerson.dro.EmergencyPersonDRO;
import tr.entity.Emergency;
import tr.entity.EmergencyPerson;
import tr.util.classes.BaseServiceResponse;

public class CreateEmergencyPersonServiceResponse extends BaseServiceResponse {
    private EmergencyPersonDRO emergencyPersonDRO;

    public EmergencyPersonDRO getEmergencyPersonDRO() {
        return emergencyPersonDRO;
    }

    public void setEmergencyPersonDRO(EmergencyPersonDRO emergencyPersonDRO) {
        this.emergencyPersonDRO = emergencyPersonDRO;
    }

    public static class CreateEmergencyPersonServiceResponseBuilder extends BaseServiceResponseBuilder<CreateEmergencyPersonServiceResponse> {
        public CreateEmergencyPersonServiceResponse buildServiceResponse(EmergencyPerson emergencyPerson) {

            EmergencyPersonDRO emergencyPersonDRO = new EmergencyPersonDRO(emergencyPerson.getId(),emergencyPerson.getFkSenderUserId(),emergencyPerson.getFkReceiverNumberId(),emergencyPerson.getName(),emergencyPerson.getSurname(),emergencyPerson.getActive(),emergencyPerson.getIsConfirmed());

            serviceResponse.setEmergencyPersonDRO(emergencyPersonDRO);

            return serviceResponse;
        }

        public CreateEmergencyPersonServiceResponse buildServiceResponse(EmergencyPersonDRO emergencyPersonDRO) {

            serviceResponse.setEmergencyPersonDRO(emergencyPersonDRO);

            return serviceResponse;
        }
    }
}
