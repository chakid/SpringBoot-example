package com.chakid.restfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019/6/20
 * @Author by Chakid
 */
@Controller
public class HelloController {

    @RequestMapping("/success")
    public String success(){
        return "login";


    }


}
