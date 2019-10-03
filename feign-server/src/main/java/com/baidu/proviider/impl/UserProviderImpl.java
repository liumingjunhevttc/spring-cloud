package com.baidu.proviider.impl;

import com.baidu.entity.User;
import com.baidu.proviider.UserProvider;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class UserProviderImpl implements UserProvider {
    public Collection<User> findAll() {
        return null;
    }

    public String index() {
        return "服务器正在维护中………………";
    }
}
