package com.serializble;

import java.io.Serializable;
import java.util.Objects;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-09 22:06
 */
public class Wgg_copy implements Serializable {
    private static final long serialVersionUID = 1234567L;

    int age;
    transient String  name;

    public Wgg_copy() {
    }

    public Wgg_copy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Wgg_copy)) {return false;}
        Wgg_copy wgg = (Wgg_copy) o;
        return getAge() == wgg.getAge() &&
                getName().equals(wgg.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public String toString() {
        return "Wgg{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
