package com.baidu.repository.impl;

import com.baidu.entity.User;
import com.baidu.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private Map<Integer,User> map;

    public UserRepositoryImpl(){
        map = new HashMap<Integer, User>();
        map.put(1,new User(1,"张三"));
        map.put(2,new User(2,"李四"));
        map.put(3,new User(3,"王五"));
        map.put(6,new User(6,"赵六"));
    }

    public Collection<User> findAll() {
        return map.values();
    }

    public User findById(Integer id) {
        return map.get(id);
    }

    public void saveOrUpdate(User user) {
        map.put(user.getId(),user);
    }

    public void deleteById(Integer id) {
        map.remove(id);
    }
}
