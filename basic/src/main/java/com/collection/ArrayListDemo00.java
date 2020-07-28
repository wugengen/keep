package com.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: keep_studying
 * @description:  List list= Arrays.asList(a,b);
 * 使用Arrays.asList()方法转成的list没办法进行add，remove，clear操作
 * 因为asList()方法里的ArrayList没有实现这些方法，会直接调用父类的AbstractList
 * 里面的方法直接抛出异常
 * @author: xxx
 * @create: 2020-05-29 20:35
 */
public class ArrayListDemo00 {
    public static void main(String[] args) {
         List arrlist=new ArrayList();
//         arrlist.add("111");
//         System.out.println(arrlist);
         arrlist.clear();
         System.out.println(arrlist);
         String a="aa";
         String b="bb";
         List list= Arrays.asList(a,b);
//         list.add("cc");
//         System.out.println(list);
         arrlist=list;//只是改了引用，对象还是asList()方法new出来的ArrayList。
         arrlist.add("dd");//所以还是不行

         System.out.println(arrlist);



        }
}
