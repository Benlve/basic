package com.ben._03_stringbuilder;

import org.junit.Test;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO
 * @create 2023-03-16 11:00
 */
public class Test1StringBuilder {
    @Test
    public void test01() {

        StringBuilder builder = new StringBuilder("hello");

        //增
        StringBuilder append = builder.append(1980);
        System.out.println(append);

        //删
        StringBuilder delete = append.delete(8, 9);
        System.out.println(delete);

        //改
        StringBuilder replace = delete.replace(5, 8, "StringBuilder");
        System.out.println(replace);


    }
}
