package com.string;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-16 16:18
 */
public class StringIntern00 {
    public static void main(String[] args) {


        String str1 = "a";
        String str2 = "b";
        String str3 = "ab";
        String str4 = str1 + str2;
        String str5 = new String("ab");

        System.out.println(str5.equals(str3));
        System.out.println(str5 == str3);
        System.out.println(str5.intern() == str3);
        System.out.println(str5.intern() == str4);
        }
}
