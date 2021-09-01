package com.gracefulfuture.test;

import java.util.concurrent.TimeUnit;

/**
 * @author chenkun
 * @version 1.0
 * @description TimeUnit测试类
 * @create 2021/8/20 10:25
 */
public class TimeUnitTest {
    public static void main(String[] args) {
        long convert = TimeUnit.MILLISECONDS.convert(1, TimeUnit.SECONDS);
        System.out.println(convert);
        System.out.println(TimeUnit.SECONDS.toMillis(1));
        System.out.println(TimeUnit.MILLISECONDS.toSeconds(1000));
    }
}
