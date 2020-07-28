package com.serializble;

import java.io.*;
import java.util.Objects;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-09 22:06
 */
public class Wgg1 implements Externalizable {
    int age;
    transient String  name;

    public Wgg1() {
    }

    public Wgg1(int age, String name) {
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
        if (!(o instanceof Wgg1)) {return false;}
        Wgg1 wgg = (Wgg1) o;
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
         in.readObject();
    }
}
