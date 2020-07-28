package com;

/**
 * @program: 学习用
 * @description:volatile关键字的使用
 * @author: xxx
 * @create: 2020-04-06 10:09
 */
public class ThreadVisibility000 {
     static volatile boolean is = true;

    public static void main(String[] args) {
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("---------thread1");
                    while (is) {
                        System.out.println("*****"+is);
                    }

                }
            }).start();
            Thread.sleep(1000);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("**********thread2");
                    is = false;
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

}
