package com.base;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-11 18:19
 */
public class MyThread {
    public static void main(String[] args) {
        //
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("aaaa");
            }
        };
        Thread thread1 =new Thread(runnable);
        thread1.start();
        //
        // new 类 {
        //
        // }
         Thread thread2 =new Thread(){
             @Override
             public void run() {
                    System.out.println("bbbb");
             }
         };
         thread2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ssss");
            }
        }).start();
        new Thread(()-> System.out.println("aaa")
        ).start();

    }

}
