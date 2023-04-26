package com.ben._01_primary;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription 测试类
 * @create 2023-03-13 21:26
 */
public class Person {

    //私有属性（成员变量 ）
    private String name;
    public int age;

    public Person() {
    }

    //私有构造器
    private Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show() {
        System.out.println("你好呀！我代表某一个人呦。");
    }

    //私有成员方法
    private String showNation(String nation) {
        System.out.println("我的国籍是：" + nation);
        return nation;
    }
}
