package tr.businessService.tUser.responseBeans;


import tr.daoLayer.number.dro.NumberDRO;
import tr.daoLayer.tUser.dro.TUserDRO;
import tr.entity.TUser;
import tr.util.classes.BaseServiceResponse;

public class SaveTUserServiceResponse extends BaseServiceResponse {
    private TUserDRO userDRO;

    public TUserDRO getUserDRO() {
        return userDRO;
    }

    public void setUserDRO(TUserDRO userDRO) {
        this.userDRO = userDRO;
    }

    public static class SaveTUserServiceResponseBuilder extends BaseServiceResponseBuilder<SaveTUserServiceResponse> {
        public SaveTUserServiceResponse buildServiceResponse(TUser tUser, NumberDRO numberDRO) {

            TUserDRO tUserDRO = new TUserDRO();

            tUserDRO.setId(tUser.getId());
            tUserDRO.setFkNumberId(tUser.getFkNumberId());
            tUserDRO.setName(tUser.getName());
            tUserDRO.setSurname(tUser.getSurname());
            tUserDRO.seteMail(tUser.geteMail());
            tUserDRO.setRegId(tUser.getRegId());
            tUserDRO.setDateOfBirth(tUser.getDateOfBirth());
            tUserDRO.setDeviceId(tUser.getDeviceId());
            tUserDRO.setSimSerialNumber(tUser.getSimSerialNumber());
            tUserDRO.setActive(tUser.getActive());
            tUserDRO.setIsLogin(tUser.getIsLogin());
            tUserDRO.setIsConfirmed(tUser.getIsConfirmed());
            tUserDRO.setNumber(numberDRO.getNumber());
            tUserDRO.setAreaCode(numberDRO.getAreaCode());

            serviceResponse.setUserDRO(tUserDRO);

            return serviceResponse;
        }
    }
}
