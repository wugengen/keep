package com.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-14 22:44
 */
public class HelloC implements Hello {

    @Override
    public void say() {
        System.out.println("Hello world");
    }


}
