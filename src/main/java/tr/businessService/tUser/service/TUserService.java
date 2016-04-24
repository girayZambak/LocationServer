package tr.businessService.tUser.service;


import tr.businessService.tUser.requestBeans.LogInTUserServiceRequest;
import tr.businessService.tUser.requestBeans.LogOutTUserServiceRequest;
import tr.businessService.tUser.requestBeans.SaveTUserServiceRequest;
import tr.businessService.tUser.responseBeans.LogInTUserServiceResponse;
import tr.businessService.tUser.responseBeans.LogOutTUserServiceResponse;
import tr.businessService.tUser.responseBeans.SaveTUserServiceResponse;
import tr.daoLayer.tUser.dro.TUserDRO;

public interface TUserService {
    public SaveTUserServiceResponse saveTUser(SaveTUserServiceRequest saveTUserServiceRequest);
    public void setTUserConfirmed(Long fkTUserId, Long fkNumberId);
    public TUserDRO getTUserDRO(Long fkTUserId);
    public LogInTUserServiceResponse logInTUser(LogInTUserServiceRequest logInTUserServiceRequest);
    public LogOutTUserServiceResponse logOutTUser(LogOutTUserServiceRequest logOutTUserServiceRequest);
}
