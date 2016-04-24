package tr.businessService.number.service;


import tr.businessService.number.requestBeans.CheckNumberServiceRequest;
import tr.businessService.number.responseBeans.CheckNumberServiceResponse;

public interface NumberService {
    public CheckNumberServiceResponse checkAndCreateNumber(CheckNumberServiceRequest checkNumberServiceRequest);
}
