package com.ben._02_list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO List接口存储数据的特点，用于存储有序的、可重复的数据。替代数组
 * <p>
 * TODO 常用方法:增加一些针对索引操作的方法
 */
public class Test1List {
    @Test
    public void test01() {
        //增(有序)
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("123");
        list.add("Tom");
        list.add("Jerry");
        System.out.println(list.toString());

        //插入
        list.add(2, "NN");
        System.out.println(list);
        List<String> newList = new ArrayList<>();
        newList.add("keven");
        newList.add("David Tao");

        list.addAll(3, newList);
        System.out.println(list);
    }

    @Test
    public void test02() {
        //删除
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

//        list.remove(2);
        Integer integer = Integer.valueOf(2);
        list.remove(integer);



        System.out.println(list);


    }
}
