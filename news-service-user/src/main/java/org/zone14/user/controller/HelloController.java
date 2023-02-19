package org.zone14.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author false9
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello() {
        return  "hello";
    }

}
