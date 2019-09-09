package com.evaluate.demo.service;


import com.evaluate.demo.entity.Auth;
import com.evaluate.demo.entity.Office;
import com.evaluate.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectUserName(String name);
    List<User> selectAllUser();
    boolean insertData(Office office, User user);
    List<Auth> selectAuth(String userId);
}
