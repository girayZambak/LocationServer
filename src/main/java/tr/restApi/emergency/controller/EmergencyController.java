package tr.restApi.emergency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.businessService.emergency.requestBeans.CheckActiveEmergencyServiceRequest;
import tr.businessService.emergency.requestBeans.CreateEmergencyServiceRequest;
import tr.businessService.emergency.requestBeans.DisableEmergencyServiceRequest;
import tr.businessService.emergency.service.EmergencyService;
import tr.businessService.tUser.requestBeans.SaveTUserServiceRequest;
import tr.businessService.tUser.service.TUserService;
import tr.restApi.emergency.apiRequest.CheckActiveEmergencyApiRequest;
import tr.restApi.emergency.apiRequest.CreateEmergencyApiRequest;
import tr.restApi.emergency.apiRequest.DisableEmergencyApiRequest;
import tr.restApi.emergency.apiResponse.CheckActiveEmergencyApiResponse;
import tr.restApi.emergency.apiResponse.CreateEmergencyApiResponse;
import tr.restApi.emergency.apiResponse.DisableEmergencyApiResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/emergency")
public class EmergencyController {
    @Autowired
    private EmergencyService emergencyService;

    @RequestMapping(value = "/createEmergency", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    CreateEmergencyApiResponse saveUser(HttpServletRequest req, HttpServletResponse resp, @RequestBody CreateEmergencyApiRequest createEmergencyApiRequest) {

        CreateEmergencyServiceRequest.CreateEmergencyServiceRequestBuilder createEmergencyServiceRequestBuilder = new CreateEmergencyServiceRequest.CreateEmergencyServiceRequestBuilder();
        CreateEmergencyApiResponse createEmergencyApiResponse = new CreateEmergencyApiResponse();
        createEmergencyApiResponse.build(emergencyService.createEmergency(createEmergencyServiceRequestBuilder.buildServiceRequest(createEmergencyApiRequest)));
        return createEmergencyApiResponse;
    }

    @RequestMapping(value = "/checkActiveEmergency", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    CheckActiveEmergencyApiResponse checkActiveEmergency(HttpServletRequest req, HttpServletResponse resp, @RequestBody CheckActiveEmergencyApiRequest checkActiveEmergencyApiRequest) {

        CheckActiveEmergencyServiceRequest.CheckActiveEmergencyServiceRequestBuilder checkActiveEmergencyServiceRequestBuilder = new CheckActiveEmergencyServiceRequest.CheckActiveEmergencyServiceRequestBuilder();
        CheckActiveEmergencyApiResponse checkActiveEmergencyApiResponse = new CheckActiveEmergencyApiResponse();
        checkActiveEmergencyApiResponse.build(emergencyService.checkActiveEmergency(checkActiveEmergencyServiceRequestBuilder.buildServiceRequest(checkActiveEmergencyApiRequest)));
        return checkActiveEmergencyApiResponse;
    }

    @RequestMapping(value = "/disableEmergency", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    DisableEmergencyApiResponse disableEmergency(HttpServletRequest req, HttpServletResponse resp, @RequestBody DisableEmergencyApiRequest disableEmergencyApiRequest) {

        DisableEmergencyServiceRequest.DisableEmergencyServiceRequestBuilder disableEmergencyServiceRequestBuilder = new DisableEmergencyServiceRequest.DisableEmergencyServiceRequestBuilder();
        DisableEmergencyApiResponse disableEmergencyApiResponse = new DisableEmergencyApiResponse();
        disableEmergencyApiResponse.build(emergencyService.disableEmergency(disableEmergencyServiceRequestBuilder.buildServiceRequest(disableEmergencyApiRequest)));
        return disableEmergencyApiResponse;
    }

}
