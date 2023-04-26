package com.ben._02_io;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * 一、流的分类：
 * 1.操作数据单位：字节流，字符流
 * 2.数据的流向：输入流输出流
 * 3.流的角色：节点流、处理流
 * <p>
 * 二、流的体系结构
 * 抽象基类              节点流(文件流)               缓冲流（处理流的一种）
 * InputStream          FileInputStream             BufferedInputStream
 * OutputStream         FileOutputStream            BufferedOutputStream
 * Reader               FileReader                  BufferedReader
 * Writer               FileWriter                  BufferedWriter
 *
 * @version 1.0.0
 * @Author 廖新平
 * @Date 2022/12/18 21:51
 */


public class Test1FileReader {

    /**
     * @author 廖新平
     * @version 1.1.0
     * @decription TODO 读取文本文件 -> FileReader
     * @create 2023-03-14 13:17
     */
    @Test
    public void test01() {
        File file = new File("hello.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void test02() {
        File file = new File("hello.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);

            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read(cbuf)) != -1) {
                //方式一：
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }
                //方式二：
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
