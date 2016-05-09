package tr.businessService.location.requestBeans;

import tr.entity.Emergency;
import tr.entity.Location;
import tr.restApi.emergency.apiRequest.CreateEmergencyApiRequest;
import tr.restApi.location.apiRequest.CreateLocationApiRequest;
import tr.util.classes.BaseServiceRequest;

public class CreateLocationServiceRequest extends BaseServiceRequest {
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public static class CreateLocationServiceRequestBuilder extends BaseServiceRequestBuilder<CreateLocationServiceRequest> {

        public CreateLocationServiceRequestBuilder() {
            this.serviceRequest = new CreateLocationServiceRequest();
        }

        public CreateLocationServiceRequest buildServiceRequest(CreateLocationApiRequest createLocationApiRequest) {
            Location location = new Location();

            location.setFkLocationSendType(createLocationApiRequest.getFkLocationSendType());
            location.setFkEmergencyId(createLocationApiRequest.getFkEmergencyId());
            location.setLongitude(createLocationApiRequest.getLongitude());
            location.setLatitude(createLocationApiRequest.getLatitude());

            serviceRequest.setLocation(location);
            return serviceRequest;
        }

    }
}
