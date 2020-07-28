package com.testextend;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-13 10:12
 */
public class S extends F{
    static {
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类代码块");
    }
    public S(){
        System.out.println("子类构造函数");
    }
    @Override
    public void f(){
        System.out.println("子类重写父类的普通方法f()");
    }
    public static void main(String[] args) {
//         S s =new S();
        Class sClass=S.class;
        try {
           S s= (S) sClass.newInstance();
           s.test();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        }
}
