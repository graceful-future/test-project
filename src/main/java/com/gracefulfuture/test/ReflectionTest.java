package com.gracefulfuture.test;

import com.gracefulfuture.entity.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
* @description      反射测试类
* @author           chenkun
* @create           2021/6/2 9:15
* @version          1.0
*/
public class ReflectionTest {
    public static void main(String[] args) {
        Person person = new Person("Jack",28);
        Class clazz = person.getClass();
//        Class clazz = Person.class;
        try {
            Person p1 = (Person) clazz.newInstance();
            Constructor constructor = clazz.getDeclaredConstructor();
            Person p2 = (Person) constructor.newInstance();

            Method seTAge = clazz.getDeclaredMethod("setAge", int.class);
            seTAge.invoke(p1,26);
            Method getAge = clazz.getDeclaredMethod("getAge",null);
            Object age = getAge.invoke(p1,null);
            System.out.println(age);
//            System.out.println(p1);
//            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
