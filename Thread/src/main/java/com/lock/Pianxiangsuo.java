package com.lock;

import org.openjdk.jol.info.ClassLayout;

/**
 * @program: MavenDemo000
 * @description: 偏向锁,
 * 开启偏向锁：-XX:+UseBiasedLocking -XX:BiasedLockingStartupDelay=0
 * 关闭偏向锁：-XX:-UseBiasedLocking
 * @author: xxx
 * @create: 2020-04-27 17:30
 */
public class Pianxiangsuo {
    public static void main(String[] args) {
         Mythread mythread =new Mythread();
         mythread.start();
        }
}

class Mythread extends Thread{
    static  Object object=new Object();

    @Override
    public void run(){
         for (int i = 1;i <= 5; i++){
                     synchronized (object){
                         System.out.println(ClassLayout.parseInstance(object).toPrintable());
                     }
          }
    }
}