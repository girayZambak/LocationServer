package tr.restApi.location.apiResponse;

import tr.businessService.location.responseBeans.GetLocationByEmergencyServiceResponse;
import tr.daoLayer.location.dro.LocationDRO;
import tr.util.classes.BaseApiResponse;
import tr.util.classes.BaseServiceResponse;

public class GetLocationByEmergencyApiResponse extends BaseApiResponse {
    private LocationDRO locationDRO;

    public LocationDRO getLocationDRO() {
        return locationDRO;
    }

    public void setLocationDRO(LocationDRO locationDRO) {
        this.locationDRO = locationDRO;
    }

    @Override
    protected void buildResponse(BaseServiceResponse baseServiceResponse) {
        GetLocationByEmergencyServiceResponse getLocationByEmergencyServiceResponse = (GetLocationByEmergencyServiceResponse) baseServiceResponse;
        this.setLocationDRO(getLocationByEmergencyServiceResponse.getLocationDRO());
    }
}

