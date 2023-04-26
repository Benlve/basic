package com.ben._01_string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO String 和其他数据类型的转换
 * @create 2023-03-16 09:38
 */
public class Test1String {
    @Test
    public void test01() {

        //String 和 Integer 的转换
        String str = "123";
        int i = Integer.parseInt(str);
        System.out.println("i = " + i);

        int num = 1896;
        String s = String.valueOf(num);
        System.out.println("s = " + s);

    }

    @Test
    public void test02() {
        //char[] 和 String 的转换
        char[] arr = {'a', 'b', 'c'};
        String s = new String(arr);
        System.out.println("s = " + s);

        String str = "祖国万岁！";
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }

    }

    @Test
    public void test03() throws UnsupportedEncodingException {
        //byte[] 和 String 的转换
        String str = "abcde";
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            System.out.println(b);//ASCII码
        }


        //utf-8 gbk
        String s1 = "中国";
        byte[] s1Bytes = s1.getBytes("gbk");

        String s2 = new String(s1Bytes, "gbk");
        System.out.println("s2 = " + s2);
    }


}
