package edu.haizi.springboot_springmvc.service;

import edu.haizi.springboot_springmvc.domain.User;
import edu.haizi.springboot_springmvc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public  List<User >LfindAll(){
        return userMapper.selectAll();
    }
    public User findById(int id){
        return userMapper.selectByPrimaryKey(id);
    }
}
