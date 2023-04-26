package com.ben._04_data;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 廖新平
 * @version 1.0.0
 * @decription TODO
 * @create 2023-03-16 11:13
 */
public class Test2SimpleDateFormat {
    @Test
    public void test01() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();

        String format = sdf.format(date);

        System.out.println(format);//2023/3/16 上午11:15

        Date parse = sdf.parse("2023/3/16 上午11:15");
        System.out.println(parse);


    }


    @Test
    public void test02() throws ParseException {

        String formatStr1 = "EEE, d MMM yyyy HH:mm:ss Z";
        String formatStr2 = "yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat sdf = new SimpleDateFormat(formatStr2);

        Date date = new Date();

        String format = sdf.format(date);

        System.out.println(format);


        //解析
        Date parse = sdf.parse("2023-03-16 11:21:19");
        System.out.println(parse);

    }
}
