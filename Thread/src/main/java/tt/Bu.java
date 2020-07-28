package tt;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-06-30 18:13
 */
public class Bu {


    static class Buf {
        private final int MAX = 5;
        private final ArrayList<Integer> list = new ArrayList<>();
        synchronized void put(int v) throws InterruptedException {
            if (list.size() == MAX) {
                wait();
            }
            list.add(v);
            notifyAll();
        }

        synchronized int get() throws InterruptedException {
            // line 0
            if (list.size() == 0) {  // line 1
                wait();  // line2
                // line 3
            }
            int v = list.remove(0);  // line 4
            notifyAll(); // line 5
            return v;
        }

        synchronized int size() {
            return list.size();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final Buf buf = new Buf();
       new Thread(new Runnable() {
           @Override
           public void run() {
               while (true ) {
                   try {
                       buf.put(1);
                       Thread.sleep(20);
                   }
                   catch (InterruptedException e) {
                       e.printStackTrace();
                       break;
                   }
               }
           }
       }).start();

        for (int i = 0; i < 10; i++) {
           new Thread(new Runnable() {
               @Override
               public void run() {
                   while (true ) {
                       try {
                           buf.get();
                           Thread.sleep(10);
                       }
                       catch (InterruptedException e) {
                           e.printStackTrace();
                           break;
                       }
                   }
               }
           }).start();

        }

    }
}



