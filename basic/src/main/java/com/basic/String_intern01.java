package com.basic;

/**
 * @program: java11_demo00
 * @description:
 * @author: xxx
 * @create: 2020-07-21 14:40
 */
public class String_intern01 {
    public static void main(String[] args) {
        String a=new String("1");
        String a1= a.intern();
        String b= "1";
        System.out.println(a1==b);

        String aa = new String("1") + new String("1");
        String aa1 = aa.intern();
        String bb = "11";
        System.out.println(aa1 == bb);
    }
}
