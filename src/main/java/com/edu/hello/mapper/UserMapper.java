package com.edu.hello.mapper;

import com.edu.hello.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

     User Sel();
     User findOne(int id);
     int insert(List<User> list);

}

