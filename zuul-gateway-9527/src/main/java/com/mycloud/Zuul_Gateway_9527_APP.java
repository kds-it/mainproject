package com.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by kds on 2020/9/8.
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_Gateway_9527_APP {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_Gateway_9527_APP.class);
    }
}
    