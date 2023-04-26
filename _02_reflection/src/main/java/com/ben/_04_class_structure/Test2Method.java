package com.ben._04_class_structure;


import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 获取类的方法
 * @create 2023-03-14 09:18
 */
public class Test2Method {
    @Test
    public void test01() {
        Class cls = Person.class;
        //①getMethods() : 获取当前运行时类及其父类中声明为public访问权限的方法
        Method[] methods = cls.getMethods();
        for (Method m : methods) {
            System.out.println("m = " + m);
        }

        System.out.println("\n=============\n");

        //②获取当前运行时类当前声明的所有方法。（不包含父类中声明的方法）
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println("m = " + m);
        }
    }

    /**
     * 获取方法上的注解
     */
    @Test
    public void test02() {
        Class cls = Person.class;
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method m : declaredMethods) {
            Annotation[] annotations = m.getAnnotations();
            for(Annotation a : annotations) {
                System.out.println("a = " + a);
            }

            //权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            //方法返回值类型
            System.out.println(m.getReturnType() + "\t");
        }

    }
}
