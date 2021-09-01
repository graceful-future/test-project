package com.gracefulfuture.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MySupplier implements Supplier<List> {
    @Override
    public List get() {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        return list;
    }
}
