package com.testextend;

import java.util.ArrayList;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-13 09:55
 */
public class Father {
    public void f1(){
        ArrayList arrayList =new ArrayList();
        f2(arrayList);
        f3(arrayList);
    }
    public void f2(ArrayList arrayList){
        arrayList.add("ee");
    }
    public void f3(ArrayList arrayList){
        arrayList.remove("ee");
    }

}
