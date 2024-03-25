package com.animal.shelter.mapper;


import com.animal.shelter.vo.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM Users")
    List<User> findAll();
}