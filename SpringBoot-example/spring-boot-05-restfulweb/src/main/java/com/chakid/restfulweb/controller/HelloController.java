package com.chakid.restfulweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author Chakid
 * @Date 2019/6/19
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }


    /**
     * 该处返回 "success"返回的是 resources/templates目录下面的页面
     * 该出要返回的是页面，所以不能配置@ResponseBody注解，如果配置了该注解会以字符串直接输出"success"
     * @return success.html
     */
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        map.put("users", Arrays.asList("张三","李四","王五"));
        return "success";
    }
}
