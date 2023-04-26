package com.ben._04_data;

import org.junit.Test;

import java.util.Calendar;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO
 * @create 2023-03-16 11:22
 */
public class Test3Calendar {
    @Test
    public void test01() {
        //实例化
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
        //常用方法
        //get
        int i1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i1);

        int i2 = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(i2);

        //set
        calendar.set(Calendar.DAY_OF_MONTH,23);

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));


    }
}
