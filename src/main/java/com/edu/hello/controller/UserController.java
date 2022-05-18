package com.edu.hello.controller;

import com.edu.hello.entity.User;
import com.edu.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("getUser")
    @ResponseBody
    public String getUser() {

           return userService.Sel().toString();

    }
    @RequestMapping("getUserOne/{id}")
    public String getUserOne(@PathVariable  int id) {
        System.out.println("进入getUserOne方法");
        return userService.findOne(id).toString();

    }
    @RequestMapping("/insert")
    @ResponseBody
    public int insert() {
        User user1 = new User();
        user1.setName("雄霸");
        user1.setMoney(100.0);
        User user2 = new User();
        user2.setName("无名");
        user2.setMoney(200.0);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
      return  userService.insert(list);
    }
}
