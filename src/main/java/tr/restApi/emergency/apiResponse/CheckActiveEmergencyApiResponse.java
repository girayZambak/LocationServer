package tr.restApi.emergency.apiResponse;

import tr.businessService.emergency.responseBeans.CheckActiveEmergencyServiceResponse;
import tr.businessService.emergency.responseBeans.CreateEmergencyServiceResponse;
import tr.daoLayer.emergency.dro.EmergencyDRO;
import tr.util.classes.BaseApiResponse;
import tr.util.classes.BaseServiceResponse;

public class CheckActiveEmergencyApiResponse extends BaseApiResponse {
    private EmergencyDRO emergencyDRO;

    public EmergencyDRO getEmergencyDRO() {
        return emergencyDRO;
    }

    public void setEmergencyDRO(EmergencyDRO emergencyDRO) {
        this.emergencyDRO = emergencyDRO;
    }

    @Override
    protected void buildResponse(BaseServiceResponse baseServiceResponse) {
        CheckActiveEmergencyServiceResponse createEmergencyServiceResponse = (CheckActiveEmergencyServiceResponse) baseServiceResponse;
        this.setEmergencyDRO(createEmergencyServiceResponse.getEmergencyDRO());
    }
}
