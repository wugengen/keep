package com.jdkproxy1.practice;

import com.classloder.Demo00;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-07-25 15:29
 */
public class ProxyDemo000 implements InvocationHandler {

    private Object object;

    public ProxyDemo000(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--before--- method.invoke(proxy,args);-------");
        System.out.println(Object.class.equals(method.getDeclaringClass()));
        Object o = method.invoke(object, 7, 6);
        System.out.println(o);
        System.out.println("--after--- method.invoke(proxy,args);-------");
        return o;
    }

    public static void main(String[] args) {
        InterDemo000 demo000 = new Demo000();
        System.out.println(demo000.getClass().getInterfaces()[0]);
//         System.out.println(demo000.demo());
        InvocationHandler proxyDemo000 = new ProxyDemo000(demo000);
        InterDemo000 o = (InterDemo000) Proxy.newProxyInstance(proxyDemo000.getClass().getClassLoader(),
                demo000.getClass().getInterfaces(), proxyDemo000);
        int i = o.demo(5, 6);
        System.out.println(i);
    }
}
