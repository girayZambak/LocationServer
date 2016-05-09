package tr.restApi.emergencyPerson.apiResponse;

import tr.util.classes.BaseApiResponse;
import tr.util.classes.BaseServiceResponse;
import tr.util.classes.Message;
import tr.util.classes.MessageTypeENUM;
import tr.util.enums.MessagesNamesEnum;


public class DeleteEmergencyPersonApiResponse extends BaseApiResponse {

    @Override
    protected void buildResponse(BaseServiceResponse baseServiceResponse) {
        if(baseServiceResponse.getMessageList().isEmpty()){
            this.messageList.add(new Message(MessageTypeENUM.SUCCESS, MessagesNamesEnum.SUCCESS_EMERGENCY_PERSON_DELETED));
        }

    }
}
