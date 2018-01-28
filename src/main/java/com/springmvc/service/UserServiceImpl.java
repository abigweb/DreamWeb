package com.springmvc.service;

import com.springmvc.dao.IUserDao;
import com.springmvc.dao.UserDaoImpl;
import com.springmvc.model.User;

import org.springframework.stereotype.Service;

/**
 * 用户业务
 */
@Service
public class UserServiceImpl implements IUserService {
    
    private IUserDao userDao;
    
    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }
    
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
    public void addUser(User user){
        userDao.addUser(user);
    }
}
