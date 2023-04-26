package com.ben._01_primary;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription 测试类
 * @create 2023-03-13 21:27
 */
public class Student extends Person {

    private String classroom;
    private int id;

    public Student() {
    }

    public Student(String name, int age, String classroom, int id) {
        super(name, age);
        this.classroom = classroom;
        this.id = id;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", classroom='" + classroom + '\'' +
                ", id=" + id +
                '}';
    }

    private void printInfo() {
        System.out.println("id = " + id);
    }

}
