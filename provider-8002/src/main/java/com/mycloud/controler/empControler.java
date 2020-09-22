package com.mycloud.controler;

import com.mycloud.entity.emp;
import com.mycloud.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kds on 2020/9/6.
 */
@RestController
public class empControler {
    @Autowired
    private EmpService service;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/emp/add", method = RequestMethod.POST)
    public boolean add(@RequestBody emp emp)
    {
        return service.add(emp);
    }

    @RequestMapping(value = "/emp/get/{id}", method = RequestMethod.GET)
    public emp get(@PathVariable("id") Long id)
    {

        return service.get(id);
    }

    @RequestMapping(value = "/emp/list", method = RequestMethod.GET)
    public List<emp> list()
    {
        return service.list();
    }


    //	@Autowired
//	private DiscoveryClient client;
    @RequestMapping(value = "/emp/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances(" mycloud-emp");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
    