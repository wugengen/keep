package com;

/**
 * @program: keep_studying
 * @description: 描述有序性
 * @author: xxx
 * @create: 2020-04-26 10:20
 */
public class ThreadOrder000 {
    static int i = 0;
    static boolean flag = true;

    public static void main(String[] args) {
         new Thread(new Runnable() {
            @Override
            public void run() {
                if (flag) {
                    i++;
                } else {

                }
            }
        }).start();
         //lambda表达式
        new Thread(()->{
            i++;
            flag=false;
        }).start();

    }
}
