package com.mycloud.controller;

import com.mycloud.entity.emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by kds on 2020/9/7.
 */
@RestController
//controlle///////////////////////nnna11111111qqqq
public class EmpController {
    //private static final String REST_URL_PREFIX="http://localhost:8001";
    //eureka服务中心去找相应的开启的提供者
    private static final String REST_URL_PREFIX="http://mycloud-emp";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "consumer/emp/add")
    public boolean add(emp emp){
        return restTemplate.postForObject(REST_URL_PREFIX+"/emp/add",emp,boolean.class);

    }

    @RequestMapping(value = "consumer/emp/get/{id}")
    public emp get(@PathVariable("id") long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/emp/get/"+id,emp.class);

    }

    @RequestMapping(value = "consumer/emp/list")
    public List<emp> list(){
       return restTemplate.getForObject(REST_URL_PREFIX+"/emp/list",List.class);


    }
        //消费者调用服务发现
    @RequestMapping(value = "consumer/emp/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/emp/discovery",Object.class);


    }

}
    