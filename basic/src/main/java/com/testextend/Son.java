package com.testextend;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-13 09:59
 */
public class Son extends Father {
    @Override
    public void f3(ArrayList arrayList){
        arrayList.remove("ee");
    }
    public static void main(String[] args) {
        Son son =new Son();
        son.f1();
        }
}
