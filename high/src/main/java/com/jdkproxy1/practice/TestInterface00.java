package com.jdkproxy1.practice;



/**
 * @program: keep_studying
 * @description:直接用接口去执行反射功能
 * @author: xxx
 * @create: 2020-07-26 15:04
 */
public class TestInterface00 {
    public static void main(String[] args) throws Exception {
       Class clazz= InterDemo000.class;
        InterDemo000 o = (InterDemo000) clazz.newInstance();
        System.out.println(o.demo(4, 5));

//        Class<Demo000> demo000Class = Demo000.class;
//        //Demo000 demo000 = demo000Class.newInstance();
//        Demo000 demo000 = demo000Class.getDeclaredConstructor().newInstance();
//        System.out.println(demo000.demo(5, 6));

    }
}
