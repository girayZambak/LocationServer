package tr.businessService.number.requestBeans;

import tr.restApi.confirm.apiRequest.CheckConfirmSaveUserApiRequest;
import tr.util.classes.BaseServiceRequest;
import tr.util.classes.BaseServiceResponse;
import tr.util.classes.Md5Encyript;
import tr.util.enums.ConfirmTypeEnum;

public class CheckNumberServiceRequest extends BaseServiceRequest {
    private CheckNumber checkNumber;

    public CheckNumber getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(CheckNumber checkNumber) {
        this.checkNumber = checkNumber;
    }

    public static class CheckNumberServiceRequestBuilder extends BaseServiceRequestBuilder<CheckNumberServiceRequest> {
        public CheckNumberServiceRequest buildServiceRequest(String areaCode, String number) {
            CheckNumber checkNumber = new CheckNumber();

            checkNumber.setAreaCode(areaCode);
            checkNumber.setNumber(number);

            serviceRequest.setCheckNumber(checkNumber);
            return serviceRequest;
        }
    }

    public static class CheckNumber{
        private String areaCode;
        private String number;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }
}
