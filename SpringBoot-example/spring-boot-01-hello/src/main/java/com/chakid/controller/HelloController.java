package com.chakid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019/6/17
 * @Author by Chakid
 */


@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello SpringBoot";
    }
}
