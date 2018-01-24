package com.test.springmvc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/***
 * 用户
 */
public class User {
    
    public User(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public User(int id, String name, Date birthday, String address, String phone) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
    }

    public User() {
    }

    private int id;

    private String name;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date birthday;

    private String address;

    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}