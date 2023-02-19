package org.zone14.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author false9
 */
@SpringBootApplication
@MapperScan(basePackages = "org.zone14.user.mapper")
@ComponentScan("org.zone14")
class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}