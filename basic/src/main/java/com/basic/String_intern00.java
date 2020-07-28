package com.basic;

/**
 * @program: java11_demo00
 * @description:
 * @author: xxx
 * @create: 2020-07-21 14:40
 */
public class String_intern00 {
    public static void main(String[] args) throws InterruptedException {
        String a=new String("1");
        a.intern();//調用此方法之前，字符串常量池已經存在了“1”
        String b= "1";
        System.out.println(a==b);

        String aa = new String("1") + new String("1");
        aa.intern();//調用此方法之前，字符串常量池中沒有“11”
        Thread.sleep(100000);
        String bb = "11";
        System.out.println(aa == bb); //jdk6中結果為false，jdk7/8為true，jdk11為false
    }
}
