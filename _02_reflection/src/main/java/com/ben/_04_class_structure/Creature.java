package com.ben._04_class_structure;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author 廖新平
 * @Date 2022/12/4 18:01
 */
public class Creature<T> implements Serializable {

    private char gender;

    public double weight;

    private void breath() {
        System.out.println("生物呼吸");
    }

    public void eat() {
        System.out.println("生物吃东西");
    }


}
