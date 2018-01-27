package com.test.springmvc.dao;

import java.util.List;
import com.test.springmvc.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 用户数据访问接口
 */
public interface IUserDAO {
    
    List<User> getAll();  /**获得所有*/
    
    User getUserById(int id);  /**根据用户编号获得用户对象*/
    
    boolean add(User user);
    
    boolean delete(int id);
    
    boolean update(User user);
}