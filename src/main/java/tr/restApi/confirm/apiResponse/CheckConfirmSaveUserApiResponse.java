package tr.restApi.confirm.apiResponse;

import tr.businessService.confirm.responseBeans.CheckConfirmSaveUserServiceResponse;
import tr.businessService.tUser.responseBeans.SaveTUserServiceResponse;
import tr.daoLayer.tUser.dro.TUserDRO;
import tr.util.classes.BaseApiResponse;
import tr.util.classes.BaseServiceResponse;

public class CheckConfirmSaveUserApiResponse extends BaseApiResponse {
    private TUserDRO userDRO;

    public TUserDRO getUserDRO() {
        return userDRO;
    }

    public void setUserDRO(TUserDRO userDRO) {
        this.userDRO = userDRO;
    }

    @Override
    protected void buildResponse(BaseServiceResponse baseServiceResponse) {
        CheckConfirmSaveUserServiceResponse saveTUserServiceResponse = (CheckConfirmSaveUserServiceResponse) baseServiceResponse;
        this.setUserDRO(saveTUserServiceResponse.getUserDRO());
    }
}
