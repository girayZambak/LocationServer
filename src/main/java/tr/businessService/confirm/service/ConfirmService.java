package tr.businessService.confirm.service;


import tr.businessService.confirm.requestBeans.CheckConfirmSaveUserServiceRequest;
import tr.businessService.confirm.requestBeans.SaveTUserConfirmServiceRequest;
import tr.businessService.confirm.responseBeans.CheckConfirmSaveUserServiceResponse;
import tr.util.classes.DefaultServiceResponse;

public interface ConfirmService {
    public DefaultServiceResponse saveTUserConfirm(SaveTUserConfirmServiceRequest saveTUserConfirmServiceRequest);
    public CheckConfirmSaveUserServiceResponse checkConfirm(CheckConfirmSaveUserServiceRequest checkConfirmSaveUserServiceRequest);
}
