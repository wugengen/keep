package com.stream;


import com.string.Me;

import java.util.Arrays;
import java.util.List;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-02 21:54
 */
public class StreamDemo00 {
    public static void main(String[] args) {
        Me me =new Me();
        List list = Arrays.asList("ss", "dd", "qq","ss");
        for (Object ss : list) {
            System.out.println(ss);
        }
        System.out.println(list.stream().filter(w -> w.equals("ss")).count());
        list.stream().forEach(t->{System.out.println(t);});
    }

}
