package com.zhyyu.learn.springcloud.reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LearnSpringcloudRegApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringcloudRegApplication.class, args);
    }

}
