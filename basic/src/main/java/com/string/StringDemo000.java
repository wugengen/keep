package com.string;

import org.junit.Test;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-24 09:53
 */
public class StringDemo000 {
    public static void main(String[] args) {
         int a=1;
         Integer b=2;
         final String a0="hello";
         String a00="world";
         String a1="hello"+"world";
         String a2="helloworld";
         String a3=a0+"world";
         String a4=a0+a00;
         System.out.println("---------------");
         System.out.println(a1==a2);
         System.out.println(a1==a3);
         System.out.println(a1==a4);
         System.out.println("---------------");
         String bb=new String("helloworld");
         String cc=new  String("helloworld");
         System.out.println(bb==cc);
         System.out.println(bb.equals(cc));

        }
        public void swap(String m,String n){
             String temp = m;
             m=n;
             n=temp;
             System.out.println("m:"+m+" "+"n:"+n);

        }
        public void set(int[] a){
          a[0]=99;
        }
        /**
         * @ Author     :wgg
         * @ Description:方法传递String参数时，形参的改变不会影响实际的常量
         * 方法传递数组参数时，形参的赋值会改变实际的参数值
         * @ Date       :${Date}
        */
        @Test
        public void test(){
          String a="aaa";
          String b="bbb";
          swap(a,b);
          System.out.println(a+b);
          int[] arr={0,0,0,0,0};
          System.out.println("之前的"+arr[0]);
          set(arr);
          System.out.println("set之后"+arr[0]);
        }
}
