package org.zone14.user.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.web.bind.annotation.RestController;
import org.zone14.api.controller.HelloControllerApi;

/**
 * @author false9
 */
@RestController
public class HelloController implements HelloControllerApi {

    final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Override
    public Object hello() {

        logger.debug("debug: hello~");
        logger.info("info: hello~");
        logger.warn("warn: hello~");
        logger.error("error: hello~");

        return  "hello";
    }

}
