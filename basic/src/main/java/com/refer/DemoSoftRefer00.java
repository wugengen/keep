package com.refer;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

/**
 * @program: keep_studying
 * @description: -Xms2M -Xmx3M,将 JVM 的初始内存设为2M，最大可用内存为 3M。
 * @author: xxx
 * @create: 2020-06-08 19:16
 */
public class DemoSoftRefer00 {
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
            SoftReference softReference =new SoftReference(buff);
            arrayList.add(softReference);
        }
         System.gc();
        for (Object aa: arrayList) {
            System.out.println(((SoftReference)aa).get());
        }
        /*值得注意的一点 , 即使有 byte[] buff 引用指向对象,
        且 buff 是一个strong reference, 但是 SoftReference sr 指向的对象仍然被回收了，
        这是因为Java的编译器发现了在之后的代码中, buff 已经没有被使用了, 所以自动进行了优化。
         buff数组定义在for循环外的话 会因为强引用的存在，而无法被垃圾回收，从而抛出OOM的错误。
        * */
        //System.out.println("buff"+buff);

    }

}
