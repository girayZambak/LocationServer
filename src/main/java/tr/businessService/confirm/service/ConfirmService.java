package tr.businessService.confirm.service;


import tr.businessService.confirm.requestBeans.CheckConfirmSaveUserServiceRequest;
import tr.businessService.confirm.requestBeans.SaveTUserConfirmServiceRequest;
import tr.businessService.confirm.responseBeans.CheckConfirmSaveUserServiceResponse;

public interface ConfirmService {
    public void saveTUserConfirm(SaveTUserConfirmServiceRequest saveTUserConfirmServiceRequest);
    public CheckConfirmSaveUserServiceResponse checkConfirm(CheckConfirmSaveUserServiceRequest checkConfirmSaveUserServiceRequest);
}
