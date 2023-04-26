package com.ben._01_file;

import java.io.File;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 练习：创建与hello.txt同名的abc.txt文件
 * @create 2023-03-14 12:13
 */
public class Exer1 {
    public static void main(String[] args) {
        File file1 = new File("hello.txt");

        File file2 = new File(file1.getAbsoluteFile().getParent(), "abc.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
    }
}
