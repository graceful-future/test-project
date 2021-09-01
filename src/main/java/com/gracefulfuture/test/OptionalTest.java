package com.gracefulfuture.test;

import com.gracefulfuture.entity.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author chenkun
 * @version 1.0
 * @description Optional测试类
 * @create 2021/8/16 17:49
 */
public class OptionalTest {
    public static void main(String[] args) throws Throwable {
        List<Integer> list = Arrays.asList(2, 5, 6, 4, 8, 9, 10);
        Optional<List<Integer>> optional = Optional.of(list);
        System.out.println(Optional.ofNullable(null).orElse("hi"));
        System.out.println(Optional.empty().isPresent());
        Optional.of(10).ifPresent(System.out::println);
        System.out.println(Optional.of(10).get());
        System.out.println(Optional.of(12));
        System.out.println(Optional.ofNullable("come").orElseThrow((Supplier<Throwable>) () -> new Exception("go away")));
//        optional.get().add(3);
        System.out.println(optional.get().stream().filter(e -> e > 5)
                .collect(Collectors.toList()));
        System.out.println(optional.get());
        Optional<Person> optional2 = Optional.of(new Person("zhangsan",28));
        optional2.get().setAge(30);
        System.out.println(optional2.get());
    }
}
