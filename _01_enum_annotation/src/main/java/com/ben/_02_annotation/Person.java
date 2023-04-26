package com.ben._02_annotation;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO
 * @create 2023-03-13 20:46
 */

@MyAnnotation(number = 18, isLoaded = true, values = {"类","数组类型->可以有多个值"})//类使用注解
public class Person {
    @MyAnnotation(number = 1, isLoaded = false, values = "属性")//属性使用注解
    private String name;
    private int age;

    @MyAnnotation(number = 1, isLoaded = false, values = "构造方法")//构造方法使用注解
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation(number = 12,isLoaded = true,values = "成员方法")
    public void walk() {
        System.out.println("人走路");
    }

    public void eat() {
        System.out.println("人吃饭");
    }
}
