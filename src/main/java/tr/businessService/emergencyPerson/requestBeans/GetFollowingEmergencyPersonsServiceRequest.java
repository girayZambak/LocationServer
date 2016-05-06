package tr.businessService.emergencyPerson.requestBeans;

import tr.restApi.emergencyPerson.apiRequest.GetFollowingEmergencyPersonsApiRequest;
import tr.restApi.emergencyPerson.apiRequest.GetMyEmergencyPersonsApiRequest;
import tr.util.classes.BaseServiceRequest;

public class GetFollowingEmergencyPersonsServiceRequest extends BaseServiceRequest {
    private Long fkNumberId;

    public Long getFkNumberId() {
        return fkNumberId;
    }

    public void setFkNumberId(Long fkNumberId) {
        this.fkNumberId = fkNumberId;
    }

    public static class GetFollowingEmergencyPersonsServiceRequestBuilder extends BaseServiceRequestBuilder<GetFollowingEmergencyPersonsServiceRequest> {

        public GetFollowingEmergencyPersonsServiceRequestBuilder() {
            this.serviceRequest = new GetFollowingEmergencyPersonsServiceRequest();
        }

        public GetFollowingEmergencyPersonsServiceRequest buildServiceRequest(GetFollowingEmergencyPersonsApiRequest getFollowingEmergencyPersonsApiRequest) {
           serviceRequest.setFkNumberId(getFollowingEmergencyPersonsApiRequest.getFkNumberId());
            return serviceRequest;
        }

    }
}
