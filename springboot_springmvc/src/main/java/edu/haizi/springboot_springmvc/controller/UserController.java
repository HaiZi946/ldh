package edu.haizi.springboot_springmvc.controller;

import edu.haizi.springboot_springmvc.domain.User;
import edu.haizi.springboot_springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        return userService.LfindAll();
    }
    @GetMapping("{id}")
    public User findById(@PathVariable("id")int id){
        return userService.findById(id);
    }
}
