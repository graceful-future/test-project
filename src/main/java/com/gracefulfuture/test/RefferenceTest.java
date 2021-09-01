package com.gracefulfuture.test;

import com.gracefulfuture.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenkun
 * @version 1.0
 * @description 引用测试类
 * @create 2021/8/6 15:35
 */
public class RefferenceTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person;
        for (int i = 0; i < 10; i++) {
            person = new Person("person" + (i+1),(22+i));
            personList.add(person);
        }
        personList.forEach(System.out::println);
    }
}
