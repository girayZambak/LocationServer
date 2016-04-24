package tr.util;

import tr.util.classes.BaseApiRequest;

public class BaseApiReq extends BaseApiRequest {
    private String loggedUserShowName = null;
    private String loggedUserUserName = null;
    private Long loggedUserUserId = null;
    private Long loggedUserUserRoleId = null;

    public BaseApiReq() {
    }

    public String getLoggedUserShowName() {
        return loggedUserShowName;
    }

    public void setLoggedUserShowName(String loggedUserShowName) {
        this.loggedUserShowName = loggedUserShowName;
    }

    public String getLoggedUserUserName() {
        return loggedUserUserName;
    }

    public void setLoggedUserUserName(String loggedUserUserName) {
        this.loggedUserUserName = loggedUserUserName;
    }

    public Long getLoggedUserUserId() {
        return loggedUserUserId;
    }

    public void setLoggedUserUserId(Long loggedUserUserId) {
        this.loggedUserUserId = loggedUserUserId;
    }

    public Long getLoggedUserUserRoleId() {
        return loggedUserUserRoleId;
    }

    public void setLoggedUserUserRoleId(Long loggedUserUserRoleId) {
        this.loggedUserUserRoleId = loggedUserUserRoleId;
    }
}
