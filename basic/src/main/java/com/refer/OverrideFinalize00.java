package com.refer;

import java.lang.ref.SoftReference;

/**
 * @program: keep_studying
 * @description: 重写finalize方法
 * @author: xxx
 * @create: 2020-06-08 22:05
 */
public class OverrideFinalize00 {

    @Override
    protected void finalize(){
        System.out.println("*********");
    }

    public static void main(String[] args) {

         OverrideFinalize00 oo=new OverrideFinalize00();
         oo=null;
         SoftReference softReference=new SoftReference(oo);
         System.gc();
         System.out.println(softReference);
         System.out.println(softReference.get());
        }
}
