package com.ben._01_primary;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 反射操作对象
 * @create 2023-03-13 21:28
 */
public class Test1Reflection {

    @Test
    public void test01() {
        //1.反射之前，对于Person类的操作
        //①创建Person类的对象
        Person p1 = new Person();//空参构造器
        Person p2 = new Person("Tom", 21);
        //②通过对象调用内部属性、方法
        p2.setAge(18);
        p2.setName("Jerry");
        System.out.println(p2);

        p2.show();
    }

    @Test
    public void test02() throws Exception {
        //1.通过反射，创建Person对象
        //①获取Person类的Class实例
        Class personCls1 = Person.class;
        //②获取Person类的构造器
        Constructor cons1 = personCls1.getConstructor(String.class, int.class);
        //③通过构造器对象获取
        Person p1 = (Person) cons1.newInstance("Michael", 30);
        System.out.println(p1);

        //2.通过反射，调用对象指定的属性和方法
        Field age1 = personCls1.getDeclaredField("age");
        age1.set(p1, 45);//赋值属性 相当于p1.age = 45
        System.out.println(p1);
        Method m1 = personCls1.getDeclaredMethod("show");
        m1.invoke(p1);//调用方法

        System.out.println("\n============================\n");

        //3.调用类的私有结构
        //①私有构造器
        Constructor cons2 = personCls1.getDeclaredConstructor(String.class);
        cons2.setAccessible(true);
        Person p2 = (Person) cons2.newInstance("Ben");
        p2.setAge(25);
        System.out.println(p2);
        //②私有属性
        Field f1 = personCls1.getDeclaredField("name");
        f1.setAccessible(true);
        f1.set(p2, "chun_bin");
        System.out.println(p2);
        //③私有方法
        Method m2 = personCls1.getDeclaredMethod("showNation", String.class);
        m2.setAccessible(true);
        String returnVal = (String) m2.invoke(p2, "中国");
        System.out.println(returnVal);

        /*
         * 总结：
         * 1.通过new的方式和反射都可以创建对象调用到公共的结构，开发中到底选择用哪个？
         * 建议：直接用new关键字的方式。
         * 什么时候用反射创建对象？
         * 编译时确定创建的对象用new，需要运行时确定造某个类的对象时用反射的方式创建对象。
         * 2.反射和封装性矛盾吗？如何看待这两个技术？
         * 不矛盾。封装性具有提示意义，体现的是建议调不调用的问题，反射体现的是能不能调用的问题
         *
         */

        /*
         * 关于java.lang.Class类的理解
         * 1.类的编译和加载过程：
         * 编译：
         * 程序经过javac.exe命令以后，会生成一个或多个字节码。
         * 加载
         * java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中。此过程称为类的加载过程。
         * 加载到内存中的类，我们就称为运行时类，此运行时类，就称为Class的一个实例。
         *
         * 2.换句话说，Class的实例就对应着一个运行时类。
         * 3.加载到内存的运行时类，会缓存一端时间，在此时间之内，我们可以通过不同的方式来获取此运行时类
         */

    }

    private static final String CLASS_NAME = "com.ben._01_primary.Person";

    /*
     *
     * TODO 获取class实例的方法
     * */
    @Test
    public void test03() throws Exception {
        //方法一：调用运行时类的属性：.class
        Class<Person> personCls1 = Person.class;
        System.out.println(personCls1);
        //方式二：通过运行时类的对象：调用getClass()
        Person person = new Person();
        Class personCls2 = person.getClass();
        System.out.println(personCls2);
        //方式三：调用Class的静态方法：forName(String classPath)
        Class personCls3 = Class.forName(CLASS_NAME);
        System.out.println(personCls3);
        //方式四：ClassLoader加载
        ClassLoader classLoader = Test1Reflection.class.getClassLoader();
        Class personCls4 = classLoader.loadClass(CLASS_NAME);
        System.out.println(personCls4);

        //比较：Class实例是否内存只存在一份
        System.out.println(personCls1 == personCls2);
        System.out.println(personCls1 == personCls3);
        System.out.println(personCls1 == personCls4);

        // TODO 开发中推荐使用 Class.forName();
        Person p1 = new Person();

        Class<Person> personCls5 = (Class<Person>) Class.forName(CLASS_NAME);

        Method m1 = personCls5.getDeclaredMethod("showNation", String.class);
        m1.setAccessible(true);
        m1.invoke(p1,"中国");

    }
}
