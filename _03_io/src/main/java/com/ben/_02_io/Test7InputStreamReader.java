package com.ben._02_io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 转换流
 * @create 2023-03-15 18:32
 */
public class Test7InputStreamReader {
    /**
     * 用字节流读取文本文件
     */
    @Test
    public void test1() {
        InputStreamReader inputStreamReader = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("Ubuntu安全重启.txt");
            inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            char[] cbuf = new char[20];
            int len;
            while ((len = inputStreamReader.read(cbuf)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
