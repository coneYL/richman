package com.coneyang.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ConeYang on ${Date}
 */
@RestController
public class HelloController {
    @RequestMapping("/system/sayhello")
    public String hello(){
        return "Welcome to start SpringBoot!";
    }
}
