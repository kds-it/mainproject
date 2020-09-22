package com.mycloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by kds on 2020/9/6.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class emp implements Serializable{
    private long empno;
    private  String ename;
    private  String job;


}
    