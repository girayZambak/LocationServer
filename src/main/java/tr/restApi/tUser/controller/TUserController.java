package tr.restApi.tUser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.businessService.tUser.requestBeans.LogInTUserServiceRequest;
import tr.businessService.tUser.requestBeans.LogOutTUserServiceRequest;
import tr.businessService.tUser.requestBeans.SaveTUserServiceRequest;
import tr.businessService.tUser.service.TUserService;
import tr.restApi.tUser.apiRequest.LogInTUserApiRequest;
import tr.restApi.tUser.apiRequest.LogOutTUserApiRequest;
import tr.restApi.tUser.apiRequest.SaveTUserApiRequest;
import tr.restApi.tUser.apiResponse.LogInTUserApiResponse;
import tr.restApi.tUser.apiResponse.LogOutTUserApiResponse;
import tr.restApi.tUser.apiResponse.SaveTUserApiResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class TUserController {
    @Autowired
    private TUserService tUserService;

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody SaveTUserApiResponse saveUser(HttpServletRequest req, HttpServletResponse resp, @RequestBody SaveTUserApiRequest saveTUserApiRequest) {

        SaveTUserServiceRequest.SaveTUserServiceRequestBuilder saveTUserServiceRequestBuilder = new SaveTUserServiceRequest.SaveTUserServiceRequestBuilder();
        SaveTUserApiResponse saveTUserApiResponse = new SaveTUserApiResponse();
        saveTUserApiResponse.build(tUserService.saveTUser(saveTUserServiceRequestBuilder.buildServiceRequest(saveTUserApiRequest)));
        return saveTUserApiResponse;
    }

    @RequestMapping(value = "/logIn", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody LogInTUserApiResponse logIn(HttpServletRequest req, HttpServletResponse resp, @RequestBody LogInTUserApiRequest logInTUserApiRequest) {

        LogInTUserServiceRequest.LogInTUserServiceRequestBuilder logInTUserServiceRequestBuilder = new LogInTUserServiceRequest.LogInTUserServiceRequestBuilder();
        LogInTUserApiResponse logInTUserApiResponse = new LogInTUserApiResponse();
        logInTUserApiResponse.build(tUserService.logInTUser(logInTUserServiceRequestBuilder.buildServiceRequest(logInTUserApiRequest)));
        return logInTUserApiResponse;
    }

    @RequestMapping(value = "/logOut", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody LogOutTUserApiResponse logOut(HttpServletRequest req, HttpServletResponse resp, @RequestBody LogOutTUserApiRequest logOutTUserApiRequest) {

        LogOutTUserServiceRequest.LogOutTUserServiceRequestBuilder logOutTUserServiceRequestBuilder = new LogOutTUserServiceRequest.LogOutTUserServiceRequestBuilder();
        LogOutTUserApiResponse logOutTUserApiResponse = new LogOutTUserApiResponse();
        logOutTUserApiResponse.build(tUserService.logOutTUser(logOutTUserServiceRequestBuilder.buildServiceRequest(logOutTUserApiRequest)));
        return logOutTUserApiResponse;
    }
}
