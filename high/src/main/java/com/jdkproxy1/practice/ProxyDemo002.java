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
public class ProxyDemo002 implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // object的公用方法直接调用当前invoke对象的。
        System.out.println(Object.class.equals(method.getDeclaringClass()));
        if (Object.class.equals(method.getDeclaringClass())) {
            return method.invoke(this, args);
            // 针对接口的不同方法书写我们具体的实现
        } else if ("showName".equals(method.getName())) {
            System.out.println("张三");
        } else if ("saying".equals(method.getName())) {
            System.out.println("我叫张三");
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("ProxyDemo002.class.getClassLoader()--"+ProxyDemo002.class.getClassLoader());
        System.out.println("InterDemo001.class.getClassLoader()--"+InterDemo001.class.getClassLoader());
        InterDemo001 o = (InterDemo001) Proxy.newProxyInstance(ProxyDemo002.class.getClassLoader(),
                new Class[]{InterDemo001.class}, new ProxyDemo002());
        o.saying();
        o.showName();
        o.hhh();
    }

    @Test
    public  void test() {
        InterDemo000 o = (InterDemo000) Proxy.newProxyInstance(InterDemo000.class.getClassLoader(),
                new Class[]{InterDemo000.class}, this);
        int i = o.demo(5, 6);
        System.out.println(i);
    }

}
