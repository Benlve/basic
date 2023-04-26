package com.ben._01_collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2Iterator {
    @Test
    public void test01() {
        //add(Object o)
        Collection coll = new ArrayList();

        //add
        coll.add("AA");
        coll.add(123);
        coll.add(new Person("Tom", 21));

        //获取迭代器对象
        Iterator iterator = coll.iterator();
        System.out.println(iterator.getClass().getSimpleName());

        System.out.println("\n**************\n");

        //迭代器对象遍历集合
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //增强for循环
        for (Object o : coll) {
            System.out.println(o);

        }


    }

    @Test
    public void test() {

        String[] arr = new String[]{"AA", "BB", "CC"};

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "MM";
//        }

        for(String s : arr) {
            s = "MM";
        }

        for (String s : arr) {
            System.out.println("s = " + s);
        }

    }
}
