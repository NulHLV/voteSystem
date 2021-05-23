package com.nullv.util;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 获取当前时间工具类，格式对应数据库datetime（yyyy-MM-dd HH:mm:ss）
 *
 * @creat: 2019-08-27 上午 10:03 刘同学
 * @param: null
 * @return:
 */
public class DateTimeUtil {

    public static Date GetDate() {

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        DateFormat df = DateFormat.getDateTimeInstance();

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        return timestamp;
    }

    public static void main(String[] args) {

        System.out.println("当前时间： " + DateTimeUtil.GetDate());

    }
}



