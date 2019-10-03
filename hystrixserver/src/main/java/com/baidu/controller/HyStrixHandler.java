package com.baidu.controller;

import com.baidu.provider.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hystrix")
public class HyStrixHandler {

    @Autowired
    private UserProvider userProvider;

    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index(){
        return userProvider.index();
    }

    @GetMapping("/hello")
    public String hello(){
        return foo;
    }
}
