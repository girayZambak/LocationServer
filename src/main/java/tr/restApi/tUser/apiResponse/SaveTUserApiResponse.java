package tr.restApi.tUser.apiResponse;

import tr.businessService.tUser.responseBeans.SaveTUserServiceResponse;
import tr.daoLayer.tUser.dro.TUserDRO;
import tr.util.classes.BaseApiResponse;
import tr.util.classes.BaseServiceResponse;

public class SaveTUserApiResponse extends BaseApiResponse {
    private TUserDRO userDRO;

    public TUserDRO getUserDRO() {
        return userDRO;
    }

    public void setUserDRO(TUserDRO userDRO) {
        this.userDRO = userDRO;
    }

    @Override
    protected void buildResponse(BaseServiceResponse baseServiceResponse) {
        SaveTUserServiceResponse saveTUserServiceResponse = (SaveTUserServiceResponse) baseServiceResponse;
        this.setUserDRO(saveTUserServiceResponse.getUserDRO());
    }
}
