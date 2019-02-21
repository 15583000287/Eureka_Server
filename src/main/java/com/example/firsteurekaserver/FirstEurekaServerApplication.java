package com.example.firsteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer   //声明这是一个Eureka服务器
public class FirstEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstEurekaServerApplication.class, args);
    }

}
