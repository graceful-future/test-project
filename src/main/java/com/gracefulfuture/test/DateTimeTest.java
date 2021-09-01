package com.gracefulfuture.test;

import org.springframework.util.StringUtils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
* @description      日期时间测试类
* @author           chenkun
* @create           2021/6/3 10:29
* @version          1.0
*/
public class DateTimeTest {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
        //yyyy-MM-dd HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Instant instant = Instant.ofEpochMilli(System.currentTimeMillis());
//        System.out.println(instant);
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(System.currentTimeMillis());
//        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
//        int hour = calendar.get(Calendar.HOUR);
//        System.out.println(hourOfDay);
//        System.out.println(hour);
//        instant = calendar.toInstant();
//        System.out.println(instant);
//        calendar = format.getCalendar();
//        System.out.println(calendar.getTime());
//        Date date = new Date(System.currentTimeMillis());
//        String dateStr = format.format(date);
//        System.out.println(dateStr);
//        System.out.println(dateStr.substring(11,13));
        long currentTime = System.currentTimeMillis();
//        long before = currentTime - 1000 * 60;
//        long difference = (currentTime - before) / (1000 * 60);
//        System.out.println(difference);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(currentTime - before);
//        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(currentTime);
//        LocalDateTime localDateTime = LocalDateTime.now().withDayOfMonth(1);
//        System.out.println(formatter2.format(localDateTime));
        long milliSeconds = LocalDateTime.parse("2021-08-11 16:30:56",formatter).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(milliSeconds/1000,0,ZoneOffset.of("+8"));
        localDateTime = Instant.ofEpochMilli(milliSeconds).atZone(ZoneOffset.of("+8")).toLocalDateTime();
        System.out.println(milliSeconds);
        System.out.println(formatter.format(localDateTime));
        System.out.println(StringUtils.isEmpty(10l));
    }
}
