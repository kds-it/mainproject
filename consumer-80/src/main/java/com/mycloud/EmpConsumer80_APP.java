package com.mycloud;

import com.myribborule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created by kds on 2020/9/7.
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "myloud-emp",configuration = MyRule.class)
public class EmpConsumer80_APP {
    public static void main(String[] args) {
        SpringApplication.run(EmpConsumer80_APP.class);
    }
}
    