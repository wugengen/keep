package proxy.static0;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-07-11 22:35
 */
public class MyThread00 implements Runnable{
    public void run() {
        System.out.println("*******");
    }
    public static void main(String[] args) {
        MyThread00 myThread00 =new MyThread00();
        Thread thread=new Thread(myThread00);
        thread.start();
        }
}
