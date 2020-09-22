package com.mycloud.service.serviceImpl;

import com.mycloud.entity.emp;
import com.mycloud.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycloud.dao.empDao;

import java.util.List;

/**
 * Created by kds on 2020/9/6.
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private empDao dao  ;

    @Override
    public boolean add(emp emp)
    {
        return dao.addEmp(emp);
    }

    @Override
    public emp get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<emp> list()
    {
        return dao.findAll();
    }
}
    