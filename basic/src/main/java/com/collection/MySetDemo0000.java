package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-06-23 19:47
 */
public class MySetDemo0000 {
    public static void main(String[] args) {
        HashSet set00=new HashSet<>();
        boolean b1= set00.add(11);
        boolean b2= set00.add(22);
        boolean b3= set00.add(11);
        System.out.println(b1+" "+b2+" "+b3);
        HashMap hashMap00=new HashMap<>();
        Object aa = hashMap00.put("aa","11");
        Object bb = hashMap00.put("aa","22");
        System.out.println(aa+"---"+bb);
         for (Object hashSet: set00){
             System.out.println(hashSet);
        }
}
}
