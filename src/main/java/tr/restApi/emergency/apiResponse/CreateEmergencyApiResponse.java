package tr.restApi.emergency.apiResponse;

import tr.businessService.emergency.responseBeans.CreateEmergencyServiceResponse;
import tr.businessService.tUser.responseBeans.SaveTUserServiceResponse;
import tr.daoLayer.emergency.dro.EmergencyDRO;
import tr.daoLayer.tUser.dro.TUserDRO;
import tr.util.classes.BaseApiResponse;
import tr.util.classes.BaseServiceResponse;

public class CreateEmergencyApiResponse extends BaseApiResponse {
    private EmergencyDRO emergencyDRO;

    public EmergencyDRO getEmergencyDRO() {
        return emergencyDRO;
    }

    public void setEmergencyDRO(EmergencyDRO emergencyDRO) {
        this.emergencyDRO = emergencyDRO;
    }

    @Override
    protected void buildResponse(BaseServiceResponse baseServiceResponse) {
        CreateEmergencyServiceResponse createEmergencyServiceResponse = (CreateEmergencyServiceResponse) baseServiceResponse;
        this.setEmergencyDRO(createEmergencyServiceResponse.getEmergencyDRO());
    }
}
