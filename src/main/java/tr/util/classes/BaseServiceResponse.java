package tr.util.classes;


import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class BaseServiceResponse {
    private boolean hasException;
    private CSGBException exception;
    private List<Message> messageList;

    public BaseServiceResponse() {
    }

    public boolean isHasException() {
        return this.exception != null;
    }

    public CSGBException getException() {
        return this.exception;
    }

    public List<Message> getMessageList() {
        return this.messageList;
    }

    protected void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    public static class BaseServiceResponseBuilder<T extends BaseServiceResponse> {
        protected T serviceResponse;

        protected BaseServiceResponseBuilder() {
            try {
                this.serviceResponse = ((Class<T>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
                this.serviceResponse.setMessageList(new ArrayList());
            } catch (InstantiationException var2) {
                ;
            } catch (IllegalAccessException var3) {
                var3.printStackTrace();
            }

            ((BaseServiceResponse)this.serviceResponse).messageList = new ArrayList();
        }

        public BaseServiceResponseBuilder exception(CSGBException exception) {
            ((BaseServiceResponse)this.serviceResponse).exception = exception;
            return this;
        }

        public BaseServiceResponseBuilder addMessage(Message message) {
            ((BaseServiceResponse)this.serviceResponse).messageList.add(message);
            return this;
        }

        public T getResponse() {
            return this.serviceResponse;
        }

        public T getResponse(List<Message> messageList) {
            ((BaseServiceResponse)this.serviceResponse).messageList = messageList;
            return this.serviceResponse;
        }
    }
}

