package com.ben._02_stringbuffer;

import org.junit.Test;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO StringBuffer/StringBuilder 可变字符序列
 * @create 2023-03-16 10:44
 */
public class Test1StringBuffer {
    @Test
    public void test01() {
        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println(stringBuffer);//"hello"
        StringBuffer append1 = stringBuffer.append(",world!");
        System.out.println(stringBuffer);//"hello,world!"
        System.out.println(append1 == stringBuffer);//true


        StringBuffer append2 = append1.append("1").append("2").append("3");

        //增删改查插，反转，长度
        System.out.println(append2);
        StringBuffer delete = append2.delete(12, 15);
        System.out.println(delete);

        StringBuffer replace = append2.replace(6, 11, "StringBuilder");
        System.out.println(replace);

        StringBuffer insert = replace.insert(1, "ss");
        System.out.println(insert);

        StringBuffer reverse = insert.reverse();
        System.out.println(reverse);


    }
}
