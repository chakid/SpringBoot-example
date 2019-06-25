package com.chakid.restfulcrud.config;

import com.chakid.restfulcrud.component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Classname MyConfig
 * @Description TODO
 * @Date 2019/6/20
 * @Author by Chakid
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {

    /**
     * 设置路由拦截
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
    }

    /**
     * 将我们的区域配置注册到SpringMVC bean中
     */
    @Bean
    public LocaleResolver localeResolver(){
       return new MyLocalResolver();
    }
}
