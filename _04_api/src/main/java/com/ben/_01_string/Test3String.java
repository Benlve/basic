package com.ben._01_string;

import org.junit.Test;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO String 查找
 * @create 2023-03-16 10:21
 */
public class Test3String {
    @Test
    public void test01() {
        //public boolean contains(CharSequence s)
        String s1 = "android开发开发";
        System.out.println(s1.contains("android"));

        //public int indexOf(String str) 第一次出现的位置
        String s2 = "开发";
        System.out.println(s1.indexOf(s2));

        System.out.println(s1.indexOf(s2, s1.indexOf(s2) + 1));


        //substring  左闭右开
        String s3 = "abcdefg";
        System.out.println(s3.substring(2));

        System.out.println(s3.substring(2, 4));
    }

    @Test
    public void test02() {
        //与char相关
        String s1 = "jdoisndsa";

        System.out.println(s1.charAt(3));

        //public static String valueOf(char data[])
        String s2 = String.valueOf(new char[]{'a', 'b', 'c'});
        System.out.println(s2);
        String s3 = String.copyValueOf(new char[]{'a', 'b', 'c'});
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

        //public String replace
        String s4 = "hello";
        String s5 = s4.replace("ll", "koib");
        System.out.println(s5);



    }
}
