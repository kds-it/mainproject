package com.mycloud;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kds on 2020/9/22.
 */
public class test {
    public static void main(String[] args) {

        String date="2010-11-20-11";
        SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd-hh");
        String a=format.format(new Date());
        System.out.println(a);
        try {
            Date da=format.parse(date);
            System.out.println(da);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
    