package com.test.springmvc.dao;

import com.test.springmvc.entity.User;
import com.test.springmvc.utils.JDBCUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("mysql")
public class UserDAO_JDBC implements IUserDAO {
    public List<User> getAll() {
        return JDBCUtil.queryForList("select id,name,birthday,address,phone from user", User.class);
    }
    
    public User getUserById(int id) {
        return JDBCUtil.queryForObject("select id,name,birthday,address,phone from user where id=?", User.class, id);
    }
    
    public boolean add(User user) {
        return JDBCUtil.update("insert into user(name,birthday,address,phone) values(?,?,?,?)", user.getName(), user.getBirthday(), user.getAddress(), user.getPhone()) > 0;
    }
    
    public boolean delete(int id) {
        return JDBCUtil.update("delete from user where id=?", id) > 0;
    }
    
    public boolean update(User user) {
        return JDBCUtil.update("update user set name=?,birthday=?,address=?,phone=? where id=?", user.getName(), user.getBirthday(), user.getAddress(), user.getPhone(), user.getId()) > 0;
    }
}
