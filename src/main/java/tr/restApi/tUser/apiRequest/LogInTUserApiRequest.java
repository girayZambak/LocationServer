package tr.restApi.tUser.apiRequest;


import tr.util.classes.BaseApiRequest;

import java.util.Date;

public class LogInTUserApiRequest extends BaseApiRequest {
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
}
