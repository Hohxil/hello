package com.edu.hello.service;

import com.edu.hello.entity.User;
import com.edu.hello.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel() {
        return userMapper.Sel();
    }
    public User findOne( int id) {
        return userMapper.findOne(id);
    }

    public int insert(List<User> list) {
         return userMapper.insert(list);

    }
}

