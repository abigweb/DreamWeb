package com.springmvc.service;

import com.springmvc.model.User;

public interface IUserService {
    public User findUserById(int id);
    public void addUser(User user);
}