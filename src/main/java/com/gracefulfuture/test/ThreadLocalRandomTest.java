package com.gracefulfuture.test;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author chenkun
 * @version 1.0
 * @description ThreadLocalRandom测试类
 * @create 2021/7/20 11:05
 */
public class ThreadLocalRandomTest {
    public static void main(String[] args) {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
//        threadLocalRandom.setSeed(10l);
        for (int i = 0; i < 10; i++) {
//            System.out.println(threadLocalRandom.nextBoolean());
//            System.out.println(threadLocalRandom.nextInt());
//            System.out.println(threadLocalRandom.nextInt(10));
//            System.out.println(threadLocalRandom.nextFloat());
//            System.out.println(threadLocalRandom.nextDouble());
//            System.out.println(threadLocalRandom.nextDouble(10));
//            System.out.println(threadLocalRandom.nextInt(3,10));
        }
        threadLocalRandom.ints().limit(5).forEach(System.out::println);
    }
}
