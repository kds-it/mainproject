package com.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by kds on 2020/9/6.
 */
@SpringBootApplication
@EnableEurekaClient        //本服务启动后会自动注册到eureka中
@EnableDiscoveryClient     //启动服务发现
public class EmpProvider8001_App {
    public static void main(String[] args)
    {
        SpringApplication.run(EmpProvider8001_App.class, args);
    }
}
    