package com.ben._02_io;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO
 * @create 2023-03-14 13:26
 */
public class Test2FileWriter {

    @Test
    public void test01() {
        FileWriter fileWriter = null;
        try {
            //1，file
            File file = new File("hello2.txt");
            //2.io
            fileWriter = new FileWriter(file, false);
            //3.read or write
            fileWriter.write("\nI have a dream!\n");
            fileWriter.write("You need to have a dream either.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //close
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * TODO 复制文本文件
     */
    @Test
    public void test02() {

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //1.file
            //read
            File srcFile = new File("hello.txt");
            //write
            File destFile = new File("hello2.txt");

            //2.io
            //readIO
            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(destFile);
            //3.writeIO
            //read and write
            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read(cbuf)) != -1) {
                fileWriter.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.close
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
