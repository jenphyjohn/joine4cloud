package com.github.joine4cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: JenphyJohn
 * @Date: 2019/8/30 4:46 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Joine4cloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Joine4cloudGatewayApplication.class, args);
    }

}
