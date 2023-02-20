package org.zone14.user.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zone14.api.controller.HelloControllerApi;
import org.zone14.response.JsonResponse;
import org.zone14.utils.RedisOperator;

/**
 * @author false9
 */
@RestController
public class HelloController implements HelloControllerApi {

    final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private RedisOperator redis;


    @Override
    public JsonResponse hello() {
        logger.debug("debug: hello~");
        logger.info("info: hello~");
        logger.warn("warn: hello~");
        logger.error("error: hello~");

        return JsonResponse.ok("hello") ;
    }

    @GetMapping("/redis")
    public JsonResponse redis() {
       redis.set("age", "19");
       return JsonResponse.ok(redis.get("age"));
    }

}
