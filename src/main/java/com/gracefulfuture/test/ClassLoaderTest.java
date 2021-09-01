package com.gracefulfuture.test;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            Enumeration<URL> resources = contextClassLoader.getResources("META-INF/spring.factories");
            while(resources.hasMoreElements()){
                URL url = resources.nextElement();
                System.out.println(url);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
