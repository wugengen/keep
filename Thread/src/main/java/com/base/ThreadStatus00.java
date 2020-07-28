package com.base;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-14 10:37
 */
public class ThreadStatus00 {
    public static void main(String[] args) throws InterruptedException {
         Thread thread= new Thread("t1"){
             @Override
             public void run() {
                 System.out.println("--1--"+currentThread().getName()+"--"+getState());
                 //interrupt();
                 try {
                     sleep(2000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 synchronized (ThreadStatus00.class){
                 System.out.println("--2--"+currentThread().getName()+getState());
                 }
                 System.out.println("11111");
             }
         };

    /*如果调用Thread实例的run方法启动线程，
     那么该实例里的run方法代码实际是由main线程执行,
     并不会启动创建的线程实例，创建的线程实例的状态一直处于new状态
    * */
    //thread.run();
    synchronized (ThreadStatus00.class){
        System.out.println("同步代码块");
        thread.interrupt();
        Thread.sleep(1000);
    }
        thread.start();
    System.out.println("--3--"+thread.getState());
    Thread.sleep(1000);
    System.out.println("--4--"+thread.getState());
    }
}
