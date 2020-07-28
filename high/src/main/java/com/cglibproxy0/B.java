package com.cglibproxy0;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: MavenDemo000
 * @description:
 * @author: xxx
 * @create: 2020-04-19 17:34
 */
public class B {
    void test() {
        System.out.println("test----");
    }

    public static void main(String[] args) {
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(B.class);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("before-----------");
                Object result= methodProxy.invokeSuper(o,objects);
                System.out.println("after------------");
                return null;
            }
        });
        B b = (B) enhancer.create();
        b.test();
        System.out.println(b.getClass()+"--"+b.getClass().getClassLoader());
    }
}
