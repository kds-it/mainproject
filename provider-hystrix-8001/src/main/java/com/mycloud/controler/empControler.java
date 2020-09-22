package com.mycloud.controler;

import com.mycloud.entity.emp;
import com.mycloud.service.EmpService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * Created by kds on 2020/9/6.
 */
@RestController
public class empControler {
    @Autowired
    private EmpService service = null;

    @RequestMapping(value = "/emp/get/{id}", method = RequestMethod.GET)
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public emp get(@PathVariable("id") Long id)
    {

        emp emp = this.service.get(id);

        if (null == emp) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }

        return emp;
    }

    public emp processHystrix_Get(@PathVariable("id") Long id)
    {
        emp emp=new emp();
        emp.setEmpno(id);
        emp.setEname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
        emp.setJob("没有对应的工作信息");
        return emp;
    }
}
    