package com.test.springmvc.service;

import com.test.springmvc.dao.UserDAO;
import com.test.springmvc.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 用户业务
 */
@Service
public class UserService {
    
    @Autowired
    UserDAO userdao;
    
    public List<User> queryAllUsers() {
        return userdao.getAll();
    }
    
    public User getUserById(int id) {
        return userdao.getUserById(id);
    }
    
    public boolean deleteUser(int id) {
        return userdao.delete(id);
    }
    
    public boolean addUser(User user) {
        return userdao.add(user);
    }
    
    public boolean editUser(User user) {
        return userdao.update(user);
    }
}
