package com.ben._04_class_structure;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 获取类的属性
 * @create 2023-03-13 23:32
 */
public class Test1Field {
    @Test
    public void test01() throws Exception {

        Class cls = Class.forName("com.ben._04_class_structure.Person");

        //1.获取属性结构
        //①getFields() : 获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = cls.getFields();
        for (Field f1 : fields) {
            System.out.println("f1 = " + f1);
        }

        System.out.println("\n===================\n");

        //②获取当前运行时类当前声明的所有属性。（不包含父类中声明的属性）
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field f2 : declaredFields) {
            System.out.println("f2 = " + f2);
        }

    }

    @Test
    public void test02() throws Exception {
        //获取权限修饰符
        Class cls = Class.forName("com.ben._04_class_structure.Person");

        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            //权限修饰符
            int modifiers = f.getModifiers();
            System.out.println(Modifier.toString(modifiers) + "\t");
            //打印：
            //private
            //
            //protected
            //public


        }


    }

    @Test
    public void test03() throws Exception {
        //数据类型    变量名
        Class cls = Class.forName("com.ben._04_class_structure.Person");

        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            //数据类型
            Class type = f.getType();
            System.out.println(type);
            //打印结果
            //class java.lang.String
            //int
            //boolean
            //int
        }
    }

    @Test
    public void test04() throws Exception {
        //数据类型    变量名
        Class cls = Class.forName("com.ben._04_class_structure.Person");

        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            //变量名
            String name = f.getName();
            System.out.println(name);
            //打印结果
            //name
            //age
            //gender
            //id
        }
    }
}
