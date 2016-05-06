package tr.businessService.emergencyPerson.responseBeans;


import tr.daoLayer.emergencyPerson.dro.EmergencyPersonDRO;
import tr.util.classes.BaseServiceResponse;

import java.util.List;

public class GetMyEmergencyPersonsServiceResponse extends BaseServiceResponse {
    private List<EmergencyPersonDRO> emergencyPersonDROList;

    public List<EmergencyPersonDRO> getEmergencyPersonDROList() {
        return emergencyPersonDROList;
    }

    public void setEmergencyPersonDROList(List<EmergencyPersonDRO> emergencyPersonDROList) {
        this.emergencyPersonDROList = emergencyPersonDROList;
    }

    public static class GetMyEmergencyPersonsServiceResponseBuilder extends BaseServiceResponseBuilder<GetMyEmergencyPersonsServiceResponse> {
        public GetMyEmergencyPersonsServiceResponse buildServiceResponse(List<EmergencyPersonDRO> emergencyPersonDROList) {

            serviceResponse.setEmergencyPersonDROList(emergencyPersonDROList);

            return serviceResponse;
        }
    }
}
