package com.ben._02_dynamic;

import org.junit.Test;

import java.util.Random;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 反射的动态性，编译时不确定，运行时确定
 * @create 2023-03-13 22:08
 */
public class Test1Dynamic {

    private static final String CLASS_NAME_PERSON = "com.ben._01_primary.Person";
    private static final String CLASS_NAME_STUDENT = "com.ben._01_primary.Student";
    private static final String CLASS_NAME_OBJECT = "java.lang.Object";

    @Test
    public void test01() {
        for (int i = 0; i < 100; i++) {
            int random = new Random().nextInt(3);//0~2的随机数
            String clsPath = "";
            switch (random) {
                case 0:
                    clsPath = CLASS_NAME_PERSON;
                    break;
                case 1:
                    clsPath = CLASS_NAME_STUDENT;
                    break;
                case 2:
                    clsPath = CLASS_NAME_OBJECT;
                    break;
            }

            try {
                Object instance = newInstance(clsPath);
                System.out.println(instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Object newInstance(String classPath) throws Exception {
        Class clazz = Class.forName(classPath);
        Object obj = clazz.newInstance();
        return obj;
    }
}
