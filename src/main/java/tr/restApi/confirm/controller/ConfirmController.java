package tr.restApi.confirm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.businessService.confirm.requestBeans.CheckConfirmSaveUserServiceRequest;
import tr.businessService.confirm.service.ConfirmService;
import tr.restApi.confirm.apiRequest.CheckConfirmSaveUserApiRequest;
import tr.restApi.confirm.apiResponse.CheckConfirmSaveUserApiResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/confirm")
public class ConfirmController {
    @Autowired
    private ConfirmService confirmService;

    @RequestMapping(value = "/checkConfirmSaveUser", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    public
    @ResponseBody CheckConfirmSaveUserApiResponse checkConfirmSaveUser(HttpServletRequest req, HttpServletResponse resp, @RequestBody CheckConfirmSaveUserApiRequest checkConfirmSaveUserApiRequest) {
        CheckConfirmSaveUserServiceRequest.CheckConfirmSaveUserServiceRequestBuilder checkConfirmSaveUserServiceRequestBuilder = new CheckConfirmSaveUserServiceRequest.CheckConfirmSaveUserServiceRequestBuilder();
        CheckConfirmSaveUserApiResponse checkConfirmSaveUserApiResponse = new CheckConfirmSaveUserApiResponse();
        checkConfirmSaveUserApiResponse.build(confirmService.checkConfirm(checkConfirmSaveUserServiceRequestBuilder.buildServiceRequest(checkConfirmSaveUserApiRequest)));
        return checkConfirmSaveUserApiResponse;
    }
}
