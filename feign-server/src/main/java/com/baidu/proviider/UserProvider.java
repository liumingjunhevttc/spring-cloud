package com.baidu.proviider;

import com.baidu.entity.User;
import com.baidu.proviider.impl.UserProviderImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "service-provider",fallback = UserProviderImpl.class)
public interface UserProvider {

    @GetMapping("/user/findAll")
    public Collection<User> findAll();

    @GetMapping("/user/index")
    public String index();
}
