package com.test.mapper;

import com.test.pojo.User;

public interface UserMapper {
    //增
    void saveUser(User User);
    //根据ID删
    void deleteUserById(Integer id);
    //改
    void updateUser(User User);
    //查
    User findUserById(Integer id);
}