package com;

/**
 * @program: keep_studying
 * @description: volatile可以保证可见性，不能保证原子性,
 * 要保证原子性需要使用synchronize
 * @author: xxx
 * @create: 2020-04-06 11:41
 */
public class ThreadAtomicity000 {

    public static  volatile int num=0;

    public static void main(String[] args) throws Exception{
        Thread[]  arraythread = new Thread[10];
        for (int i = 0;i <= 9; i++){
            arraythread[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                     for (int j = 1;j <= 1000; j++){
                             add();
                      }
                }
            });
        arraythread[i].start();
        }

         for (Thread thread : arraythread){
                         thread.join();
          }
        System.out.println(num);
        }
    static  void add(){
        num++;
    }
//    static synchronized void add(){
//        num++;
//    }
}
