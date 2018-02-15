package com.springmvc.service;

import java.util.List;
import com.springmvc.model.User;

public interface IUserService {
    User findUserById(int id);
    void addUser(User user);
    List<User> getAllUsers();
}