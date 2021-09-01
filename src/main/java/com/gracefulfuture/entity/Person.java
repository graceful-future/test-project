package com.gracefulfuture.entity;

import lombok.Data;

/**
* @description      Person实体类
* @author           chenkun
* @create           2021/6/2 9:13
* @version          1.0
*/
@Data
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
