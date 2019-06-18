package com.chakid.logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggingApplicationTests {

    //日志声明
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {


        //日志级别 级别由低到高 trace<debug<info<warn<error
        logger.trace("这是trace跟踪信息");

        logger.debug("这是debug调试信息");

        logger.info("这是info日志");

        logger.warn("这是warn警告信息");

        logger.error("这是error错误信息");

    }

}
