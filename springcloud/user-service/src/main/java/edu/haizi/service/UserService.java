package edu.haizi.service;

import edu.haizi.domain.User;
import edu.haizi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User QueryUser(int id){
        return userMapper.selectByPrimaryKey(id);
    }
}
