package com.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @program: keep_studying
 * @description: 集合泛型只在编译时有效
 * @author: xxx
 * @create: 2020-04-14 21:24
 */
public class ClassDemo0002 {
    public static void main(String[] args) throws Exception {

        ArrayList list =new ArrayList();

        ArrayList<String> list1 =  new ArrayList<String>();
        list1.add("aaa");

        Class c1=list.getClass();

        Class c2=list1.getClass();

        //java中集合的泛型是为防错误输入的，只在编译时候有效
        System.out.println(c1==c2);

        Method m=c2.getMethod("add", Object.class);

        m.invoke(list1,1);

        System.out.println(list1);

        System.out.println(list==list1);
    }
}
