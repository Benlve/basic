package com.ben._02_annotation;

import java.lang.annotation.*;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 自定义注解 注意四个元注解的含义
 * @create 2023-03-13 20:52
 */
@Target({ElementType.FIELD, ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR})//注解修饰的类结构
@Retention(RetentionPolicy.RUNTIME)//注解的而生命周期
@Inherited//是否具有继承性
@Documented//
public @interface MyAnnotation {

    //1.基本数据类型
    int number();

    boolean isLoaded();

    //2.数组
    String[] values() default "光辉岁月";
}
