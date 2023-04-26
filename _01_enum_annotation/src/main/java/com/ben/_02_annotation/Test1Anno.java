package com.ben._02_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 注解的使用
 * @create 2023-03-13 20:48
 * <p>
 * 1.理解Annotation
 * ①jdk5.0新增的功能
 * ②参与编译
 * ③JavaSE中：标记过时，忽略警告等，JavaEE中代替以往繁冗的XML配置文件
 */
public class Test1Anno {
    public static void main(String[] args) {
        @SuppressWarnings("unused")//1.忽略警告
        int num = 10;

        //2.反射获取注解信息数组
        Class<Person> personCls = Person.class;
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println("a = " + a);
        }
        //3.获取特定注解
        MyAnnotation annotation = personCls.getAnnotation(MyAnnotation.class);
        String[] values = annotation.values();

        for (String s : values) {
            System.out.println(s);
        }

        try {
            Constructor<Person> constructor = personCls.getConstructor(null);
            MyAnnotation anno1 = constructor.getAnnotation(MyAnnotation.class);
            String[] val1 = anno1.values();
            for (int i = 0; i < val1.length; i++) {
                System.out.println(val1[i]);
            }
            System.out.println(anno1);


        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }
}
