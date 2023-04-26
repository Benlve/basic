package com.ben._03_classloader;

import org.junit.Test;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 三大类加载器
 * @create 2023-03-13 22:17
 */
public class Test1ClassLoader {
    @Test
    public void test01() {
        ClassLoader classLoader = Test1ClassLoader.class.getClassLoader();
        System.out.println(classLoader);//系统类加载器 AppClassLoader

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);//扩展类加载器 PlatformClassLoader

        ClassLoader bootClsLoader = parent.getParent();
        System.out.println(bootClsLoader);//引导类加载器 java无法获取

        ClassLoader unknownClsLoader = String.class.getClassLoader();
        System.out.println(unknownClsLoader);//String类由引导类加载器加载 java无法获取
    }
}
