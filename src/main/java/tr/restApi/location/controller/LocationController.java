package tr.restApi.location.controller;

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
import tr.businessService.location.requestBeans.CreateLocationServiceRequest;
import tr.businessService.location.requestBeans.GetLocationByEmergencyServiceRequest;
import tr.businessService.location.service.LocationService;
import tr.restApi.location.apiRequest.CreateLocationApiRequest;
import tr.restApi.location.apiRequest.GetLocationByEmergencyApiRequest;
import tr.restApi.location.apiResponse.CreateLocationApiResponse;
import tr.restApi.location.apiResponse.GetLocationByEmergencyApiResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/sendLocation", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    CreateLocationApiResponse sendLocation(HttpServletRequest req, HttpServletResponse resp, @RequestBody CreateLocationApiRequest createLocationApiRequest) {

        CreateLocationServiceRequest.CreateLocationServiceRequestBuilder createLocationServiceRequestBuilder = new CreateLocationServiceRequest.CreateLocationServiceRequestBuilder();
        CreateLocationApiResponse createLocationApiResponse = new CreateLocationApiResponse();
        createLocationApiResponse.build(locationService.createLocation(createLocationServiceRequestBuilder.buildServiceRequest(createLocationApiRequest)));
        return createLocationApiResponse;
    }

    @RequestMapping(value = "/getLocationByEmergency", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    GetLocationByEmergencyApiResponse getLocationByEmergency(HttpServletRequest req, HttpServletResponse resp, @RequestBody GetLocationByEmergencyApiRequest getLocationByEmergencyApiRequest) {

        GetLocationByEmergencyServiceRequest.GetLocationByEmergencyServiceRequestBuilder getLocationByEmergencyServiceRequestBuilder = new GetLocationByEmergencyServiceRequest.GetLocationByEmergencyServiceRequestBuilder();
        GetLocationByEmergencyApiResponse getLocationByEmergencyApiResponse = new GetLocationByEmergencyApiResponse();
        getLocationByEmergencyApiResponse.build(locationService.getLocationByEmergency(getLocationByEmergencyServiceRequestBuilder.buildServiceRequest(getLocationByEmergencyApiRequest)));
        return getLocationByEmergencyApiResponse;
    }
}
