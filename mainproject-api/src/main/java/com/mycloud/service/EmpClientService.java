package com.mycloud.service;

import com.mycloud.entity.emp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by kds on 2020/9/8.
 */
//@FeignClient(name = "mycloud-emp")
@FeignClient(value = "mycloud-emp",fallbackFactory=EmpClientServiceFallbackFactory.class)

public interface EmpClientService {
    @RequestMapping(value = "/emp/get/{id}", method = RequestMethod.GET)
    public emp get(@PathVariable("id") long id);

    @RequestMapping(value = "/emp/list", method = RequestMethod.GET)
    public List<emp> list();

    @RequestMapping(value = "/emp/add", method = RequestMethod.POST)
    public boolean add(emp dept);

}