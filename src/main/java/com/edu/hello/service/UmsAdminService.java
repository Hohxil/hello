package com.edu.hello.service;

import com.edu.hello.entity.UmsAdmin;
import com.edu.hello.mapper.UmsAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmsAdminService {
    @Autowired
    UmsAdminMapper umsAdminMapper;

    public UmsAdmin findOne(int id) {
        return umsAdminMapper.findOne(id);
    }
}
