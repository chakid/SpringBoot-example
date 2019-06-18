package com.chakid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname Application
 * @Date 2019/6/17
 * @Author by Chakid
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class MainApplication {

    /**
     *  Spring应用启动起来
     */
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
