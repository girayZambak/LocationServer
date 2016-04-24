package tr.util.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseApiResponse {
    protected boolean hasError = false;
    protected List<Message> messageList = new ArrayList();

    public BaseApiResponse() {
    }

    public boolean isHasError() {
        return this.hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public List<Message> getMessageList() {
        return this.messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    protected abstract void buildResponse(BaseServiceResponse var1);

    public void build(BaseServiceResponse baseServiceResponse) {
        boolean hataVar = false;
        if(baseServiceResponse.getException() != null) {
            this.messageList.add(new Message(MessageTypeENUM.EXCEPTION, baseServiceResponse.getException().getMessage()));
        }

        Iterator var3 = baseServiceResponse.getMessageList().iterator();

        while(var3.hasNext()) {
            Message message = (Message)var3.next();
            if(message.getMessageType().equals(MessageTypeENUM.EXCEPTION) || message.getMessageType().equals(MessageTypeENUM.VALIDATION_ERROR)) {
                hataVar = true;
                break;
            }
        }

        this.setHasError(baseServiceResponse.getException() != null || hataVar);
        if(baseServiceResponse.getException() == null) {
            this.messageList = baseServiceResponse.getMessageList();
            this.buildResponse(baseServiceResponse);
        }

    }
}
