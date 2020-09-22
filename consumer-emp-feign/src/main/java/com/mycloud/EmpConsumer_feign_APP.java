package com.mycloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by kds on 2020/9/7.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.mycloud"})
@ComponentScan("com.mycloud")
public class EmpConsumer_feign_APP {
    public static void main(String[] args) {
        SpringApplication.run(EmpConsumer_feign_APP.class);
    }
}
    