package tr.restApi.emergencyPerson.apiResponse;

import tr.businessService.emergencyPerson.responseBeans.ConfirmEmergencyPersonServiceResponse;
import tr.businessService.emergencyPerson.responseBeans.CreateEmergencyPersonServiceResponse;
import tr.daoLayer.emergencyPerson.dro.EmergencyPersonDRO;
import tr.util.classes.BaseApiResponse;
import tr.util.classes.BaseServiceResponse;

import java.util.List;

public class ConfirmEmergencyPersonApiResponse extends BaseApiResponse {
    private List<EmergencyPersonDRO> emergencyPersonDROList;

    public List<EmergencyPersonDRO> getEmergencyPersonDROList() {
        return emergencyPersonDROList;
    }

    public void setEmergencyPersonDROList(List<EmergencyPersonDRO> emergencyPersonDROList) {
        this.emergencyPersonDROList = emergencyPersonDROList;
    }

    @Override
    protected void buildResponse(BaseServiceResponse baseServiceResponse) {
        ConfirmEmergencyPersonServiceResponse confirmEmergencyPersonServiceResponse = (ConfirmEmergencyPersonServiceResponse) baseServiceResponse;
        this.setEmergencyPersonDROList(confirmEmergencyPersonServiceResponse.getEmergencyPersonDROList());
    }
}
