package com.mycloud.dao;

import com.mycloud.entity.emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by kds on 2020/9/6.
 */
@Mapper
public interface empDao {
    public boolean addEmp(emp emp1);

    public emp findById(Long id);

    public List<emp> findAll();
}