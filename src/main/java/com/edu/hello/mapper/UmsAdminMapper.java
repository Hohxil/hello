package com.edu.hello.mapper;

import com.edu.hello.entity.UmsAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UmsAdminMapper {

    UmsAdmin findOne(int id);
}
