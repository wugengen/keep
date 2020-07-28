package com.lock;

import org.openjdk.jol.info.ClassLayout;

/**
 * @program: MavenDemo000
 * @description:查看对象的布局
 * 是否开启指针压缩 -XX:-UseCompressedOops
 * @author: xxx
 * @create: 2020-04-27 11:06
 */
public class Person {
    int i;
    public static void main(String[] args) {
         Person p =new Person();
        System.out.println(p.hashCode());
        System.out.println(Integer.toHexString(p.hashCode()));
        System.out.println(ClassLayout.parseInstance(p).toPrintable());

    }
}
