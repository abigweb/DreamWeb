package com.springmvc.dao;

import com.springmvc.model.User;

import java.util.List;

public interface IUserDao {
    
    User findUserById(int id); // 查询
    
    void addUser(User user);   // 添加
    
    List<User> getAllUsers();
}