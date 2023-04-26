package com.ben._01_file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO File基本方法
 * @create 2023-03-14 10:37
 */
public class Test2File {
    @Test
    public void test01() {
        //1.相对路径文件
        File file1 = new File("hello.txt");
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getAbsoluteFile().getParent());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
    }

    @Test
    public void test02() {
        //1.绝对路径文件
        String absPath = "/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/workspace/Java/JavaBasic/basic/_03_io/hello1.txt";
        File file1 = new File(absPath);
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getAbsoluteFile().getParent());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
    }

    @Test
    public void test03() {
        //列出文件目录下的所有目录和文件
        File file1 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben");

        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);

        }


        System.out.println("\n=================\n");

        File[] files = file1.listFiles();
        for (File f : files) {
            System.out.println(f);

        }
    }

    @Test
    public void test04() {
        // public boolean renameTo(File dest)
        File file1 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/workspace/Java/JavaBasic/basic/_03_io/hello.txt");
        File file2 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/书籍/hello.txt");
        boolean b = file2.renameTo(file1);
        System.out.println(b ? "重命名成功" : "重命名失败");
    }

    @Test
    public void test05() {
        //判断功能的方法
        File file1 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/workspace/Java/JavaBasic/basic/_03_io/hello.txt");

        //public boolean exists()
        System.out.println(file1.exists());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());

        System.out.println("\n================\n");

        File file2 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/workspace/Java/JavaBasic/basic/_03_io");

        //public boolean exists()
        System.out.println(file2.exists());
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());

    }


}
