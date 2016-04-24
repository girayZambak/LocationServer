package tr.restApi.confirm.apiRequest;


import tr.util.classes.BaseApiRequest;

import java.util.Date;

public class CheckConfirmSaveUserApiRequest extends BaseApiRequest {
    private Long fkUserId;
    private Long fkNumberId;
    private String code;

    public Long getFkNumberId() {
        return fkNumberId;
    }

    public void setFkNumberId(Long fkNumberId) {
        this.fkNumberId = fkNumberId;
    }

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
