package com.mycloud.service;

import com.mycloud.entity.emp;

import java.util.List;

/**
 * Created by kds on 2020/9/6.
 */
public interface EmpService {
    public boolean add(emp emp);

    public emp get(Long id);

    public List<emp> list();
}