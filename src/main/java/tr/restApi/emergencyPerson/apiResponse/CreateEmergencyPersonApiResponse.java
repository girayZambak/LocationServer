package tr.restApi.emergencyPerson.apiResponse;

import tr.businessService.emergencyPerson.responseBeans.CreateEmergencyPersonServiceResponse;
import tr.daoLayer.emergencyPerson.dro.EmergencyPersonDRO;
import tr.util.classes.BaseApiResponse;
import tr.util.classes.BaseServiceResponse;

public class CreateEmergencyPersonApiResponse extends BaseApiResponse {
    private EmergencyPersonDRO emergencyPersonDRO;

    public EmergencyPersonDRO getEmergencyPersonDRO() {
        return emergencyPersonDRO;
    }

    public void setEmergencyPersonDRO(EmergencyPersonDRO emergencyPersonDRO) {
        this.emergencyPersonDRO = emergencyPersonDRO;
    }

    @Override
    protected void buildResponse(BaseServiceResponse baseServiceResponse) {
        CreateEmergencyPersonServiceResponse createEmergencyServiceResponse = (CreateEmergencyPersonServiceResponse) baseServiceResponse;
        this.setEmergencyPersonDRO(createEmergencyServiceResponse.getEmergencyPersonDRO());
    }
}
