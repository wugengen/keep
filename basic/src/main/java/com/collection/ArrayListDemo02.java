package com.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: keep_studying
 * @description: List使用remove()方法，其index会自动调整，使用add(index,element)
 * 不会覆盖之前index位置的元素
 * @author: xxx
 * @create: 2020-07-10 12:04
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        List arrlist1=new ArrayList();
        arrlist1.add("a");
        arrlist1.add("b");
        arrlist1.add("c");
        System.out.println(arrlist1);
        arrlist1.remove(0);
        System.out.println(arrlist1);
        System.out.println(arrlist1.get(0));
        arrlist1.add(1,"d");
        System.out.println(arrlist1);
    }
}
