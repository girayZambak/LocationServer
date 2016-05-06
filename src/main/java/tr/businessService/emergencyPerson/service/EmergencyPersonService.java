package tr.businessService.emergencyPerson.service;


import tr.businessService.emergencyPerson.requestBeans.ConfirmEmergencyPersonServiceRequest;
import tr.businessService.emergencyPerson.requestBeans.CreateEmergencyPersonServiceRequest;
import tr.businessService.emergencyPerson.requestBeans.GetFollowingEmergencyPersonsServiceRequest;
import tr.businessService.emergencyPerson.requestBeans.GetMyEmergencyPersonsServiceRequest;
import tr.businessService.emergencyPerson.responseBeans.ConfirmEmergencyPersonServiceResponse;
import tr.businessService.emergencyPerson.responseBeans.CreateEmergencyPersonServiceResponse;
import tr.businessService.emergencyPerson.responseBeans.GetFollowingEmergencyPersonsServiceResponse;
import tr.businessService.emergencyPerson.responseBeans.GetMyEmergencyPersonsServiceResponse;

public interface EmergencyPersonService {
    public CreateEmergencyPersonServiceResponse createEmergencyPerson(CreateEmergencyPersonServiceRequest createEmergencyPersonServiceRequest);
    public ConfirmEmergencyPersonServiceResponse confirmEmergencyPerson(ConfirmEmergencyPersonServiceRequest confirmEmergencyPersonServiceRequest);
    public GetMyEmergencyPersonsServiceResponse getMyEmergencyPersons(GetMyEmergencyPersonsServiceRequest getMyEmergencyPersonsServiceRequest);
    public GetFollowingEmergencyPersonsServiceResponse getFollowingEmergencyPersons(GetFollowingEmergencyPersonsServiceRequest getFollowingEmergencyPersonsServiceRequest);
}
