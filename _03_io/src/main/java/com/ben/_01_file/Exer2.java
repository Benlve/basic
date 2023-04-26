package com.ben._01_file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 列出特定文件目录下已.mp3结尾的而文件名
 * @create 2023-03-14 12:16
 */
public class Exer2 {
    public static void main(String[] args) {
        File file1 = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_2/Work_Ben/音乐/林俊杰/07-100天");

        //方式一：
//        String[] list = file1.list();
//
//        for (String s : list) {
//            if (s.endsWith(".mp3")) {
//                System.out.println(s);
//            }
//        }

        //方式二：
        String[] listFiles = file1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".mp3");
            }
        });

        for (String s : listFiles) {
            System.out.println(s);
        }
    }
}
