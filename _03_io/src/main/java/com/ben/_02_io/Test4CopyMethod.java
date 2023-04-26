package com.ben._02_io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO
 * @create 2023-03-15 18:18
 */
public class Test4CopyMethod {

    @Test
    public void test01() {
        String srcPath = "/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/书籍/Android/《Android自定义控件开发入门与实战》_启舰.pdf";
        String destPath = "/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/《Android自定义控件开发入门与实战》_启舰_COPY.pdf";
        long start = System.currentTimeMillis();
        copyFile(srcPath,destPath);
        long end = System.currentTimeMillis();
        System.out.println(end - start);//760
    }

    /**
     * TODO 实现复制的过程
     *
     * @param srcPath  源文件路径
     * @param destPath 目标路径
     */
    public void copyFile(String srcPath, String destPath) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.file
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            //2.io
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);
            //3.read and write
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //close
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
