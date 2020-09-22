package com.myribborule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kds on 2020/9/7.
 */
@Configuration
public class MyRule {
    @Bean
    public IRule rule(){
        return new RoundRobinRule();
    }


}
    