package com.serializble;

import java.io.Serializable;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-10 10:59
 */
public class Wgg2 implements Serializable {
    int age;
    String name;
    static String address;

    public Wgg2(int age, String name,String address) {
        this.age = age;
        this.name = name;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Wgg2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
