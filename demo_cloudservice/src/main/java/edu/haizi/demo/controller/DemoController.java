package edu.haizi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String Demo(){
        return "index";
    }
}
