package tr.restApi.emergency.apiResponse;

import tr.businessService.emergency.responseBeans.CheckActiveEmergencyServiceResponse;
import tr.businessService.emergency.responseBeans.DisableEmergencyServiceResponse;
import tr.daoLayer.emergency.dro.EmergencyDRO;
import tr.util.classes.BaseApiResponse;
import tr.util.classes.BaseServiceResponse;

public class DisableEmergencyApiResponse extends BaseApiResponse {
    private Boolean isEmergencyDisabled;

    public Boolean getIsEmergencyDisabled() {
        return isEmergencyDisabled;
    }

    public void setIsEmergencyDisabled(Boolean isEmergencyDisabled) {
        this.isEmergencyDisabled = isEmergencyDisabled;
    }

    @Override
    protected void buildResponse(BaseServiceResponse baseServiceResponse) {
        DisableEmergencyServiceResponse disableEmergencyServiceResponse = (DisableEmergencyServiceResponse) baseServiceResponse;
        this.setIsEmergencyDisabled(disableEmergencyServiceResponse.getIsEmergencyDisabled());
    }
}
