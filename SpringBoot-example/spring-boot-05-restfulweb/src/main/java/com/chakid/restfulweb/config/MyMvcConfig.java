package com.chakid.restfulweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Classname MyMvcConfig
 * @Description TODO
 * @Date 2019/6/20
 * @Author by Chakid
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {

        //浏览器发送/chakid请求，然后会直接跳转到success页面
        registry.addViewController("/chakid").setViewName("success");
    }
}
