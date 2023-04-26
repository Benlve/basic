package com.ben._05_compare._01_comparable;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 引用数据类型比较大小，implements Comparable接口,比较规则在重写的compareTo方法中规定
 * @create 2023-03-16 11:30
 */
public class Test1Comparable {
    @Test
    public void test01() {

        String[] arr = {
                "Tom",
                "Jerry",
                "Rose",
                "Jack",
                "Ben"
        };

        Arrays.sort(arr);//默认从小到大排序

        for (String s : arr) {
            System.out.println(s);
        }
    }

    @Test
    public void test02() {
        Product[] products = new Product[6];
        products[0] = new Product(6999.00, "huawei");
        products[1] = new Product(4999.00, "xiaomi");
        products[2] = new Product(5999.00, "vivo");
        products[3] = new Product(5999.00, "oppo");
        products[4] = new Product(12999.00, "iphonez");
        products[5] = new Product(12999.00, "iphonepro");

        Arrays.sort(products);

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
