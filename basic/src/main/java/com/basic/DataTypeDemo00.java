package com.basic;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-07-20 13:04
 */
public class DataTypeDemo00 {
    public static void main(String[] args) {
         byte b1=127;
         byte b2=-128;
         char c1=65535;
         char c2='q';
         //char c2=-65536;
         int i1=2147483647;
         System.out.println(b1==c1);
         System.out.println(c2);
         System.out.println(Byte.MAX_VALUE+"***Byte***"+Byte.MIN_VALUE);
         System.out.println(Long.MAX_VALUE+"****Long****"+Long.MIN_VALUE);
         System.out.println(Integer.MAX_VALUE+"***Integer***"+Integer.MIN_VALUE);
         System.out.println(Short.MAX_VALUE+"***Short***"+Short.MIN_VALUE);
         System.out.println(Character.MAX_VALUE+"***Character***"+Character.MIN_VALUE);
         System.out.println();

        }
}
