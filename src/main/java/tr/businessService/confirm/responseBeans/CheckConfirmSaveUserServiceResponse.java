package tr.businessService.confirm.responseBeans;


import tr.daoLayer.tUser.dro.TUserDRO;
import tr.entity.TUser;
import tr.util.classes.BaseServiceResponse;

public class CheckConfirmSaveUserServiceResponse extends BaseServiceResponse {
    private TUserDRO userDRO;

    public TUserDRO getUserDRO() {
        return userDRO;
    }

    public void setUserDRO(TUserDRO userDRO) {
        this.userDRO = userDRO;
    }

    public static class CheckConfirmSaveUserServiceResponseBuilder extends BaseServiceResponseBuilder<CheckConfirmSaveUserServiceResponse> {
        public CheckConfirmSaveUserServiceResponse buildServiceResponse(TUserDRO dro) {
            serviceResponse.setUserDRO(dro);
            return serviceResponse;
        }
    }
}
