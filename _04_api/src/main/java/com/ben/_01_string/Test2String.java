package com.ben._01_string;

import org.junit.Test;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO String 的基本方法
 * @create 2023-03-16 10:07
 */
public class Test2String {
    @Test
    public void test01() {
        //public boolean isEmpty()
        String s1 = "";
        System.out.println(s1.isEmpty());

        //public int length()
        String s2 = "Hello";
        System.out.println(s2.length());

        //public String concat(String str)
        String s3 = "hello";
        String concat = s3.concat(",world");
        System.out.println(concat);

        //public boolean equalsIgnoreCase(String anotherString)
        String s4 = "Hello";
        String s5 = "hello";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

        //public int compareToIgnoreCase(String str)
        String s6 = "Hellok";
        String s7 = "hellooddd";
        System.out.println(s6.compareToIgnoreCase(s7));


    }

    @Test
    public void test02() {
        //public String toUpperCase()
        //public String toLowerCase()
        String s1 = "AbCd";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        //public String trim() 去除前后空格
        String s2 = "   he   ll  o   ";
        System.out.println("**********" + s2.trim() + "*************");


        //public native String intern()
        String s3 = new String("key-value");
        String s4 = s3.intern();
        System.out.println(s3 == s4);


    }
}
