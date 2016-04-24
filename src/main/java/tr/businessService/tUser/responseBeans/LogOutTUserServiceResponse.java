package tr.businessService.tUser.responseBeans;


import tr.daoLayer.number.dro.NumberDRO;
import tr.daoLayer.tUser.dro.TUserDRO;
import tr.entity.TUser;
import tr.util.classes.BaseServiceResponse;

public class LogOutTUserServiceResponse extends BaseServiceResponse {
    private TUserDRO userDRO;

    public TUserDRO getUserDRO() {
        return userDRO;
    }

    public void setUserDRO(TUserDRO userDRO) {
        this.userDRO = userDRO;
    }

    public static class LogOutTUserServiceResponseBuilder extends BaseServiceResponseBuilder<LogOutTUserServiceResponse> {
        public LogOutTUserServiceResponse buildServiceResponse(TUserDRO dro) {

            serviceResponse.setUserDRO(dro);

            return serviceResponse;
        }
    }
}
