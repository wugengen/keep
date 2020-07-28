package com.jdkproxy1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: keep_studying
 * @description: HelloProxy1的改良版本
 * @author: xxx
 * @create: 2020-04-18 10:30
 */
public class HelloProxy2 {
    public static void main(String[] args) throws Exception {
        final Hello00 hello00impl = new Hello00impl();
        Class<?> proxyClass = Proxy.getProxyClass(HelloProxy2.class.getClassLoader(), hello00impl.getClass().getInterfaces());

        //o.say();
        Constructor<?> declaredConstructor = proxyClass.getDeclaredConstructor(InvocationHandler.class);
        Hello00 o = (Hello00) declaredConstructor.newInstance(new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("---before------ method.invoke( hello00impl, args);-----------");
                Object i = method.invoke( hello00impl, args);
                System.out.println("---after------ method.invoke( hello00impl, args);-----------");
                return i;
            }
        });
        System.out.println(o.say(4, 6));
        o.hhh();
    }
}
