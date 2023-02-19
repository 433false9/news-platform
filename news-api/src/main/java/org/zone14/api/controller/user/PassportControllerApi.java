package org.zone14.api.controller.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zone14.response.JsonResponse;

@Api(value = "用户注册登录", tags = {"用户注册登录的controller"})
@RequestMapping("/passport")
public interface PassportControllerApi {

    @ApiOperation(value = "获得短信验证码", notes = "获得短信验证码", httpMethod = "GET")
    @GetMapping("/getSMSCode")
    JsonResponse getSMSCode();
}
