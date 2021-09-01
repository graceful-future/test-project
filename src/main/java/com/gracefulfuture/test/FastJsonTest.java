package com.gracefulfuture.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author chenkun
 * @version 1.0
 * @description FastJson测试类
 * @create 2021/7/20 10:21
 */
public class FastJsonTest {
    public static void main(String[] args) {
        String jsonStr = "[\"China\",\"Russia\",\"America\",\"Pakistan\",\"India\"]";
        String[] country = {"China","Russia","America","Pakistan","India"};
//        JSONArray jsonArray = JSONArray.parseArray(jsonStr);
//        JSONArray jsonArray = JSON.parseArray(jsonStr);
        JSONArray jsonArray = JSONObject.parseArray(jsonStr);
        System.out.println(jsonArray);
        Object o = JSONArray.toJSON(country);
        System.out.println(o);
    }
}
