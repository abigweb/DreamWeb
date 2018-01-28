package com.springmvc.dao;

import com.springmvc.model.User;

public interface IUserDao {
    public User findUserById(int id); //查询
    public void addUser(User user); //添加
}