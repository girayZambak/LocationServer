package tr.businessService.location.responseBeans;


import tr.daoLayer.location.dro.LocationDRO;
import tr.entity.Location;
import tr.util.classes.BaseServiceResponse;

public class GetLocationByEmergencyServiceResponse extends BaseServiceResponse {
    private LocationDRO locationDRO;

    public LocationDRO getLocationDRO() {
        return locationDRO;
    }

    public void setLocationDRO(LocationDRO locationDRO) {
        this.locationDRO = locationDRO;
    }

    public static class GetLocationByEmergencyServiceResponseBuilder extends BaseServiceResponseBuilder<GetLocationByEmergencyServiceResponse> {

        public GetLocationByEmergencyServiceResponse buildServiceResponse(LocationDRO locationDRO) {

            serviceResponse.setLocationDRO(locationDRO);

            return serviceResponse;
        }
    }
}
