package org.zone14.user.controller;

import org.springframework.web.bind.annotation.RestController;
import org.zone14.api.controller.HelloControllerApi;

/**
 * @author false9
 */
@RestController
public class HelloController implements HelloControllerApi {

    @Override
    public Object hello() {
        return  "hello";
    }

}
