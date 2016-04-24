package tr.util;

import java.lang.reflect.ParameterizedType;

public class BaseServiceReq  {
    private String loggedUserShowName = null;
    private String loggedUserUserName = null;
    private Long loggedUserUserId = null;
    private Long loggedUserUserRoleId = null;

    protected BaseServiceReq() {
    }

    public String getLoggedUserShowName() {
        return this.loggedUserShowName;
    }

    public void setLoggedUserShowName(String loggedUserShowName) {
        this.loggedUserShowName = loggedUserShowName;
    }

    public String getLoggedUserUserName() {
        return this.loggedUserUserName;
    }

    public void setLoggedUserUserName(String loggedUserUserName) {
        this.loggedUserUserName = loggedUserUserName;
    }

    public Long getLoggedUserUserId() {
        return this.loggedUserUserId;
    }

    public void setLoggedUserUserId(Long loggedUserUserId) {
        this.loggedUserUserId = loggedUserUserId;
    }

    public Long getLoggedUserUserRoleId() {
        return this.loggedUserUserRoleId;
    }

    public void setLoggedUserUserRoleId(Long loggedUserUserRoleId) {
        this.loggedUserUserRoleId = loggedUserUserRoleId;
    }



    public static class BaseServiceReqBuilder<T extends BaseServiceReq> {
        protected T serviceRequest;

        protected BaseServiceReqBuilder() {
            try {
                this.serviceRequest = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
            } catch (InstantiationException e) {

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

        public T setLoggedUserShowName(String loggedUserShowName) {
            ((BaseServiceReq) this.serviceRequest).loggedUserShowName = loggedUserShowName;
            return this.serviceRequest;
        }

        public T setLoggedUserUserName(String loggedUserUserName) {
            ((BaseServiceReq) this.serviceRequest).loggedUserUserName = loggedUserUserName;
            return this.serviceRequest;
        }

        public T setLoggedUserUserId(Long loggedUserUserId) {
            ((BaseServiceReq) this.serviceRequest).loggedUserUserRoleId = loggedUserUserId;
            return this.serviceRequest;
        }

        public T setLoggedUserUserRoleId(Long loggedUserUserRoleId) {
            ((BaseServiceReq) this.serviceRequest).loggedUserUserRoleId = loggedUserUserRoleId;
            return this.serviceRequest;
        }


        public T getRequest() {
            return this.serviceRequest;
        }
    }
}

