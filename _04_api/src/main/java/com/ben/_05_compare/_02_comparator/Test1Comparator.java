package com.ben._05_compare._02_comparator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;


/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 使用Comparator的场景：源代码不可修改的时候，想进行排序
 *             TODO 可定制排序规则
 * @create 2023-03-16 16:50
 */
public class Test1Comparator {
    @Test
    public void test01() {

        String[] arr = {
                "Tom",
                "Jerry",
                "Rose",
                "Jack",
                "Ben"
        };

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Arrays.sort(arr, comparator);//默认从小到大排序

        for (String s : arr) {
            System.out.println(s);
        }


    }
}
