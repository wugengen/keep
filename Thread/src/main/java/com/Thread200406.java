package com;

/**
 * @program: 学习用
 * @description:使用99个线程从1打印到99
 * @author: xxx
 * @create: 2020-04-06 09:33
 */
public class Thread200406 {
    private  static volatile int totalnum=0;
    public static void main(String[] args) {
            Object lock = new Object();

            for (int i = 1;i <= 99; i++){
                int num = i;
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            synchronized (lock){
                                while(totalnum != num){
                                 lock.wait();
                                }
                                System.out.println(Thread.currentThread().getName()+": "+num);
                                totalnum=totalnum+1;
                                lock.notifyAll();
                            }
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                },"thread-"+num);
            thread.start();
            }
            synchronized (lock){
                totalnum=totalnum+1;
                lock.notifyAll();
            }
        }

}
