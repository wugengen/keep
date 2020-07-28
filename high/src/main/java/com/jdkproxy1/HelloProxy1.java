package com.jdkproxy1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-18 10:30
 */
public class HelloProxy1 {
    public static void main(String[] args) throws Exception {

        Class<?> proxyClass = Proxy.getProxyClass(HelloProxy1.class.getClassLoader(), Hello00.class);
        //Hello00 o = (Hello00) proxyClass.newInstance();
        //o.say();
        Constructor<?> declaredConstructor = proxyClass.getDeclaredConstructor(InvocationHandler.class);
        Hello00 o = (Hello00) declaredConstructor.newInstance(new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("---------invoke-----------");
                Hello00impl hello00impl =new Hello00impl();
//                int i = hello00impl.say(4, 5);
                Object i = method.invoke(hello00impl, args);
                return i;
            }
        });
        System.out.println(o.say(4, 6));
    }
}
