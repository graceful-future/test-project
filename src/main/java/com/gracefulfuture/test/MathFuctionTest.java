package com.gracefulfuture.test;

import java.util.Random;

/**
 * @author chenkun
 * @version 1.0
 * @description 数学函数测试类
 * @create 2021/7/12 15:52
 */
public class MathFuctionTest {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(10) + "\t");
        }
    }
}
