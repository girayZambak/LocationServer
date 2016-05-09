package tr.businessService.location.responseBeans;


import tr.daoLayer.emergency.dro.EmergencyDRO;
import tr.daoLayer.location.dro.LocationDRO;
import tr.entity.Emergency;
import tr.entity.Location;
import tr.util.classes.BaseServiceResponse;
import tr.util.enums.EmergencyStatusEnum;

public class CreateLocationServiceResponse extends BaseServiceResponse {
    private LocationDRO locationDRO;

    public LocationDRO getLocationDRO() {
        return locationDRO;
    }

    public void setLocationDRO(LocationDRO locationDRO) {
        this.locationDRO = locationDRO;
    }

    public static class CreateLocationServiceResponseBuilder extends BaseServiceResponseBuilder<CreateLocationServiceResponse> {
        public CreateLocationServiceResponse buildServiceResponse(Location location) {

            LocationDRO locationDRO = new LocationDRO(location.getId(),location.getLatitude(),location.getLongitude(),location.getFkEmergencyId(),location.getFkLocationSendType(), true, null);

            serviceResponse.setLocationDRO(locationDRO);

            return serviceResponse;
        }

        public CreateLocationServiceResponse buildServiceResponse(LocationDRO locationDRO) {

            serviceResponse.setLocationDRO(locationDRO);

            return serviceResponse;
        }
    }
}
