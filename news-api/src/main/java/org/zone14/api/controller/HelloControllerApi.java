package org.zone14.api.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author false9
 */
public interface HelloControllerApi {
    @GetMapping("hello")
    public Object hello();
}
