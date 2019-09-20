package edu.haizi.springboot_springmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {
    @RequestMapping("/demo")
    public String Demo(){
        log.debug("Demo is running");
        return "Hello Springboot!";
    }
}
