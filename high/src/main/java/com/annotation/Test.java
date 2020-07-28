package com.annotation;

import java.lang.reflect.Field;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-01 17:46
 */


public class Test {
    @AnnoDemo01
    private Object object;

    public static void main(String[] args) throws Exception {
        Field objfield = Test.class.getDeclaredField("object");
        AnnoDemo01 annoDemo01=objfield.getAnnotation(AnnoDemo01.class);
        System.out.println();
        System.out.println(annoDemo01.address());
        System.out.println(annoDemo01.age());
        System.out.println(annoDemo01.name());
    }
}
