package com.ben._01_enum;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO 关键字定义枚举类
 * @create 2023-03-13 18:20
 */
enum EnumSeason implements IShowInfo {

    //1.定义枚举，注意！！！枚举类的对象必须声明在类的最前面
    SPRING("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("宁静的夏天。");
        }
    },
    AUTUMN("秋天", "秋高气爽") {
        @Override
        public void show() {
            System.out.println("秋天不回来。");
        }
    },
    WINTER("冬天", "冰天雪地") {
        @Override
        public void show() {
            System.out.println("大约在冬季。");
        }
    };


    //2.私有化类的构造器，并给对象的属性初始化
    EnumSeason(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.Field final类型，属性不变
    private final String seasonName;
    private final String seasonDesc;


    //4.其他诉求，获取枚举对象的属性


    public String getSeasonDesc() {
        return seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }
}
