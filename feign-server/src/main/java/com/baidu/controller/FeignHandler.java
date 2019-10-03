package com.baidu.controller;

import com.baidu.entity.User;
import com.baidu.proviider.UserProvider;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private UserProvider userProvider;

    @GetMapping("/findAll")
    public Collection<User> findAll(){
        return userProvider.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return userProvider.index();
    }
}
