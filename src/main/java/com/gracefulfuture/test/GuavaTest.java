package com.gracefulfuture.test;

import com.google.common.io.CharStreams;
import com.google.common.io.LineProcessor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GuavaTest {
    public static void main(String[] args) throws IOException {
//        AtomicDouble atomicDouble = new AtomicDouble(10);
//        double v = atomicDouble.addAndGet(2);
//        if(atomicDouble.compareAndSet(12,20)){
//            double v1 = atomicDouble.get();
//            System.out.println(v1);
//        };
//        System.out.println(v);
//        try {
//            ClassPath classPath = ClassPath.from(GuavaTest.class.getClassLoader());
//            ImmutableSet<ClassPath.ClassInfo> allClasses = classPath.getAllClasses();
//            for (ClassPath.ClassInfo allClass : allClasses) {
//                if(allClass.getPackageName().contains("com.zckj"))
//                System.out.println(allClass.getPackageName() + "-----"+allClass.getName());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add((i / 2) + "");
        }
//        ImmutableSet<String> immutableSet = new ImmutableSet.Builder<String>().addAll(list).build();
//        for (String s : immutableSet) {
//            System.out.println(s);
//        }
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        LineReader lineReader = new LineReader(reader);
//        try {
//            System.out.println(lineReader.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        List<String> resultList = new ArrayList<>();
        List charStreams = CharStreams.readLines(reader, new LineProcessor<List>() {
            @Override
            public boolean processLine(String line) throws IOException {
                if(line.contains("portName")){
                    resultList.add(line.trim());
                };
                return true;
            }

            @Override
            public List getResult() {
               return resultList;
            }
        });
        System.out.println(charStreams);
//        List<String> lines = CharStreams.readLines(reader);
//        System.out.println(lines);

    }
}
