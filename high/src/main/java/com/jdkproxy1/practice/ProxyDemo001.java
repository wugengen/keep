package com.jdkproxy1.practice;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-07-25 15:29
 */
public class ProxyDemo001<T> implements InvocationHandler {

//    private final Class<T> mapperInterface;
//
//    public ProxyDemo001(Class<T> mapperInterface) {
//        this.mapperInterface=mapperInterface;
//    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--before--- method.invoke(proxy,args);-------"+this+"*--");
        System.out.println(Object.class.equals(method.getDeclaringClass()));
        if(method.getName().equals("demo")){
            Object invoke = method.invoke(this, 5, 6);
            return invoke;
        }
//        Object o = method.invoke(this, 7, 6);
//        System.out.println(o);
        System.out.println("--after--- method.invoke(proxy,args);-------");
        return null;
    }

    public static void main(String[] args) {
//        InvocationHandler proxyDemo000 = new ProxyDemo001(InterDemo000.class);
        InvocationHandler proxyDemo000 = new ProxyDemo001();
//        InterDemo000 o = (InterDemo000) Proxy.newProxyInstance(proxyDemo000.getClass().getClassLoader(),
//                InterDemo000.class.getInterfaces(), proxyDemo000);
        InterDemo000 o = (InterDemo000) Proxy.newProxyInstance(proxyDemo000.getClass().getClassLoader(),
                new Class[]{InterDemo000.class}, proxyDemo000);
        int i = o.demo(5, 7);
        System.out.println(i);
        //o.ggg();
    }

//    @Test
//    public  void test() {
//        InvocationHandler proxyDemo000 = new ProxyDemo001(InterDemo000.class);
//        InterDemo000 o = (InterDemo000) Proxy.newProxyInstance(proxyDemo000.getClass().getClassLoader(),
//                InterDemo000.class.getInterfaces(), proxyDemo000);
//        int i = o.demo(5, 6);
//        System.out.println(i);
//    }

}
