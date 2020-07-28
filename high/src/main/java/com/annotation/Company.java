package com.annotation;

import com.sun.istack.internal.NotNull;

import java.lang.annotation.Annotation;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-01 17:44
 */
public class Company implements Annotation {

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
