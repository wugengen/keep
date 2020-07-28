package com.hash;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-10 20:41
 */
public class MyMap {
    public static void main(String[] args) {
//        HashMap<String,String> hashMap=new HashMap();
//        hashMap.put("nn","aa");
//        hashMap.put("mm","oo");
//
//        Set keys= hashMap.keySet();
//         for (Object key: keys){
//              if (key.equals("nn")){
//                  hashMap.remove(key);
//              }
//          }
        LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap();
        linkedHashMap.put("nn","aa");
        linkedHashMap.put("mm","oo");

        Set keys1= linkedHashMap.keySet();
        for (Object key: keys1){
            if (key.equals("nn")){
                linkedHashMap.remove(key);
            }
        }
        ConcurrentHashMap<String,String> concurrentHashMap=new ConcurrentHashMap();
        concurrentHashMap.put("nn","aa");
        concurrentHashMap.put("mm","oo");

        Set keys3= concurrentHashMap.keySet();
        for (Object key: keys3){
            if (key.equals("nn")){
                concurrentHashMap.remove(key);
            }
        }
        Hashtable<String,String> hashtable=new Hashtable();
        hashtable.put("nn","aa");
        hashtable.put("mm","oo");

        Set keys2= hashtable.keySet();
        for (Object key: keys2){
            if (key.equals("nn")){
                hashtable.remove(key);
            }
        }

//        String value =  hashMap.put("ww","bb");
//        System.out.println(value);
//        LinkedHashMap linkedHashMap=new LinkedHashMap();
//        TreeMap treeMap=new TreeMap();
//        WeakHashMap weakHashMap=new WeakHashMap();
//        Hashtable hashtable=new Hashtable();


    }
}
