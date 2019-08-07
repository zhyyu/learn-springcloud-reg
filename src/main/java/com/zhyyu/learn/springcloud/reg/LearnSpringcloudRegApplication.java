package com.zhyyu.learn.springcloud.reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <pre>
 *     eureka 管理后台:
 *      http://localhost:1106/
 * </pre>
 */
@EnableEurekaServer
@SpringBootApplication
public class LearnSpringcloudRegApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringcloudRegApplication.class, args);
    }

}
