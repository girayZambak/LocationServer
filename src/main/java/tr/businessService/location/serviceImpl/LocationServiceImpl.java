package tr.businessService.location.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.businessService.location.requestBeans.CreateLocationServiceRequest;
import tr.businessService.location.requestBeans.GetLocationByEmergencyServiceRequest;
import tr.businessService.location.responseBeans.CreateLocationServiceResponse;
import tr.businessService.location.responseBeans.GetLocationByEmergencyServiceResponse;
import tr.businessService.location.service.LocationService;
import tr.daoLayer.emergency.dao.EmergencyDao;
import tr.daoLayer.location.dao.LocationDao;
import tr.daoLayer.location.dro.LocationDRO;
import tr.util.classes.Message;
import tr.util.classes.MessageTypeENUM;
import tr.util.enums.MessagesNamesEnum;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationDao locationDao;

    @Override
    public CreateLocationServiceResponse createLocation(CreateLocationServiceRequest createLocationServiceRequest){
        CreateLocationServiceResponse.CreateLocationServiceResponseBuilder createEmergencyServiceResponseBuilder = new CreateLocationServiceResponse.CreateLocationServiceResponseBuilder();

        locationDao.create(createLocationServiceRequest.getLocation());

        return createEmergencyServiceResponseBuilder.buildServiceResponse(createLocationServiceRequest.getLocation());
    }

    @Override
    public GetLocationByEmergencyServiceResponse getLocationByEmergency(GetLocationByEmergencyServiceRequest getLocationByEmergencyServiceRequest){
        GetLocationByEmergencyServiceResponse.GetLocationByEmergencyServiceResponseBuilder getLocationByEmergencyServiceResponseBuilder = new GetLocationByEmergencyServiceResponse.GetLocationByEmergencyServiceResponseBuilder();

        LocationDRO locationDRO = locationDao.getLocationByEmergencyId(getLocationByEmergencyServiceRequest.getFkEmergencyId());

        return getLocationByEmergencyServiceResponseBuilder.buildServiceResponse(locationDRO);
    }

}
