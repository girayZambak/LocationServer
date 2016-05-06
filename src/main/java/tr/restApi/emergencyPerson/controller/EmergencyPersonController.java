package tr.restApi.emergencyPerson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.businessService.emergency.requestBeans.CreateEmergencyServiceRequest;
import tr.businessService.emergency.service.EmergencyService;
import tr.businessService.emergencyPerson.requestBeans.ConfirmEmergencyPersonServiceRequest;
import tr.businessService.emergencyPerson.requestBeans.CreateEmergencyPersonServiceRequest;
import tr.businessService.emergencyPerson.requestBeans.GetFollowingEmergencyPersonsServiceRequest;
import tr.businessService.emergencyPerson.requestBeans.GetMyEmergencyPersonsServiceRequest;
import tr.businessService.emergencyPerson.responseBeans.GetMyEmergencyPersonsServiceResponse;
import tr.businessService.emergencyPerson.service.EmergencyPersonService;
import tr.restApi.emergencyPerson.apiRequest.ConfirmEmergencyPersonApiRequest;
import tr.restApi.emergencyPerson.apiRequest.CreateEmergencyPersonApiRequest;
import tr.restApi.emergencyPerson.apiRequest.GetFollowingEmergencyPersonsApiRequest;
import tr.restApi.emergencyPerson.apiRequest.GetMyEmergencyPersonsApiRequest;
import tr.restApi.emergencyPerson.apiResponse.ConfirmEmergencyPersonApiResponse;
import tr.restApi.emergencyPerson.apiResponse.CreateEmergencyPersonApiResponse;
import tr.restApi.emergencyPerson.apiResponse.GetFollowingEmergencyPersonsApiResponse;
import tr.restApi.emergencyPerson.apiResponse.GetMyEmergencyPersonsApiResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/emergencyPerson")
public class EmergencyPersonController {
    @Autowired
    private EmergencyPersonService emergencyPersonService;

    @RequestMapping(value = "/createEmergencyPerson", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    CreateEmergencyPersonApiResponse createEmergencyPerson(HttpServletRequest req, HttpServletResponse resp, @RequestBody CreateEmergencyPersonApiRequest createEmergencyPersonApiRequest) {

        CreateEmergencyPersonServiceRequest.CreateEmergencyPersonServiceRequestBuilder createEmergencyPersonServiceRequestBuilder = new CreateEmergencyPersonServiceRequest.CreateEmergencyPersonServiceRequestBuilder();
        CreateEmergencyPersonApiResponse createEmergencyPersonApiResponse = new CreateEmergencyPersonApiResponse();
        createEmergencyPersonApiResponse.build(emergencyPersonService.createEmergencyPerson(createEmergencyPersonServiceRequestBuilder.buildServiceRequest(createEmergencyPersonApiRequest)));
        return createEmergencyPersonApiResponse;
    }

    @RequestMapping(value = "/confirmEmergencyPerson", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    ConfirmEmergencyPersonApiResponse confirmEmergencyPerson(HttpServletRequest req, HttpServletResponse resp, @RequestBody ConfirmEmergencyPersonApiRequest confirmEmergencyPersonApiRequest) {

        ConfirmEmergencyPersonServiceRequest.ConfirmEmergencyPersonServiceRequestBuilder confirmEmergencyPersonServiceRequestBuilder = new ConfirmEmergencyPersonServiceRequest.ConfirmEmergencyPersonServiceRequestBuilder();
        ConfirmEmergencyPersonApiResponse confirmEmergencyPersonApiResponse = new ConfirmEmergencyPersonApiResponse();
        confirmEmergencyPersonApiResponse.build(emergencyPersonService.confirmEmergencyPerson(confirmEmergencyPersonServiceRequestBuilder.buildServiceRequest(confirmEmergencyPersonApiRequest)));
        return confirmEmergencyPersonApiResponse;
    }


    @RequestMapping(value = "/getMyEmergencyPersons", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    GetMyEmergencyPersonsApiResponse getMyEmergencyPersons(HttpServletRequest req, HttpServletResponse resp, @RequestBody GetMyEmergencyPersonsApiRequest getMyEmergencyPersonsApiRequest) {

        GetMyEmergencyPersonsServiceRequest.GetMyEmergencyPersonsServiceRequestBuilder getMyEmergencyPersonsServiceRequestBuilder = new GetMyEmergencyPersonsServiceRequest.GetMyEmergencyPersonsServiceRequestBuilder();
        GetMyEmergencyPersonsApiResponse getMyEmergencyPersonsApiResponse = new GetMyEmergencyPersonsApiResponse();
        getMyEmergencyPersonsApiResponse.build(emergencyPersonService.getMyEmergencyPersons(getMyEmergencyPersonsServiceRequestBuilder.buildServiceRequest(getMyEmergencyPersonsApiRequest)));
        return getMyEmergencyPersonsApiResponse;
    }

    @RequestMapping(value = "/getFollowingEmergencyPersons", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    GetFollowingEmergencyPersonsApiResponse getFollowingEmergencyPersons(HttpServletRequest req, HttpServletResponse resp, @RequestBody GetFollowingEmergencyPersonsApiRequest getFollowingEmergencyPersonsApiRequest) {

        GetFollowingEmergencyPersonsServiceRequest.GetFollowingEmergencyPersonsServiceRequestBuilder getFollowingEmergencyPersonsServiceRequestBuilder = new GetFollowingEmergencyPersonsServiceRequest.GetFollowingEmergencyPersonsServiceRequestBuilder();
        GetFollowingEmergencyPersonsApiResponse getFollowingEmergencyPersonsApiResponse = new GetFollowingEmergencyPersonsApiResponse();
        getFollowingEmergencyPersonsApiResponse.build(emergencyPersonService.getFollowingEmergencyPersons(getFollowingEmergencyPersonsServiceRequestBuilder.buildServiceRequest(getFollowingEmergencyPersonsApiRequest)));
        return getFollowingEmergencyPersonsApiResponse;
    }
}
