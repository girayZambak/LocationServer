package tr.businessService.emergencyPerson.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.businessService.emergencyPerson.requestBeans.ConfirmEmergencyPersonServiceRequest;
import tr.businessService.emergencyPerson.requestBeans.CreateEmergencyPersonServiceRequest;
import tr.businessService.emergencyPerson.requestBeans.GetFollowingEmergencyPersonsServiceRequest;
import tr.businessService.emergencyPerson.requestBeans.GetMyEmergencyPersonsServiceRequest;
import tr.businessService.emergencyPerson.responseBeans.ConfirmEmergencyPersonServiceResponse;
import tr.businessService.emergencyPerson.responseBeans.CreateEmergencyPersonServiceResponse;
import tr.businessService.emergencyPerson.responseBeans.GetFollowingEmergencyPersonsServiceResponse;
import tr.businessService.emergencyPerson.responseBeans.GetMyEmergencyPersonsServiceResponse;
import tr.businessService.emergencyPerson.service.EmergencyPersonService;
import tr.businessService.number.responseBeans.CheckNumberServiceResponse;
import tr.businessService.number.service.NumberService;
import tr.daoLayer.emergencyPerson.dao.EmergencyPersonDao;
import tr.entity.EmergencyPerson;
import tr.util.enums.ConfirmTypeEnum;

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
    public ConfirmEmergencyPersonServiceResponse confirmEmergencyPerson(ConfirmEmergencyPersonServiceRequest confirmEmergencyPersonServiceRequest){

        EmergencyPerson emergencyPerson = emergencyPersonDao.find(confirmEmergencyPersonServiceRequest.getFkEmergencyPersonId());
        emergencyPerson.setIsConfirmed(true);
        emergencyPersonDao.update(emergencyPerson);

        ConfirmEmergencyPersonServiceResponse.ConfirmEmergencyPersonServiceResponseBuilder confirmEmergencyPersonServiceResponseBuilder = new ConfirmEmergencyPersonServiceResponse.ConfirmEmergencyPersonServiceResponseBuilder();
        return confirmEmergencyPersonServiceResponseBuilder.buildServiceResponse(emergencyPersonDao.getMyEmergencyPersons(confirmEmergencyPersonServiceRequest.getFkUserId()));
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
