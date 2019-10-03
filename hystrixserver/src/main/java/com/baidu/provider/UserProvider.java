package com.baidu.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-provider")
public interface UserProvider {

    @GetMapping("/user/index")
    public String index();
}
