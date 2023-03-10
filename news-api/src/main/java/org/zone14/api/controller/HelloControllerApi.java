package org.zone14.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author false9
 */
@Api(value = "controller的标题", tags = {"xx功能的controller"})
public interface HelloControllerApi {

    @ApiOperation(value = "hello方法的接口", notes = "hello方法的接口", httpMethod = "GET")
    @GetMapping("/hello")
    Object hello();
}
