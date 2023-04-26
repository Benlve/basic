package com.ben._04_data;

import org.junit.Test;

import java.util.Date;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO
 * @create 2023-03-16 11:06
 */
public class Test1Data {

    @Test
    public void test01() {
        Date date = new Date();
        System.out.println(date);

        long millis = System.currentTimeMillis();
        System.out.println(millis);//1970年1月1日 00：00 距离当前的时间差值 又称时间戳

        Date date1 = new Date(1578936066029l);
        System.out.println(date1);

    }

    @Test
    public void test02() {
        java.sql.Date date = new java.sql.Date(1678936066029l);
        System.out.println(date);
    }
}
