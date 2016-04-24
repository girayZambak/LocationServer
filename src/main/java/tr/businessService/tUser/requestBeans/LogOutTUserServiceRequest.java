package tr.businessService.tUser.requestBeans;

import tr.restApi.tUser.apiRequest.LogOutTUserApiRequest;
import tr.util.classes.BaseServiceRequest;

public class LogOutTUserServiceRequest extends BaseServiceRequest {
    private Long fkUserId;

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public static class LogOutTUserServiceRequestBuilder extends BaseServiceRequestBuilder<LogOutTUserServiceRequest> {

        public LogOutTUserServiceRequestBuilder() {
            this.serviceRequest = new LogOutTUserServiceRequest();
        }

        public LogOutTUserServiceRequest buildServiceRequest(LogOutTUserApiRequest logOutTUserApiRequest) {
            serviceRequest.setFkUserId(logOutTUserApiRequest.getFkUserId());
            return serviceRequest;
        }
    }
}
