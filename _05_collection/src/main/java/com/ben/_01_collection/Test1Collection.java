package com.ben._01_collection;

import org.junit.Test;

import java.util.*;

public class Test1Collection {
    @Test
    public void test01() {
        //add(Object o)
        Collection coll = new ArrayList();

        //add
        coll.add("AA");
        coll.add(123);
        coll.add(new Object());
        coll.add(new Person("Tom", 21));

        System.out.println(coll);


        //addAll(Collection other)
        Collection coll1 = new ArrayList();
        coll1.add("BB");
        coll1.add(456);

        System.out.println(coll1.size());

        coll1.addAll(coll);

        System.out.println(coll1.size());


    }

    @Test
    public void test02() {
        //add(Object o)
        Collection coll = new ArrayList();

        //add
        coll.add("AA");
        coll.add(123);
        coll.add(new Person("Tom", 21));


        //isEmpty()
        System.out.println(coll.isEmpty());

        //contains(Object o)
        System.out.println(coll.contains("AA"));
        System.out.println(coll.contains(123));
        System.out.println(coll.contains(new Person("Tom", 21)));

    }


    //删除
    @Test
    public void test03() {
        //add(Object o)
        Collection coll = new ArrayList();

        //add
        coll.add("AA");
        coll.add("AA");
        coll.add(123);
        coll.add(new Person("Tom", 21));

//        coll.clear();

        System.out.println(coll);


        //remove
        coll.remove("AA");
        System.out.println(coll);

    }

    @Test
    public void test04() {
        //add(Object o)
        Collection coll = new ArrayList();

        //add
        coll.add("AA");
        coll.add(123);
        coll.add(new Person("Tom", 21));

        Object[] array = coll.toArray();
        System.out.println(Arrays.toString(array));


    }

    @Test
    public void test05() {
        //数组到集合
        String[] arr = {"AA", "BB", "CC"};
        System.out.println(Arrays.toString(arr));//打印数组元素

        List<String> list = Arrays.asList(arr);//数组 -> 集合
        System.out.println(list);

        List<String> list1 = Arrays.asList("aa", "bb", "cc", "dd");
        System.out.println(list1);


    }

    @Test
    public void test06() {
        int[] arr = new int[]{1, 2, 3};
        Class superclass = arr.getClass().getSuperclass();
        System.out.println(arr.getClass().getSimpleName());
        System.out.println(superclass.getSimpleName());

        PrimitiveIterator.OfInt iterator1 = Arrays.stream(arr).iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        Integer[] arr2 = new Integer[]{1, 2, 3};
        Iterator<Integer> iterator = Arrays.stream(arr2).iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
