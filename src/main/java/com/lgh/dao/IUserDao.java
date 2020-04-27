package com.lgh.dao;

import com.lgh.entity.User;

import java.util.List;

public interface IUserDao {
    List<User> selectList();
}
