package vip.leemy.demo1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: Carmine
 * @Date: 2022/1/6-17:10
 * @Description: DateTimeFormatter 时间格式化
 */
public class DateTest2 {
    public static DateTest2 getMe(){
        return new DateTest2();
    }

    public String timeFormatter(long time){
        LocalDateTime localDateTime = DateTest1.getMe().longToLocalDateTimeTwo(time);
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        return df.format(localDateTime);
    }

    public String timeFormatter(long time,String formatter){
        LocalDateTime localDateTime = DateTest1.getMe().longToLocalDateTimeTwo(time);
        DateTimeFormatter df = DateTimeFormatter.ofPattern(formatter);
        return df.format(localDateTime);
    }




    public static void main(String[] args) {
        DateTest2 me = getMe();
        System.out.println(me.timeFormatter(1199767859));
        System.out.println(me.timeFormatter(1199767859,"yyyy-MM-dd HH:mm:ss"));
    }











}
