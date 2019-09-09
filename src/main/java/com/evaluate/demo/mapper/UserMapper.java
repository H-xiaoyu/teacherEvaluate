package com.evaluate.demo.mapper;



import com.evaluate.demo.entity.Auth;
import com.evaluate.demo.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUserName(String name);
    List<User> selectAllUser();
    int insertUser(User user);
    List<Auth> selectAuth(String userId);
}
