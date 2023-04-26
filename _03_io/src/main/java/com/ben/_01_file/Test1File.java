package com.ben._01_file;

import org.junit.Test;

import java.io.File;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO File的基本使用
 * @create 2023-03-14 09:44
 */
public class Test1File {

    public static void main(String[] args) {
        File file2 = new File("hello.txt");
        System.out.println(file2.getAbsolutePath());//获取相对路径的目录，main方法相对于工程下
    }

    @Test
    public void test01() {
        //1.绝对路径：文件路径字符串
        String path = "/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/hello.txt";
        File file1 = new File(path);
        //2.相对路径：相对于某一个文件目录
        File file2 = new File("hello.txt");
        System.out.println(file2.getAbsolutePath());//获取相对路径的目录，单元测试方法相对于模块下

    }

    @Test
    public void test02() {
        //public File(String parent, String child)
        String dirPath = "/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2";
        String fileName = "hello.txt";
        File file1 = new File(dirPath, fileName);
        System.out.println(file1.getAbsolutePath());
        //public File(File parent, String child)
        String dirName = "abc";
        File file2 = new File(dirPath, dirName);
        File file3 = new File(file2, "hello.txt");
        System.out.println(file3.getAbsolutePath());

    }
}
