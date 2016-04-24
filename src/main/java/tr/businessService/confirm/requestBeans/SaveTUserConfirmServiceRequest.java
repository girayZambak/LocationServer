package tr.businessService.confirm.requestBeans;

import tr.entity.Confirm;
import tr.entity.TUser;
import tr.restApi.tUser.apiRequest.SaveTUserApiRequest;
import tr.util.classes.BaseServiceRequest;
import tr.util.classes.Md5Encyript;

public class SaveTUserConfirmServiceRequest extends BaseServiceRequest {
    private Confirm confirm;

    public Confirm getConfirm() {
        return confirm;
    }

    public void setConfirm(Confirm confirm) {
        this.confirm = confirm;
    }

    public static class SaveTUserConfirmServiceRequestBuilder extends BaseServiceRequestBuilder<SaveTUserConfirmServiceRequest> {

        public SaveTUserConfirmServiceRequestBuilder() {
            this.serviceRequest = new SaveTUserConfirmServiceRequest();
        }

        public SaveTUserConfirmServiceRequest buildServiceRequest(Confirm confirm) {
            String code = "1234";

            confirm.setActive(true);
            confirm.setCode(Md5Encyript.cryptWithMD5(code));

            serviceRequest.setConfirm(confirm);
            return serviceRequest;
        }

    }
}
