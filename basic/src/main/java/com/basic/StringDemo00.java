package com.basic;

/**
 * @program: java11_demo00
 * @description:
 * @author: xxx
 * @create: 2020-07-21 13:55
 */
public class StringDemo00 {
    public static void main(String[] args) {

        //final    String a="1";
        //final    String b="2";
        String a = "1";
        String b = "2";
        String c0 = "12";
        String c1 = "1" + "2";
        String c2 = a + b;
        System.out.println(c0 == c1);
        System.out.println(c0 == c2);//把a,b声明为final
    }
}
