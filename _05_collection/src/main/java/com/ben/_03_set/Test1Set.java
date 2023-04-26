package com.ben._03_set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO set接口：无序、元素不可重复
 *             TODO 主要实现类：HashSet、LinkedHashSet、TreeSet
 * @create 2023/3/20 23:13
 */
public class Test1Set {
    /**
     * HashSet ①遍历不按添加顺序 ②去重
     */
    @Test
    public void test1() {
        Set<String> set = new HashSet<>();
        set.add("AA");
        set.add("BB");
        set.add("123");
        set.add("CC");
        set.add("李白");
//        set.add("DD");
        set.add("DD");
//        set.add(new String("key"));
        set.add(new String("key"));
        //遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        //1.无序
    }

    /**
     * LinkedHashSet ①可以按照添加的顺序遍历 ②去重
     */
    @Test
    public void test2() {
        Set<String> set = new LinkedHashSet<>();
        set.add("AA");
        set.add("BB");
        set.add("123");
        set.add("CC");
        set.add("李白");
        //set.add("DD");
        set.add("DD");
        //set.add(new String("key"));
        set.add(new String("key"));
        //遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    /**
     * TreeSet 底层使用红黑树存储
     */
    @Test
    public void test03() {

    }
}
