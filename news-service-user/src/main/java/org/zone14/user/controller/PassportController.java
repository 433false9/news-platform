package org.zone14.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.zone14.api.controller.user.PassportControllerApi;
import org.zone14.response.JsonResponse;
import org.zone14.utils.SMSUtils;

/**
 * @author false9
 */
@RestController
public class PassportController implements PassportControllerApi {

    @Autowired
    private SMSUtils smsUtils;

    @Override
    public JsonResponse getSMSCode() {
        String random = "123456";
        smsUtils.sendSMS("18715027263", random);
        return JsonResponse.ok();
    }
}
