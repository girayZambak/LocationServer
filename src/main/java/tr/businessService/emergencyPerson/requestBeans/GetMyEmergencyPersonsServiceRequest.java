package tr.businessService.emergencyPerson.requestBeans;

import tr.businessService.number.requestBeans.CheckNumberServiceRequest;
import tr.entity.EmergencyPerson;
import tr.restApi.emergencyPerson.apiRequest.CreateEmergencyPersonApiRequest;
import tr.restApi.emergencyPerson.apiRequest.GetMyEmergencyPersonsApiRequest;
import tr.util.classes.BaseServiceRequest;
import tr.util.enums.ActiveEnum;

public class GetMyEmergencyPersonsServiceRequest extends BaseServiceRequest {
    private Long fkUserId;

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public static class GetMyEmergencyPersonsServiceRequestBuilder extends BaseServiceRequestBuilder<GetMyEmergencyPersonsServiceRequest> {

        public GetMyEmergencyPersonsServiceRequestBuilder() {
            this.serviceRequest = new GetMyEmergencyPersonsServiceRequest();
        }

        public GetMyEmergencyPersonsServiceRequest buildServiceRequest(GetMyEmergencyPersonsApiRequest getMyEmergencyPersonsApiRequest) {
           serviceRequest.setFkUserId(getMyEmergencyPersonsApiRequest.getFkUserId());
            return serviceRequest;
        }

    }
}
