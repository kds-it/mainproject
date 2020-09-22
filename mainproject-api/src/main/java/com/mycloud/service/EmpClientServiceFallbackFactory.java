package com.mycloud.service;

import com.mycloud.entity.emp;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by kds on 2020/9/8.
 */
@Component // 不要忘记添加，不要忘记添加
public class EmpClientServiceFallbackFactory implements FallbackFactory<EmpClientService>{


    @Override
    public EmpClientService create(Throwable throwable) {
        return new EmpClientService() {
            @Override
            public emp get(long id)
            {
                emp emp=new emp();

                emp.setEmpno(id);
                emp.setEname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
                emp.setJob("找不到信息");
                return emp;
            }

            @Override
            public List<emp> list()
            {
                return null;
            }

            @Override
            public boolean add(emp emp)
            {
                return false;
            }
        };
    }
}
    