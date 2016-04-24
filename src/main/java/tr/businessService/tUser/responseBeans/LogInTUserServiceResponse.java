package tr.businessService.tUser.responseBeans;


import tr.daoLayer.tUser.dro.TUserDRO;
import tr.util.classes.BaseServiceResponse;

public class LogInTUserServiceResponse extends BaseServiceResponse {
    private TUserDRO userDRO;

    public TUserDRO getUserDRO() {
        return userDRO;
    }

    public void setUserDRO(TUserDRO userDRO) {
        this.userDRO = userDRO;
    }

    public static class LogInTUserServiceResponseBuilder extends BaseServiceResponseBuilder<LogInTUserServiceResponse> {
        public LogInTUserServiceResponse buildServiceResponse(TUserDRO dro) {

            serviceResponse.setUserDRO(dro);

            return serviceResponse;
        }
    }
}
