package com.jdkproxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-14 22:45
 */
public class HelloProxy implements InvocationHandler {

    private Object obj;

    public HelloProxy(Object obj) {
        this.obj = obj;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke "+ method.getName());
        method.invoke(obj,args);
        System.out.println("after invoke "+ method.getName());
        return null;
    }

    public static void main(String[] args) {
        System.out.println("仅仅测试代码发生变化，无意义");
        Hello hello = new HelloC();
        InvocationHandler handler = new HelloProxy(hello);
        Hello helloC = (Hello) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), handler);
        helloC.say();



    }
}
