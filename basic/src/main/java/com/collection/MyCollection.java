package com.collection;

import sun.misc.Unsafe;

import java.util.*;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-10 15:37
 */
public class MyCollection {
    public static void main(String[] args) {

//        int[] arr0 ={1,2,3};
//        int arr1[]={3,2,1};
//        int arr2[];
//        //arr2={1,2,3,4};
//        int[] arr3= new int[5];
//        for (int array: arr0){
//           System.out.println(array);
//        }

        List<String> arrayList =new ArrayList(1);
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("aaa");
        for (String arr :arrayList){
            if (arr.equals("aaa")){
                arrayList.remove(arr);
            }
        }
//        System.out.println("Arraylist-----"+arrayList+arrayList.contains("aaa")+arrayList.hashCode());
//        List linkedList=new LinkedList<>();
//        linkedList.add("aa");
//        linkedList.add("aa");
//        linkedList.add("bb");
//        System.out.println("linkedList-----"+linkedList);
//        Vector vector=new Vector();
//        vector.add("aa");
//        vector.add("aa");
//        vector.add("bb");
//        System.out.println("vector-----"+vector);
//
//
//        HashSet hashSet=new HashSet();
//        hashSet.add("aa");
//        hashSet.add("bb");
//        hashSet.add("aa");
//        System.out.println("HashSet---"+hashSet);
//
//        TreeSet treeset=new TreeSet();
//        HashSet linkedHashSet=new LinkedHashSet<>();




    }
}
