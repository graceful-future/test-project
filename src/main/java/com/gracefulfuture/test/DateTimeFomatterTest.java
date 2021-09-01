package com.gracefulfuture.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @author chenkun
 * @version 1.0
 * @description 日期时间格式化器测试类
 * @create 2021/7/20 11:24
 */
public class DateTimeFomatterTest {
    public static void main(String[] args) {
//        LocalDateTime localDateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss mm HH dd MM/1 ? yyyy");
//        String currentDateTime = formatter.format(localDateTime);
//        System.out.println(currentDateTime);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime startTime = LocalDate.parse("2021-08-08",formatter2).atStartOfDay();
        LocalDateTime endTime = LocalDate.parse("2021-08-09",formatter2).atStartOfDay();
        long startTimestamp = startTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        long endTimestamp = endTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(startTimestamp + "-->" + endTimestamp);
    }
}
