package com.reflection;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-14 18:11
 */
public class Person {
    public int age;
    public String name;
    protected String nn;
    String mm;
    private String address;

    public Person() {
    }

    public Person(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
