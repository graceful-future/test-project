package com.gracefulfuture.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author chenkun
 * @version 1.0
 * @description List测试类
 * @create 2021/7/21 10:22
 */
public class ListTest {
    public static void main(String[] args) {
        String[] strArr = {};
        List<String> abnormalTypeList = Arrays.asList("","no_vio","no_vio_003","no_vio_006");
        abnormalTypeList.stream().forEach(System.out::println);
        List<String> strList = Arrays.asList(strArr);
        strList.stream().forEach(e -> {
            System.out.println("=========");
        });
    }
}
