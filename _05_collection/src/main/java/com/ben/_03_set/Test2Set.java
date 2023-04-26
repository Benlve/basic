package com.ben._03_set;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO TreeSet 可比较大小
 * @create 2023/3/21 0:25
 */
public class Test2Set {

    /**
     * 必须添加同一类型的元素
     */
    @Test
    public void test01() {
        Set set = new TreeSet();

        set.add("BB");
        set.add("LL");
        set.add("AA");
        set.add("HH");
        set.add("ZZ");
        //set.add(123);//java.lang.ClassCastException

        System.out.println(set);

    }
}
