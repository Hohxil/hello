package com.edu.hello.controller;

import com.edu.hello.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UmsAdminService umsAdminService;
    @RequestMapping("/hello")
    public String hello() {
        return "hello world ...";
    }
    @RequestMapping("user/add")
    public String add() {
        System.out.println("进入add方法");
        return "user/add";
    }
    @RequestMapping("user/update")
    public String update() {
        return "user/update";
    }
    @RequestMapping("admin/find")
    public String find() {
        return umsAdminService.findOne(1).toString();
    }
}
