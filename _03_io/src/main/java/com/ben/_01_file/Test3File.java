package com.ben._01_file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO
 * @create 2023-03-14 11:42
 */
public class Test3File {
    @Test
    public void test01() throws IOException {
        //创建和删除
        File file1 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/书籍/hello.txt");

        //删除，不走回收站
        System.out.println(file1.exists());

        //创建文件
        if (!file1.exists()) {
            boolean isSuccess = file1.createNewFile();
            if (isSuccess) {
                System.out.println("创建成功！");
            }
        } else {
            boolean delete = file1.delete();
            if (delete) {
                System.out.println("文件删除成功！");
            }
        }
    }

    @Test
    public void test02() {
        File file1 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/书籍2");
        File file2 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/书籍3");

        System.out.println(file1.mkdir());
        System.out.println(file2.mkdirs());


    }

    @Test
    public void test03() {
        File file1 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben2/书籍2");
        File file2 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben3/书籍3");

        System.out.println(file1.mkdir());//上层目录不存在，创建失败
        System.out.println(file2.mkdirs());//上层目录不存在，一并创建


    }
}
