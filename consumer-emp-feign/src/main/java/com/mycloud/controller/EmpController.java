package com.mycloud.controller;


import com.mycloud.entity.emp;
import com.mycloud.service.EmpClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by kds on 2020/9/7.
 */
@RestController
public class EmpController {
    @Autowired
    private EmpClientService service;


    @RequestMapping(value = "/consumer/emp/get/{id}")
    public emp get(@PathVariable("id") Long id)
    {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/emp/list")
    public List<emp> list()
    {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/emp/add")
    public Object add(emp dept)
    {
        return this.service.add(dept);
    }
}
    