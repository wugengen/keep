package com.refer;



import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-06-08 23:37
 */
public class TestOOM {
    private static List<Object> list = new ArrayList<>();
    public static void main(String[] args) {
        testSoftReference();
    }
    private static void testSoftReference() {
        for (int i = 0; i < 10; i++) {
            byte[] buff = new byte[1024 * 1024];
            SoftReference<byte[]> sr = new SoftReference<>(buff);
            list.add(sr);
        }

        System.gc(); //主动通知垃圾回收
//        for (Object aa: list ) {
//            System.out.println(aa);
//        }
        /*
        * 我们发现无论循环创建多少个软引用对象，打印结果总是只有最后一个对象被保留，
        * 其他的obj全都被置空回收了。这里就说明了在内存不足的情况下，软引用将会被自动回收。
        *值得注意的一点 , 即使有 byte[] buff 引用指向对象,
        * 且 buff 是一个strong reference, 但是 SoftReference sr 指向的对象仍然被回收了，
       *这是因为Java的编译器发现了在之后的代码中, buff 已经没有被使用了, 所以自动进行了优化。
        * */
        for(int i=0; i < list.size(); i++){
            Object obj = ((SoftReference) list.get(i)).get();
            System.out.println(obj);
        }

    }

}