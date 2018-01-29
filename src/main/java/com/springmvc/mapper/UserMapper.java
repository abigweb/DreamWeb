package com.springmvc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.springmvc.model.User;

public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User findUserById(int id);
    
    @Insert("insert into user(username,password) values(#{username},#{password})")
    void addUser(User user);
    
    @Select("select * from user")
    List<User> getAllUsers();
}