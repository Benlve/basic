package com.ben._04_class_structure;

/**
 * @Description TODO
 * @Author 廖新平
 * @Date 2022/12/4 18:01
 */
public class Person extends Creature<String> implements Comparable<String>, MyInterface {

    private String name;
    int age;
    protected boolean gender;
    public int id;

    public Person() {

    }

    private Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String show(String nation) {
        System.out.println("我的国籍是 ：" + nation);
        return nation;
    }

    @MyAnnotation(number = 1,isLoaded = false,values = {"black tangerine","a time of national peace and order"})
    public String display(String interest) {
        return interest;
    }



    @Override
    public void info() {
        System.out.println("我是一个人。");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
