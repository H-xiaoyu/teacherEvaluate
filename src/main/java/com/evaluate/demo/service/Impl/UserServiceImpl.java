package com.evaluate.demo.service.Impl;



import com.evaluate.demo.entity.Auth;
import com.evaluate.demo.entity.Office;
import com.evaluate.demo.entity.User;
import com.evaluate.demo.mapper.OfficeMapper;
import com.evaluate.demo.mapper.UserMapper;
import com.evaluate.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OfficeMapper officeMapper;
    @Override
    public List<User> selectUserName(String name) {
        return userMapper.selectUserName(name);
    }

    @Override
    public List<Auth> selectAuth(String userId){
        return userMapper.selectAuth(userId);
    }
    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    @Transactional
    public boolean insertData(Office office, User user) {
        int UserRs = userMapper.insertUser(user);
        int OfficeRs = officeMapper.insertOffice(office);
        if (0==0){
            throw new RuntimeException("我想测试一下spring的事务");
        }
        if(UserRs>0&&OfficeRs>0){
            return true;
        }
            return false;
    }
}
