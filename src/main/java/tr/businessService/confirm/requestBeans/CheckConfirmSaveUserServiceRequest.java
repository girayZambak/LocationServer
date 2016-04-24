package tr.businessService.confirm.requestBeans;

import tr.entity.Confirm;
import tr.restApi.confirm.apiRequest.CheckConfirmSaveUserApiRequest;
import tr.util.classes.BaseServiceRequest;
import tr.util.classes.Md5Encyript;
import tr.util.enums.ConfirmTypeEnum;

public class CheckConfirmSaveUserServiceRequest extends BaseServiceRequest {
    private CheckConfirm checkConfirm;

    public CheckConfirm getCheckConfirm() {
        return checkConfirm;
    }

    public void setCheckConfirm(CheckConfirm checkConfirm) {
        this.checkConfirm = checkConfirm;
    }

    public static class CheckConfirmSaveUserServiceRequestBuilder extends BaseServiceRequestBuilder<CheckConfirmSaveUserServiceRequest> {

        public CheckConfirmSaveUserServiceRequestBuilder() {
            this.serviceRequest = new CheckConfirmSaveUserServiceRequest();
        }

        public CheckConfirmSaveUserServiceRequest buildServiceRequest(CheckConfirmSaveUserApiRequest checkConfirmSaveUserApiRequest) {
            CheckConfirm checkConfirm = new CheckConfirm();

            checkConfirm.setCode(Md5Encyript.cryptWithMD5(checkConfirmSaveUserApiRequest.getCode()));
            checkConfirm.setFkUserId(checkConfirmSaveUserApiRequest.getFkUserId());
            checkConfirm.setFkNumberId(checkConfirmSaveUserApiRequest.getFkNumberId());
            checkConfirm.setFkConfirmTypeId(ConfirmTypeEnum.SAVE_USER.getValue());

            serviceRequest.setCheckConfirm(checkConfirm);
            return serviceRequest;
        }

    }

    public static class CheckConfirm{
        private Long fkUserId;
        private Long fkNumberId;
        private String code;
        private Long fkConfirmTypeId;

        public Long getFkNumberId() {
            return fkNumberId;
        }

        public void setFkNumberId(Long fkNumberId) {
            this.fkNumberId = fkNumberId;
        }

        public Long getFkConfirmTypeId() {
            return fkConfirmTypeId;
        }

        public void setFkConfirmTypeId(Long fkConfirmTypeId) {
            this.fkConfirmTypeId = fkConfirmTypeId;
        }

        public Long getFkUserId() {
            return fkUserId;
        }

        public void setFkUserId(Long fkUserId) {
            this.fkUserId = fkUserId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
