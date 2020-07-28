package com.reflection;

import java.lang.reflect.Field;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-07-23 20:31
 */
public class ClassDemo0003 {
    public static void main(String[] args) throws Exception {
        Class clazz=Person.class;
        Object object= clazz.newInstance();
        Field[] field=clazz.getFields();
        System.out.println(field[0]);
        Field field0=clazz.getDeclaredField(field[0].getName());
        field0.setAccessible(true);
        field0.set(object,12);
        System.out.println(object.toString());
    }
}
