package com.privilege;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-07-20 21:27
 */
public class DemoStatic000 {
    public static void main(String[] args) {
         Order order=null;
         order.test();
         System.out.println(order.count);
        }
}
class  Order{
    static int count = 1;
    static void test(){
    System.out.println("Order**test()*");
}
        }
