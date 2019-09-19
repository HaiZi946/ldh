package edu.haizi.springboot_mybatis_annotations.controller;


import edu.haizi.springboot_mybatis_annotations.domain.User;
import edu.haizi.springboot_mybatis_annotations.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("findAllUser")
    public List<User> findAlluser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
