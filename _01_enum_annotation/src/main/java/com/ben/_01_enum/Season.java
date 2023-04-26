package com.ben._01_enum;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 自定义枚举类，不使用enum关键字
 * @create 2023-03-13 18:13
 */
public class Season {
    //1.声明Season对象的属性，final修饰每个对象的属性不可变
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器，并给对象的属性初始化
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个对象
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "冰天雪地");

    //4.其他诉求：获取枚举类对象的属性
    //诉求一：
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //诉求二：提供toString()


    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
