package tr.businessService.number.responseBeans;

import tr.daoLayer.number.dro.NumberDRO;
import tr.util.classes.BaseServiceResponse;
import tr.entity.Number;

public class CheckNumberServiceResponse extends BaseServiceResponse {
    private NumberDRO numberDRO;

    public NumberDRO getNumberDRO() {
        return numberDRO;
    }

    public void setNumberDRO(NumberDRO numberDRO) {
        this.numberDRO = numberDRO;
    }

    public static class CheckNumberServiceResponseBuilder extends BaseServiceResponseBuilder<CheckNumberServiceResponse> {
        public CheckNumberServiceResponse buildServiceResponse(NumberDRO dro) {

            serviceResponse.setNumberDRO(dro);
            return serviceResponse;
        }
    }

}
