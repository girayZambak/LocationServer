package tr.businessService.emergencyPerson.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.businessService.emergencyPerson.requestBeans.*;
import tr.businessService.emergencyPerson.responseBeans.*;
import tr.businessService.emergencyPerson.service.EmergencyPersonService;
import tr.businessService.number.responseBeans.CheckNumberServiceResponse;
import tr.businessService.number.service.NumberService;
import tr.daoLayer.emergencyPerson.dao.EmergencyPersonDao;
import tr.entity.EmergencyPerson;
import tr.util.classes.DefaultServiceResponse;

@Service
@Transactional
public class EmergencyPersonServiceImpl implements EmergencyPersonService {
    @Autowired
    EmergencyPersonDao emergencyPersonDao;
    @Autowired
    NumberService numberService;

    @Override
    public CreateEmergencyPersonServiceResponse createEmergencyPerson(CreateEmergencyPersonServiceRequest createEmergencyPersonServiceRequest){
        CreateEmergencyPersonServiceResponse.CreateEmergencyPersonServiceResponseBuilder createEmergencyPersonServiceResponseBuilder = new CreateEmergencyPersonServiceResponse.CreateEmergencyPersonServiceResponseBuilder();

        CheckNumberServiceResponse checkNumberServiceResponse = numberService.checkAndCreateNumber(createEmergencyPersonServiceRequest.getCheckNumberServiceRequest());
        createEmergencyPersonServiceRequest.getEmergencyPerson().setFkReceiverNumberId(checkNumberServiceResponse.getNumberDRO().getId());

        emergencyPersonDao.create(createEmergencyPersonServiceRequest.getEmergencyPerson());

        return createEmergencyPersonServiceResponseBuilder.buildServiceResponse(createEmergencyPersonServiceRequest.getEmergencyPerson());
    }

    @Override
    public DefaultServiceResponse deleteEmergencyPerson(DeleteEmergencyPersonServiceRequest deleteEmergencyPersonServiceRequest){
        DefaultServiceResponse.DefaultServiceResponseBuilder defaultServiceResponseBuilder = new DefaultServiceResponse.DefaultServiceResponseBuilder();

        emergencyPersonDao.delete(deleteEmergencyPersonServiceRequest.getFkEmergencyPersonId());

        return defaultServiceResponseBuilder.getResponse();
    }


    @Override
    public DefaultServiceResponse confirmEmergencyPerson(ConfirmEmergencyPersonServiceRequest confirmEmergencyPersonServiceRequest){
        DefaultServiceResponse.DefaultServiceResponseBuilder defaultServiceResponseBuilder = new DefaultServiceResponse.DefaultServiceResponseBuilder();

        EmergencyPerson emergencyPerson = emergencyPersonDao.find(confirmEmergencyPersonServiceRequest.getFkEmergencyPersonId());
        emergencyPerson.setIsConfirmed(true);
        emergencyPersonDao.update(emergencyPerson);

        return defaultServiceResponseBuilder.getResponse();
    }

    @Override
    public GetMyEmergencyPersonsServiceResponse getMyEmergencyPersons(GetMyEmergencyPersonsServiceRequest getMyEmergencyPersonsServiceRequest){
        GetMyEmergencyPersonsServiceResponse.GetMyEmergencyPersonsServiceResponseBuilder getMyEmergencyPersonsServiceResponseBuilder = new GetMyEmergencyPersonsServiceResponse.GetMyEmergencyPersonsServiceResponseBuilder();
        return getMyEmergencyPersonsServiceResponseBuilder.buildServiceResponse(emergencyPersonDao.getMyEmergencyPersons(getMyEmergencyPersonsServiceRequest.getFkUserId()));
    }

    @Override
    public GetFollowingEmergencyPersonsServiceResponse getFollowingEmergencyPersons(GetFollowingEmergencyPersonsServiceRequest getFollowingEmergencyPersonsServiceRequest){
        GetFollowingEmergencyPersonsServiceResponse.GetFollowingEmergencyPersonsServiceResponseBuilder getFollowingEmergencyPersonsServiceResponseBuilder = new GetFollowingEmergencyPersonsServiceResponse.GetFollowingEmergencyPersonsServiceResponseBuilder();
        return getFollowingEmergencyPersonsServiceResponseBuilder.buildServiceResponse(emergencyPersonDao.getFollowingEmergencyPersons(getFollowingEmergencyPersonsServiceRequest.getFkNumberId()));
    }
}
