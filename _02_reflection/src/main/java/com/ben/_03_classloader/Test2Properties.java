package com.ben._03_classloader;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 通过Properties获取配置文件内容
 * @create 2023-03-13 22:23
 */
public class Test2Properties {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        ClassLoader classLoader = Test2Properties.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc2.properties");//默认在resources文件夹下

        properties.load(is);
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
        System.out.println("name = " + name + ", password = "
                + password);

//        //方式二：
//        Properties properties1 = new Properties();
//        InputStream stream = Test2Properties.class.getResourceAsStream("jdbc2.properties");//inStream parameter is null
//        properties1.load(stream);
//
//        String key1 = properties1.getProperty("key1");
//        String key2 = properties1.getProperty("key2");
//        System.out.println("key1 = " + key1 + ", key2 = " + key2);

    }

    @Test
    public void test01() throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/props/jdbc2.properties");

        //一个一个的获取
        properties.load(fis);//读取properties文件

        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
        String notExist = properties.getProperty("notExist");

        System.out.println("name = " + name + ", password = "
                + password + ", notExist = " + notExist);

        System.out.println("\n============\n");

        Enumeration<String> names = (Enumeration<String>) properties.propertyNames();
        while (names.hasMoreElements()) {
            String s = names.nextElement();
            System.out.println(s);
        }


    }
}
