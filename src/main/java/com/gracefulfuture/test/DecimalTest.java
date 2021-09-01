package com.gracefulfuture.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DecimalTest {
    private Optional<String> optional;

    public static void main(String[] args) {
//        System.out.println(Math.round(90.9/60));
//        System.out.println(90.88f/60);
//        BigDecimal a = new BigDecimal(90.88);
//        BigDecimal b = new BigDecimal(60);
//        BigDecimal c= a.divide(b,2, RoundingMode.HALF_UP);
//        System.out.println(c);
        List<String> list = new ArrayList<String>();
        Map<String,String> map = new HashMap<>();
        for (int i = 1; i <= 100; i++) {
            list.add((i % 10) + "");
            map.put("Interface Ethernet0/0/"+(i % 10),(i % 10) + "");
        }
//        boolean b1 = list.stream().allMatch(item -> item.equals("5"));
//        boolean b2 = list.stream().anyMatch(item -> item.equals("5"));
//        String collect = list.stream().collect(Collectors.joining());
//        String collect1 = list.stream().collect(Collectors.joining("-", "a", "b"));
//        Collection<String> collect2 = list.stream().collect(Collectors.toCollection(() -> {
//            List list1 = new ArrayList<String>();
//            list1.add("hello");
//            return list1;
//        }));
//        double doubleValue = list.stream().collect(Collectors.averagingDouble(value -> new Double(value)));
        Object obj = list.stream().collect(Collectors.collectingAndThen(Collectors.groupingBy(s -> s+"#"), (Function<Map<String, List<String>>, Object>) stringListMap -> stringListMap));
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(collect);
//        System.out.println(collect1);
//        System.out.println(collect2);
        System.out.println(obj);
//        System.out.println(map.containsKey("Interface Ethernet0/0/0"));
//        Optional<String> optional = list.stream().collect(Collectors.mapping((value -> value), Collectors.maxBy((o1, o2) -> {
//                    Integer value1 = new Integer(o1);
//                    Integer value2 = new Integer(o2);
//                    return value2.compareTo(value1);
//                }
//        )));
//        System.out.println(optional.get());
//        Object[] objects = list.stream().sorted((o1,o2) -> {
//            Integer value1 = new Integer(o1);
//            Integer value2 = new Integer(o2);
//            return value2.compareTo(value1);}
//        ).distinct().toArray();
//        System.out.println(Arrays.asList(objects));
//        BigDecimal originDecimal = new BigDecimal("0.0152");
//        BigDecimal multiplyDecimal = new BigDecimal(1000);
//        BigDecimal resultDecimal = originDecimal.multiply(multiplyDecimal);
//        System.out.println(resultDecimal);
//        resultDecimal = resultDecimal.divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP);
//        System.out.println(resultDecimal);
//        Optional<String> first = list.stream().findFirst();
//        System.out.println(first.get());
//        Optional<String> any = list.stream().findAny();
//        System.out.println(any.get());
//        list.stream().distinct().forEach(e -> System.out.println(e));
//        list.stream().limit(10).skip(2).forEach(e -> System.out.println(e));
//        list.stream().peek(e -> System.out.println(e + "#")).collect(Collectors.toList());
//        Stream.of("one", "two", "three", "four")
//                .filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e))
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value: " + e))
//                .collect(Collectors.toList());
//        long count = list.stream().count();
//        System.out.println(count);
//        Optional<String> reduce = list.stream().limit(10).reduce(new BinaryOperator<String>() {
//            @Override
//            public String apply(String s1, String s2) {
//                Integer integer1 = new Integer(s1);
//                Integer integer2 = new Integer(s2);
//                return (integer1 - integer2) + "";
//            }
//        });
//        System.out.println(reduce.get());
    }
}
