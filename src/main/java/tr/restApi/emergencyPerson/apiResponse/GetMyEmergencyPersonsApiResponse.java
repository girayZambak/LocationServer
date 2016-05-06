package tr.restApi.emergencyPerson.apiResponse;

import tr.businessService.emergencyPerson.responseBeans.CreateEmergencyPersonServiceResponse;
import tr.businessService.emergencyPerson.responseBeans.GetMyEmergencyPersonsServiceResponse;
import tr.daoLayer.emergencyPerson.dro.EmergencyPersonDRO;
import tr.util.classes.BaseApiResponse;
import tr.util.classes.BaseServiceResponse;

import java.util.List;

public class GetMyEmergencyPersonsApiResponse extends BaseApiResponse {
    private List<EmergencyPersonDRO> emergencyPersonDROList;

    public List<EmergencyPersonDRO> getEmergencyPersonDROList() {
        return emergencyPersonDROList;
    }

    public void setEmergencyPersonDROList(List<EmergencyPersonDRO> emergencyPersonDROList) {
        this.emergencyPersonDROList = emergencyPersonDROList;
    }

    @Override
    protected void buildResponse(BaseServiceResponse baseServiceResponse) {
        GetMyEmergencyPersonsServiceResponse getMyEmergencyPersonsServiceResponse = (GetMyEmergencyPersonsServiceResponse) baseServiceResponse;
        this.setEmergencyPersonDROList(getMyEmergencyPersonsServiceResponse.getEmergencyPersonDROList());
    }
}
