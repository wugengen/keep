package com.jdkproxy1;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-17 17:22
 */
public class ClassGenerateUtil {
    //生成Class文件保存磁盘
    public static void genClass(Class clazz ,String proxyname) throws Exception {
        //获取字节数组 class字节码文件
        byte[] proxyclassfile = ProxyGenerator.generateProxyClass(
                proxyname,new Class[]{clazz});
        String path = clazz.getResource(".").getPath();
        System.out.println("path--"+path+"-----proxyname--"+proxyname);
        FileOutputStream outputStream= null;
        outputStream = new FileOutputStream(path+proxyname+".class");
        outputStream.write(proxyclassfile);
        outputStream.flush();
        System.out.println("------------------------");


    }
}
