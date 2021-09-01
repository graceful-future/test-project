package com.gracefulfuture.test;

import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;

/**
* @description      数据比较测试类
* @author           chenkun
* @create           2021/6/2 15:54
* @version          1.0
*/
public class DataCompareTest {
    public static void main(String[] args) {
//        String str1 = "0.01";
//        String str2 = "0.074";
//        String str3 = "0.00";
//        String str4 = "0.071";
//        Float f1 = new Float(0.12);
//        Float f2 = new Float(1.13);
//        Double d1 = new Double(0.98);
//        Double d2 = new Double(1.00);
//        Integer i1 = new Integer(14);
//        Integer i2 = new Integer(13);
//        System.out.println(str2.compareTo(str4));
//        System.out.println(f1.compareTo(f2));
//        System.out.println(d1.compareTo(d2));
//        System.out.println(i1.compareTo(i2));
        BigDecimal zero = new BigDecimal(0);
        System.out.println(String.format("%04d",1));
        System.out.println("0.006".compareTo("0.001"));
        System.out.println(ObjectUtils.isEmpty(zero));
        System.out.println(zero.doubleValue() == 0d);
    }
}
