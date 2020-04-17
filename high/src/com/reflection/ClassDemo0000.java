package com.reflection;

import java.lang.reflect.Field;

/**
 * @program: keep_studying
 * @description: Class类的理解
 * @author: xxx
 * @create: 2020-04-14 18:10
 */
public class ClassDemo0000 {
    int a;
    String b;
    public static void main(String[] args) throws Exception {
        Class classper = Person.class;
        /*
        String  a="wgg";
        Integer a=1;
        Class classper = a.getClass();
        */
        //Class classper = Class.forName("Person");
        Person per = new Person();
        //Class classper = per.getClass();
        //只能获取共有的成員变量
        Field[] fields_per = classper.getFields();
        //获取全部的成员变量
        Field[] fields_per1 = classper.getDeclaredFields();
        System.out.println(fields_per.length);
        for (int i = 0; i < fields_per.length; i++) {
            System.out.println("----" + fields_per[i].getName());
        }
        Field field = classper.getDeclaredField("address");
        /*getDeclaredField可以得到私有成员变量，
        但是需要设置field.setAccessible(true)，暴力反射赋值，
         */
        field.setAccessible(true);

        System.out.println("per-----000"+per.toString());
        field.set(per,"wgg");
        System.out.println(field.get(per));
        System.out.println("per-----001"+per.toString());


    }
}
