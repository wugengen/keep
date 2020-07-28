package com.collection.guess;

/**
 * @program: keep_studying
 * @description:
 * ArrayList既然继承自AbstractList抽象类，
 * 而AbstractList已经实现了List接口，那么ArrayList类为何还要再实现List接口呢？
 * @author: xxx
 * @create: 2020-06-25 14:14
 */


import java.io.Serializable;
import java.util.Arrays;

public class Test {

    public static interface MyInterface {
        void foo();
    }

    public static class BaseClass implements MyInterface, Cloneable, Serializable {

        @Override
        public void foo() {
            System.out.println("BaseClass.foo");
        }
    }

    public static class Class1 extends BaseClass {

        @Override
        public void foo() {
            super.foo();
            System.out.println("Class1.foo");
        }
    }

    static class Class2 extends BaseClass implements MyInterface, Cloneable,
            Serializable {

        @Override
        public void foo() {
            super.foo();
            System.out.println("Class2.foo");
        }
    }

    public static void main(String[] args) {

        showInterfacesFor(BaseClass.class);
        showInterfacesFor(Class1.class);
        showInterfacesFor(Class2.class);
    }

    private static void showInterfacesFor(Class<?> clazz) {
        System.out.printf("%s --> %s\n", clazz, Arrays.toString(clazz
                .getInterfaces()));
    }
}