package tr.businessService.tUser.requestBeans;

import tr.restApi.tUser.apiRequest.LogInTUserApiRequest;
import tr.util.classes.BaseServiceRequest;
import tr.util.classes.Md5Encyript;

public class LogInTUserServiceRequest extends BaseServiceRequest {
    private Long fkUserId;
    private String password;

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class LogInTUserServiceRequestBuilder extends BaseServiceRequestBuilder<LogInTUserServiceRequest> {

        public LogInTUserServiceRequestBuilder() {
            this.serviceRequest = new LogInTUserServiceRequest();
        }

        public LogInTUserServiceRequest buildServiceRequest(LogInTUserApiRequest logInTUserApiRequest) {
            serviceRequest.setPassword(Md5Encyript.cryptWithMD5(logInTUserApiRequest.getPassword()));
            serviceRequest.setFkUserId(logInTUserApiRequest.getFkUserId());
            return serviceRequest;
        }
    }
}
