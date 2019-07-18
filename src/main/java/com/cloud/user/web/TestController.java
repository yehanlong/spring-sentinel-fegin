package com.cloud.user.web;

import com.cloud.user.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping(value = "/user")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        testService.doSomeThing("hello " + new Date());
        return "didispace.com";
    }

    @GetMapping("/hello2")
    public String hello2() {
        testService.doSomeThing2("hello2 " + new Date());
        return "didispace.com";
    }

}