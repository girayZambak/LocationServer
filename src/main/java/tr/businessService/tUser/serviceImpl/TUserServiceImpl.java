package tr.businessService.tUser.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.businessService.confirm.service.ConfirmService;
import tr.businessService.number.service.NumberService;
import tr.businessService.tUser.requestBeans.LogInTUserServiceRequest;
import tr.businessService.tUser.requestBeans.LogOutTUserServiceRequest;
import tr.businessService.tUser.requestBeans.SaveTUserServiceRequest;
import tr.businessService.tUser.responseBeans.LogInTUserServiceResponse;
import tr.businessService.tUser.responseBeans.LogOutTUserServiceResponse;
import tr.businessService.tUser.responseBeans.SaveTUserServiceResponse;
import tr.businessService.tUser.service.TUserService;
import tr.daoLayer.number.dro.NumberDRO;
import tr.daoLayer.tUser.dao.TUserDao;
import tr.daoLayer.tUser.dro.TUserDRO;

@Service
@Transactional
public class TUserServiceImpl implements TUserService {
    @Autowired
    TUserDao tUserDao;
    @Autowired
    ConfirmService confirmService;
    @Autowired
    NumberService numberService;

    @Override
    public SaveTUserServiceResponse saveTUser(SaveTUserServiceRequest saveTUserServiceRequest){
        SaveTUserServiceResponse.SaveTUserServiceResponseBuilder saveTUserServiceResponseBuilder = new SaveTUserServiceResponse.SaveTUserServiceResponseBuilder();

        //numara burada set ediliyor
        NumberDRO numberDRO = numberService.checkAndCreateNumber(saveTUserServiceRequest.getCheckNumberServiceRequest()).getNumberDRO();

        saveTUserServiceRequest.getTUser().setFkNumberId(numberDRO.getId());

        tUserDao.create(saveTUserServiceRequest.getTUser());
        confirmService.saveTUserConfirm(saveTUserServiceRequest.getSaveTUserConfirmServiceRequest());
        return saveTUserServiceResponseBuilder.buildServiceResponse(saveTUserServiceRequest.getTUser(), numberDRO);
    }

    @Override
    public LogInTUserServiceResponse logInTUser(LogInTUserServiceRequest logInTUserServiceRequest){
        LogInTUserServiceResponse.LogInTUserServiceResponseBuilder logInTUserServiceResponseBuilder = new LogInTUserServiceResponse.LogInTUserServiceResponseBuilder();
        tUserDao.setTUserLoggedIn(logInTUserServiceRequest.getFkUserId(), logInTUserServiceRequest.getPassword());
        return logInTUserServiceResponseBuilder.buildServiceResponse(getTUserDRO(logInTUserServiceRequest.getFkUserId()));
    }

    @Override
    public LogOutTUserServiceResponse logOutTUser(LogOutTUserServiceRequest logOutTUserServiceRequest){
        LogOutTUserServiceResponse.LogOutTUserServiceResponseBuilder logOutTUserServiceResponseBuilder = new LogOutTUserServiceResponse.LogOutTUserServiceResponseBuilder();
        tUserDao.setTUserLoggedOut(logOutTUserServiceRequest.getFkUserId());
        return logOutTUserServiceResponseBuilder.buildServiceResponse(getTUserDRO(logOutTUserServiceRequest.getFkUserId()));
    }

    @Override
    public void setTUserConfirmed(Long fkTUserId, Long fkNumberId){
        tUserDao.setTUserPassive(fkNumberId);
        tUserDao.setTUserConfirmed(fkTUserId);
    }

    @Override
    public TUserDRO getTUserDRO(Long fkTUserId){
        return tUserDao.getTUserDRO(fkTUserId);
    }
}
