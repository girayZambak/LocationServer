package tr.businessService.emergency.service;


import tr.businessService.emergency.requestBeans.CheckActiveEmergencyServiceRequest;
import tr.businessService.emergency.requestBeans.CreateEmergencyServiceRequest;
import tr.businessService.emergency.requestBeans.DisableEmergencyServiceRequest;
import tr.businessService.emergency.responseBeans.CheckActiveEmergencyServiceResponse;
import tr.businessService.emergency.responseBeans.CreateEmergencyServiceResponse;
import tr.businessService.emergency.responseBeans.DisableEmergencyServiceResponse;
import tr.daoLayer.tUser.dro.TUserDRO;

public interface EmergencyService {
    public CreateEmergencyServiceResponse createEmergency(CreateEmergencyServiceRequest createEmergencyServiceRequest);
    public CheckActiveEmergencyServiceResponse checkActiveEmergency(CheckActiveEmergencyServiceRequest checkActiveEmergencyServiceRequest);
    public DisableEmergencyServiceResponse disableEmergency(DisableEmergencyServiceRequest disableEmergencyServiceRequest);
}