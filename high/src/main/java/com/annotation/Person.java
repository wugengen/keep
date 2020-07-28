package com.annotation;

import java.lang.annotation.Annotation;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-30 17:01
 */
public abstract class Person implements AnnoDemo00{


    public String name() {
        return null;
    }


    public int age() {
        return 0;
    }


    public String address() {
        return null;
    }


    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
