package tr.businessService.tUser.requestBeans;

import tr.businessService.confirm.requestBeans.SaveTUserConfirmServiceRequest;
import tr.businessService.number.requestBeans.CheckNumberServiceRequest;
import tr.entity.Confirm;
import tr.entity.TUser;
import tr.restApi.tUser.apiRequest.SaveTUserApiRequest;
import tr.util.classes.BaseServiceRequest;
import tr.util.classes.Md5Encyript;
import tr.util.enums.ConfirmTypeEnum;

public class SaveTUserServiceRequest extends BaseServiceRequest {
    private TUser tUser;
    private SaveTUserConfirmServiceRequest saveTUserConfirmServiceRequest;
    private CheckNumberServiceRequest checkNumberServiceRequest;

    public CheckNumberServiceRequest getCheckNumberServiceRequest() {
        return checkNumberServiceRequest;
    }

    public void setCheckNumberServiceRequest(CheckNumberServiceRequest checkNumberServiceRequest) {
        this.checkNumberServiceRequest = checkNumberServiceRequest;
    }

    public SaveTUserConfirmServiceRequest getSaveTUserConfirmServiceRequest() {
        return saveTUserConfirmServiceRequest;
    }

    public void setSaveTUserConfirmServiceRequest(SaveTUserConfirmServiceRequest saveTUserConfirmServiceRequest) {
        this.saveTUserConfirmServiceRequest = saveTUserConfirmServiceRequest;
    }

    public TUser getTUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }

    public static class SaveTUserServiceRequestBuilder extends BaseServiceRequestBuilder<SaveTUserServiceRequest> {

        public SaveTUserServiceRequestBuilder() {
            this.serviceRequest = new SaveTUserServiceRequest();
        }

        public SaveTUserServiceRequest buildServiceRequest(SaveTUserApiRequest saveTUserApiRequest) {
            TUser tUser = new TUser();
            CheckNumberServiceRequest.CheckNumberServiceRequestBuilder  checkNumberServiceRequestBuilder = new CheckNumberServiceRequest.CheckNumberServiceRequestBuilder();
            SaveTUserConfirmServiceRequest.SaveTUserConfirmServiceRequestBuilder saveTUserConfirmServiceRequestBuilder = new SaveTUserConfirmServiceRequest.SaveTUserConfirmServiceRequestBuilder();


            tUser.setPassword(Md5Encyript.cryptWithMD5(saveTUserApiRequest.getPassword()));
            tUser.setName(saveTUserApiRequest.getName());
            tUser.setSurname(saveTUserApiRequest.getSurname());
            tUser.seteMail(saveTUserApiRequest.geteMail());
            tUser.setDateOfBirth(saveTUserApiRequest.getDateOfBirth());
            tUser.setDeviceId(saveTUserApiRequest.getDeviceId());
            tUser.setSimSerialNumber(saveTUserApiRequest.getSimSerialNumber());
            tUser.setRegId(saveTUserApiRequest.getRegId());

            tUser.setActive(false);
            tUser.setIsLogin(false);
            tUser.setIsConfirmed(false);

            serviceRequest.settUser(tUser);

            //confirm oluþturmak için request
            Confirm confirm = new Confirm();
            confirm.settUser(tUser);
            confirm.setFkConfirmTypeId(ConfirmTypeEnum.SAVE_USER.getValue());
            serviceRequest.setSaveTUserConfirmServiceRequest(saveTUserConfirmServiceRequestBuilder.buildServiceRequest(confirm));

            //numara kontrolü icin request
            serviceRequest.setCheckNumberServiceRequest(checkNumberServiceRequestBuilder.buildServiceRequest(saveTUserApiRequest.getAreaCode(), saveTUserApiRequest.getNumber()));

            return serviceRequest;
        }

    }
}
