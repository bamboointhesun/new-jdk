package vip.leemy.demo1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @Author: Carmine
 * @Date: 2022/1/6-11:47
 * @Description: 新的时间api
 */
public class DateTest {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDateTime now1 = LocalDateTime.now();

        Instant instant = now1.toInstant(ZoneOffset.of("+8"));
        long l = instant.toEpochMilli();
        long epochSecond = instant.getEpochSecond();
//        System.out.println(l);
//        System.out.println(epochSecond);
//
//        String s = now.toString();
//        String s1 = now1.toString();
//        System.out.println("当前日期："+s);
//        System.out.println("当前时间："+s1);
//        System.out.println("获取当前年："+now.getYear());
//        System.out.println("获取当前时："+now1.getHour());
//
//
//        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        1641450818
        // 新疆时间
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(1641450818L, 0, ZoneOffset.ofHours(6));
        // 北京时间
        LocalDateTime localDateTime1 = LocalDateTime.ofEpochSecond(1641450818L, 0, ZoneOffset.ofHours(8));
        String format = df.format(localDateTime);
        String format1 = df.format(localDateTime1);
        System.out.println(format);
        System.out.println(format1);
    }


}