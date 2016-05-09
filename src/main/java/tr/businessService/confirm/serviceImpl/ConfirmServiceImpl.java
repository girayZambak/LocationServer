package tr.businessService.confirm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.businessService.confirm.requestBeans.CheckConfirmSaveUserServiceRequest;
import tr.businessService.confirm.requestBeans.SaveTUserConfirmServiceRequest;
import tr.businessService.confirm.responseBeans.CheckConfirmSaveUserServiceResponse;
import tr.businessService.confirm.service.ConfirmService;
import tr.businessService.tUser.service.TUserService;
import tr.daoLayer.confirm.dao.ConfirmDao;
import tr.daoLayer.tUser.dao.TUserDao;
import tr.daoLayer.tUser.dro.TUserDRO;
import tr.entity.TUser;
import tr.util.classes.DefaultServiceResponse;

@Service
@Transactional
public class ConfirmServiceImpl implements ConfirmService {
    @Autowired
    ConfirmDao confirmDao;
    @Autowired
    TUserService tUserService;

    @Override
    public DefaultServiceResponse saveTUserConfirm(SaveTUserConfirmServiceRequest saveTUserConfirmServiceRequest){
        DefaultServiceResponse.DefaultServiceResponseBuilder defaultServiceResponseBuilder = new DefaultServiceResponse.DefaultServiceResponseBuilder();

        saveTUserConfirmServiceRequest.getConfirm().setFkTUserId(saveTUserConfirmServiceRequest.getConfirm().gettUser().getId());
        confirmDao.create(saveTUserConfirmServiceRequest.getConfirm());

        return defaultServiceResponseBuilder.getResponse();
    }

    @Override
    public CheckConfirmSaveUserServiceResponse checkConfirm(CheckConfirmSaveUserServiceRequest checkConfirmSaveUserServiceRequest){
        CheckConfirmSaveUserServiceResponse.CheckConfirmSaveUserServiceResponseBuilder checkConfirmSaveUserServiceResponseBuilder = new CheckConfirmSaveUserServiceResponse.CheckConfirmSaveUserServiceResponseBuilder();
        if(!confirmDao.checkConfirm(checkConfirmSaveUserServiceRequest.getCheckConfirm().getFkUserId(), checkConfirmSaveUserServiceRequest.getCheckConfirm().getFkConfirmTypeId(), checkConfirmSaveUserServiceRequest.getCheckConfirm().getCode())){
            confirmDao.setConfirmPassive(checkConfirmSaveUserServiceRequest.getCheckConfirm().getFkUserId(), checkConfirmSaveUserServiceRequest.getCheckConfirm().getFkConfirmTypeId(), checkConfirmSaveUserServiceRequest.getCheckConfirm().getCode());
            tUserService.setTUserConfirmed(checkConfirmSaveUserServiceRequest.getCheckConfirm().getFkUserId(), checkConfirmSaveUserServiceRequest.getCheckConfirm().getFkNumberId());
        }
        return checkConfirmSaveUserServiceResponseBuilder.buildServiceResponse(tUserService.getTUserDRO(checkConfirmSaveUserServiceRequest.getCheckConfirm().getFkUserId()));
    }
}
