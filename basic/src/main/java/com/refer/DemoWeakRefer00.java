package com.refer;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-06-09 00:06
 */
public class DemoWeakRefer00 {
    @Override
    protected void finalize(){
        System.out.println("DemoSoftRefer00*********");
    }
    public static void main(String[] args) {
//        byte[] buff = new byte[1024 * 1024 * 3];
//        System.out.println(buff.length);
        //byte[] buff=null;
        ArrayList arrayList =new ArrayList();
        for (int i=0 ;i<10;i++){
            byte[]  buff =new byte[1024*1024];
            WeakReference weakReference=new WeakReference(buff);
            arrayList.add(weakReference);
        }
        System.gc();
        for (Object aa: arrayList) {
            System.out.println(((WeakReference)aa).get());
        }

        //System.out.println("buff"+buff);

    }

}
