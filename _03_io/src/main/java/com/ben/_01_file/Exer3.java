package com.ben._01_file;

import java.io.File;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 遍历指定文件目录所有文件的名称，包括子目录中的文件
 * @create 2023-03-14 12:20
 */
public class Exer3 {
    public static void main(String[] args) {
        File file = new File("/media/benlve/2cb3dd3c-3bea-429f-a493-0a54a9f3f056/lenovo/sd_1/temp1");
        printAllFileName(file);

        deleteAllFiles(file);

    }

    //遍历指定文件目录所有文件的名称，包括子目录中的文件
    public static void printAllFileName(File file) {
        if(file.isFile()) {
            System.out.println(file.getName());
        }else if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f : files) {
                printAllFileName(f);
            }
        } else {
            System.out.println("file is null");
        }
    }

    //删除指定文件目录所有文件的名称，包括子目录中的文件
    public static void deleteAllFiles(File file) {
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            for(File f : files) {
                deleteAllFiles(f);
            }
        }
        file.delete();
    }


}
