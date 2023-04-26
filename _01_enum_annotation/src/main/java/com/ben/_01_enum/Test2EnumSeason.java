package com.ben._01_enum;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 测试枚举类EnumSeason
 * @create 2023-03-13 20:43
 */
public class Test2EnumSeason {
    public static void main(String[] args) {
        EnumSeason spring = EnumSeason.SPRING;
        System.out.println(spring.getSeasonName());
        System.out.println(spring.getSeasonDesc());
    }
}
