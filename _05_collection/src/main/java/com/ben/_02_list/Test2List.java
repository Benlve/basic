package com.ben._02_list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * TODO ArrayList、LinkedList、Vector的区别
 */
public class Test2List {
    @Test
    public void test01() {
        //List古老实现类，since 1.0 过期不用
        Vector<String> vector = new Vector<>();
        vector.add("AA");
        vector.addElement("AA");
        System.out.println(vector);


    }

    /**
     * TODO LinkedList 底层使用双向链表实现
     * 插入、删除数据效率高
     */
    @Test
    public void test02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("AA");

    }
}
