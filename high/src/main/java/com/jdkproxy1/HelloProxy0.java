package com.jdkproxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: keep_studying
 * @description: 生成代理对象字节码文件
 * @author: xxx
 * @create: 2020-04-17 17:37
 */
public class HelloProxy0 implements InvocationHandler {
    //传入目标对象，根据目标对象生成代理对象
    private Object obj;
//    public HelloProxy0(Object hello) {
//        this.obj = hello;
//    }
    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
                this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("HelloProxy0--invoke()---first--");
        Object result = method.invoke(obj, args);
        System.out.println("HelloProxy0--invoke()---end--");
        return result;
    }
    public static void main(String[] args) throws Exception {
        //创建目标对象
        Hello HelloD = new HelloD();
        //直接通过目标对象调用方法
        HelloD.say();
        System.out.println("-------------------------------");
        //创建代理类对象
        HelloProxy0 helloProxy0 = new HelloProxy0();
        //代理对象中设置目标对象
        helloProxy0.setObj(HelloD);
        //通过代理类生成执行目标对象方法的代理对象 $Proxy0
        Hello helloA = (Hello) helloProxy0.getProxy();
        helloA.say();
        //动态生成代理类的字节码文件 $Proxy0
        ClassGenerateUtil.genClass(HelloD.getClass(), helloA.getClass().getSimpleName());
    }
}
