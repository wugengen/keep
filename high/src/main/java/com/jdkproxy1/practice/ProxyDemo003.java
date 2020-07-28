package com.jdkproxy1.practice;

import com.jdkproxy1.ClassGenerateUtil;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ClassUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-07-25 15:29
 */
public class ProxyDemo003  {

    public static void main(String[] args) throws Exception {
        System.out.println("ProxyDemo002.class.getClassLoader()--"+ ProxyDemo003.class.getClassLoader());
        System.out.println("InterDemo001.class.getClassLoader()--"+InterDemo001.class.getClassLoader());
        InterDemo001 o = (InterDemo001) Proxy.newProxyInstance(ProxyDemo003.class.getClassLoader(),
                new Class[]{InterDemo001.class}, new InvocationHandler() {
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
                });
        //ClassGenerateUtil.genClass(InterDemo001.class, String.valueOf(o));
        o.saying();
        o.showName();
        o.hhh();
    }



}
