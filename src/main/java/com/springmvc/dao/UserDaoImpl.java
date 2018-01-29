package com.springmvc.dao;

import java.io.Reader;
import java.util.List;
import java.io.IOException;

import com.springmvc.model.User;
import com.springmvc.mapper.UserMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 用户数据访问对象
 */
public class UserDaoImpl implements IUserDao {
    
    private UserMapper mapper;
    private SqlSession session;
    private SqlSessionFactory sessionFactory;
    
    public UserDaoImpl() {
        String resource = "mybatis-config.xml";
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sessionFactory.openSession();
            mapper = session.getMapper(UserMapper.class);  //不能少
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public User findUserById(int id) {
        return mapper.findUserById(id);
    }
    
    public void addUser(User user) {
        mapper.addUser(user);
        session.commit();
    }
    
    public List<User> getAllUsers() {
        return mapper.getAllUsers();
    }
}
