package vip.leemy.demo1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author : Carmine
 * @date: 2022/1/6-14:42
 * @description:  LocalDateTime 和 时间戳
 */
public class DateTest1 {

    public static DateTest1 getMe(){
        return new DateTest1();
    }

// LocalDateTime 转时间戳
    public long localDateTimeToLongOne(LocalDateTime localDateTime){
        // ZoneOffset.ofHours(8)  东8区时间
        long second = localDateTime.toEpochSecond(ZoneOffset.ofHours(8));
        System.out.println("位数是：" + String.valueOf(second).length());
        return second;
    }
    public long localDateTimeToLongTwo(LocalDateTime localDateTime){
        // ZoneOffset.ofHours(8)  东8区时间
        // LocalDateTime 先转成 Instant
        long second = localDateTime.toInstant(ZoneOffset.of("+8")).getEpochSecond();
        System.out.println("位数是：" + String.valueOf(second).length());
        return second;
    }
    public long localDateTimeToLongThree(LocalDateTime localDateTime){
        // ZoneOffset.ofHours(8)  东8区时间
        // LocalDateTime 先转成 Instant
        long milli = localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println("位数是：" + String.valueOf(milli).length());
        return milli;
    }
// LocalDateTime 转时间戳



// 时间戳 转LocalDateTime
    /**
     * 接受一个10位的时间戳,如果是13位就扣除三位
     * @param time 接受的时间戳
     * @return 返回 LocalDateTime
     */
    public LocalDateTime longToLocalDateTimeOne(long time){
        // 接受一个10位的时间戳
        if (String.valueOf(time).length() >= 13){
            time /= 1000;
        }
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(time, 0, ZoneOffset.ofHours(8));
        System.out.println("接受一个10位的时间戳,如果是13位就扣除三位");
        return localDateTime;
    }
    /**
     * 接受一个时间戳,兼容10位和13位
     * @param time 接受的时间戳
     * @return 返回 LocalDateTime
     */
    public LocalDateTime longToLocalDateTimeTwo(long time){
        Instant instant = null;
        if (String.valueOf(time).length() == 10) {
            instant = Instant.ofEpochSecond(time);
        } else {
            instant = Instant.ofEpochMilli(time);
        }
        LocalDateTime localDateTime = instant.atZone(ZoneOffset.ofHours(8)).toLocalDateTime();
        System.out.println("接受一个时间戳");
        return localDateTime;
    }
// 时间戳 转LocalDateTime

// LocalDate 转时间戳
    /**
     * 一天的开始
     * @param localDate
     * @return
     */
    public long localDateToLongOne(LocalDate localDate){
//        localDate.atStartOfDay().toInstant(ZoneOffset.of("+8")).toEpochMilli();
         return localDate.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().getEpochSecond();
    }
// LocalDate 转时间戳

// 时间戳转 LocalDate
    public LocalDate longToLocalDate(long time){
        if (String.valueOf(time).length() == 10) {
            return Instant.ofEpochSecond(time).atOffset(ZoneOffset.of("+8")).toLocalDate();
        } else {
            return Instant.ofEpochMilli(time).atZone(ZoneOffset.ofHours(8)).toLocalDate();
        }
    }
// 时间戳转 LocalDate





    public static void main(String[] args) {
//        Instant now = Instant.now();
//        System.out.println(now.getEpochSecond());
//        System.out.println(now);


        DateTest1 me = getMe();
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(me.localDateTimeToLongOne(now));
//        System.out.println(me.localDateTimeToLongTwo(now));
//        System.out.println(me.localDateTimeToLongThree(now));
//        System.out.println(me.longToLocalDateTimeOne(1610121599L));
//        System.out.println(me.longToLocalDateTimeOne(1610121595000L));
//        System.out.println(me.longToLocalDateTimeTwo(1610121599L));
//        System.out.println(me.longToLocalDateTimeTwo(1610121595000L));
//        System.out.println(me.localDateToLongOne(LocalDate.now()));
        System.out.println(me.longToLocalDate(1199767859000L));
        System.out.println(me.longToLocalDate(1199767859));

    }




}
