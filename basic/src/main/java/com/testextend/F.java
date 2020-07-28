package com.testextend;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-13 10:12
 */
public class F {
    static {
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类代码块");
    }
    public F(){
        System.out.println("父类构造函数");
    }
    public  void test(){
        System.out.println("父类的test方法去调用f()方法");
        f();
    }
    public void f(){
        System.out.println("父类普通方法f()");
    }

}
