package com.springmvc.service;

import java.util.List;

import com.springmvc.dao.IUserDao;
import com.springmvc.model.User;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
public class UserServiceImpl implements IUserService {
    
    @Resource(name = "IUserDao")
    private IUserDao userDao;
    
    @Transactional
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
    
    @Transactional
    public void addUser(User user){
        userDao.addUser(user);
    }
    
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
