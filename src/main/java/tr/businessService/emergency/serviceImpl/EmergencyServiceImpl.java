package tr.businessService.emergency.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.businessService.emergency.requestBeans.CheckActiveEmergencyServiceRequest;
import tr.businessService.emergency.requestBeans.CreateEmergencyServiceRequest;
import tr.businessService.emergency.requestBeans.DisableEmergencyServiceRequest;
import tr.businessService.emergency.responseBeans.CheckActiveEmergencyServiceResponse;
import tr.businessService.emergency.responseBeans.CreateEmergencyServiceResponse;
import tr.businessService.emergency.responseBeans.DisableEmergencyServiceResponse;
import tr.businessService.emergency.service.EmergencyService;
import tr.daoLayer.emergency.dao.EmergencyDao;
import tr.util.classes.Message;
import tr.util.classes.MessageTypeENUM;
import tr.util.enums.MessagesNamesEnum;


import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmergencyServiceImpl implements EmergencyService {
    @Autowired
    EmergencyDao emergencyDao;

    @Override
    public CreateEmergencyServiceResponse createEmergency(CreateEmergencyServiceRequest createEmergencyServiceRequest){
        CreateEmergencyServiceResponse.CreateEmergencyServiceResponseBuilder createEmergencyServiceResponseBuilder = new CreateEmergencyServiceResponse.CreateEmergencyServiceResponseBuilder();
        emergencyDao.passiveAllActiveEmergencies(createEmergencyServiceRequest.getEmergency().getFkNumberId());
        if(!emergencyDao.checkActiveEmergency(createEmergencyServiceRequest.getEmergency().getFkNumberId())){
            List<Message> messageList = new ArrayList<>();
            messageList.add(new Message(MessageTypeENUM.EXCEPTION, MessagesNamesEnum.STILL_ACTIVE_EMERGENCY));
            createEmergencyServiceResponseBuilder.getResponse(messageList);
            return createEmergencyServiceResponseBuilder.buildServiceResponse(emergencyDao.getActiveEmergency(createEmergencyServiceRequest.getEmergency().getFkNumberId()));
        }

        emergencyDao.create(createEmergencyServiceRequest.getEmergency());
        return createEmergencyServiceResponseBuilder.buildServiceResponse(createEmergencyServiceRequest.getEmergency());
    }

    @Override
    public CheckActiveEmergencyServiceResponse checkActiveEmergency(CheckActiveEmergencyServiceRequest checkActiveEmergencyServiceRequest){
        CheckActiveEmergencyServiceResponse.CheckActiveEmergencyServiceResponseBuilder checkActiveEmergencyServiceResponseBuilder = new CheckActiveEmergencyServiceResponse.CheckActiveEmergencyServiceResponseBuilder();
        if(emergencyDao.checkActiveEmergency(checkActiveEmergencyServiceRequest.getFkNumberId())){
            List<Message> messageList = new ArrayList<>();
            messageList.add(new Message(MessageTypeENUM.INFO, MessagesNamesEnum.NO_ACTIVE_EMERGENCY));
            return checkActiveEmergencyServiceResponseBuilder.getResponse(messageList);
        }else{
            return checkActiveEmergencyServiceResponseBuilder.buildServiceResponse(emergencyDao.getActiveEmergency(checkActiveEmergencyServiceRequest.getFkNumberId()));
        }

    }

    @Override
    public DisableEmergencyServiceResponse passiveEmergency(DisableEmergencyServiceRequest disableEmergencyServiceRequest){
        DisableEmergencyServiceResponse.DisableEmergencyServiceResponseBuilder disableEmergencyServiceResponseBuilder = new DisableEmergencyServiceResponse.DisableEmergencyServiceResponseBuilder();
        emergencyDao.passiveEmergency(disableEmergencyServiceRequest.getEmergencyId());
        if(emergencyDao.checkActiveEmergencyById(disableEmergencyServiceRequest.getEmergencyId())){
            return disableEmergencyServiceResponseBuilder.buildServiceResponse(true);
        }else{
            return disableEmergencyServiceResponseBuilder.buildServiceResponse(false);
        }

    }
}
