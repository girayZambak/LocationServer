package tr.restApi.tUser.apiRequest;


import tr.util.classes.BaseApiRequest;

public class LogOutTUserApiRequest extends BaseApiRequest {
    private Long fkUserId;

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }
}
