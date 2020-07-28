package com.classloder;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-16 16:59
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://106.12.209.250:8080/examples/");
        URLClassLoader classLoader = new URLClassLoader(new URL[]{url});
        Class cla = classLoader.loadClass("com.proxy.Execl");
        System.out.println("cla======" + cla.getClassLoader());


    }
}
