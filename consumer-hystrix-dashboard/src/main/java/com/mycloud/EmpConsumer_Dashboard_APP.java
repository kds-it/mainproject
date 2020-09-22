package com.mycloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * Created by kds on 2020/9/8.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class EmpConsumer_Dashboard_APP {
    public static void main(String[] args) {
        SpringApplication.run(EmpConsumer_Dashboard_APP.class);
    }
}
    