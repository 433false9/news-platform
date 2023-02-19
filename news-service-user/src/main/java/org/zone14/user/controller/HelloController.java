package org.zone14.user.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.web.bind.annotation.RestController;
import org.zone14.api.controller.HelloControllerApi;
import org.zone14.response.MyResponse;

/**
 * @author false9
 */
@RestController
public class HelloController implements HelloControllerApi {

    final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Override
    public MyResponse hello() {

        logger.debug("debug: hello~");
        logger.info("info: hello~");
        logger.warn("warn: hello~");
        logger.error("error: hello~");

        return MyResponse.ok("hello") ;
    }

}
