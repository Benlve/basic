package com.ben._02_io;

import org.junit.Test;

import java.io.*;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO
 * @create 2023-03-15 18:28
 */
public class Test6CopyMethodBuffer {

    @Test
    public void test01() {
        String srcPath = "/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/书籍/Android/《Android自定义控件开发入门与实战》_启舰.pdf";
        String destPath = "/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/《Android自定义控件开发入门与实战》_启舰_COPY.pdf";
        long start = System.currentTimeMillis();
        copyFileWithBufferedStream(srcPath, destPath);
        long end = System.currentTimeMillis();
        System.out.println(end - start);//320
    }


    /**
     * TODO 使用缓冲流实现复制的过程
     *
     * @param srcPath  源文件路径
     * @param destPath 目标路径
     */
    public void copyFileWithBufferedStream(String srcPath, String destPath) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.file
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            //2.io
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(destFile);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //3.read or write
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //close
            //关闭顺序：先关闭外层流

            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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
