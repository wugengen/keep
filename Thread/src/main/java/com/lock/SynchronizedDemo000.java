package com.lock;

/**
 * @program: keep_studying
 * @description: 测试synchronize的使用
 * @author: xxx
 * @create: 2020-05-12 20:36
 */
public class SynchronizedDemo000 {
    static int n=1;
    public static void main(String[] args) throws InterruptedException {

      Thread thread1 =new Thread(){
          @Override
          public void run() {
               for (int i = 1;i <= 999; i++){
                 n++;
                }
          }
      };
      Thread thread2 =new Thread(){
          @Override
          public void run() {
              Thread.yield();
               for (int i = 1;i <= 999; i++){
                 n--;
                }
          }
      };
     thread2.start();
     thread1.start();
     thread1.join();
     thread2.join();
    System.out.println(n);
    }
}
