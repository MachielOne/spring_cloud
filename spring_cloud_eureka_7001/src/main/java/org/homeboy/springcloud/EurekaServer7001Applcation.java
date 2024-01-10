package org.homeboy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001Applcation {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001Applcation.class, args);
    }
}
