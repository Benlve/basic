package com.ben._01_enum;



/**
 * 一、枚举类的使用
 * 1.枚举的理解：类的对象只有有限个，确定的。我们称此类为枚举类。
 * 2.当需要定义一组常量时，强烈建议使用枚举类。
 * 3.如果枚举类中只有一个对象，则可以作为单例模式的实现方式。
 *
 * 二、如何定义枚举类
 * 方式一：jdk5.0之前，自定义枚举类
 * 方式二：jdk5.0，可以使用enum关键字定义枚举类
 *
 * 三、Enum类中常用的方法：
 *      toString() :
 *      values() : 返回枚举类型的对象数组，该方法可以很方便地遍历所有的枚举值
 *      valueOf() : 可以
 *
 * 四、enum定义的枚举类实现接口的情况
 *
 *
 * @Author 廖新平
 * @Date 2022/12/12 22:05
 */
public class Test1Season {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring.getSeasonDesc());
        System.out.println(spring.getSeasonName());
    }
}
