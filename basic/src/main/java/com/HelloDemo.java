package com;

import com.sun.org.apache.xml.internal.utils.StringVector;

/**
 * @program: keep_studying
 * @description:main方法参数的另一种写法
 * @author: xxx
 * @create: 2020-06-02 00:34
 */
public class HelloDemo {
    public static void main(String... args) {
        System.out.println("hello world");
        ;
        int a=1;
        String b;

        //a=++a;
        //a=a++;
        //a++;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a++);
        //5 * 2^4
        System.out.println(a<<4);
//        int b=+1;
//        int c=-1;
//        System.out.println("b"+b+" "+"c"+c);
        int[] intarr;
        String string1="abc";
        char[] chars=new char[]{'a','b','c'};
        String string2=new String(chars);
        System.out.println(string1==string2);
        System.out.println(string1.equals(string2));
        //整形二进制，16进制，10进制
        int val0=0b1010;
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.println(bitmask+" "+ val);
        System.out.println(val & bitmask);

    }
}
