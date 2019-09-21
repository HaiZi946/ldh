package edu.haizi.springboot_springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String Demo(){
        return "Hello Springboot!";
    }
}
