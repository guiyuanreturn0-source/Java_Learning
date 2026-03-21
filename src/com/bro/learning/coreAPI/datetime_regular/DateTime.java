package com.bro.learning.coreAPI.datetime_regular;

// Date

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    static void main() throws ParseException {
        // Date类
        System.out.println("-------Date类--------");
        Date date = new Date(0L);
        System.out.println(date);// 时间原点
        Date date1 = new Date();
        System.out.println(date1);// 当前时间

        long time = date.getTime();// 获取从时间原点开始过去的毫秒数
        System.out.println(time);
        long time1 = date1.getTime();
        System.out.println(time1);// 你可以用此来比较时间和修改时间

        date1.setTime(0L);
        System.out.println(date1);

        // SimpleDateFormat类
        System.out.println("----------SimpleDateFormat类------------");
        // 格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM--dd HH::mm::ss::SS E a");
        String str = sdf.format(date);
        System.out.println(str);
        // 解析,把字符串时间解析为Date对象
        String timest = "2022---3---17 23:12:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy---MM---dd HH:mm:ss");
        Date date2 = sdf2.parse(timest);
        System.out.println(date2);
        long b = date2.getTime();
        System.out.println(b);

        // Calendar类
        System.out.println("-----------Calendar类-----------");
        // Calendar是一个抽象类,不能直接new创建对象
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));// 从0开始的
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));// 在国外,周日是一周的第一天

        calendar.add(Calendar.YEAR, 1);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(calendar.get(Calendar.YEAR));

        // Instant类
        System.out.println("----------Instant类----------");
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instant1 = Instant.ofEpochSecond(50);
        System.out.println(instant1);
        System.out.println(instant1.isAfter(instant));
        instant1.plusSeconds(10000L);
        instant1 = instant1.minusSeconds(500L);
        System.out.println(instant1);

        // ZoneDateTime类
        System.out.println("----------ZoneDateTime类---------");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.toLocalDate());
        zonedDateTime.withDayOfYear(22);
        System.out.println(zonedDateTime.toLocalDate());

        // 对于很多时间类的方法 plus+ minus- with改 of获取指定时间 now获取现在时间
        // LocalDate类:年月日 LocalTime:时分秒 LocalDateTime:年月日时分秒

        // 计算时间间隔的工具类 Duration:年月日 Period:时分秒 ChronoUnit:所有单位
    }
}
