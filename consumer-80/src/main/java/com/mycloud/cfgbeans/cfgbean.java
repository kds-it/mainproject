package com.mycloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kds on 2020/9/7.
 */
@Configuration
public class cfgbean {
    @Bean
    @LoadBalanced //启动客户端ribion的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
//
//    @Bean
//    public IRule myRule(){
//        //return new RandomRule();//负载均衡默认的轮询算法改为随机算法；
//        return new RetryRule();//先按照轮询算法进行。如果有某个服务提供者宕机。过了段时间依然访问不到。就跳过该服务接着轮询；
//    }

}
