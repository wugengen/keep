package com.serializble;

import java.io.*;
import java.security.PublicKey;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-09 22:10
 */
public class Test {
    public static void xlh(){
        Wgg wgg1=new Wgg(26,"wugengen");
        try {
            File file=new File("Ser.txt");
            System.out.println(file.getAbsolutePath());
            //FileOutputStream fileOutputStream =new FileOutputStream(file);
            FileOutputStream fileOutputStream =new FileOutputStream(file);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
             objectOutputStream.writeObject(wgg1);
//            OutputStreamWriter outputStreamWriter= new OutputStreamWriter(fileOutputStream,"utf-8");
//            outputStreamWriter.write(wgg1.toString());
            objectOutputStream.close();
//            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void fxxlh(){
        Wgg_copy wgg2=null;
        try {
            FileInputStream fileInputStream=new FileInputStream("Ser.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            wgg2= (Wgg_copy) objectInputStream.readObject();
//            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
//            wgg2=inputStreamReader.re;

            fileInputStream.close();
            objectInputStream.close();
            System.out.println(wgg2.age+wgg2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //测试序列化与反序列化
    public static void main(String[] args) {
        //xlh();
        fxxlh();

    }
    @org.junit.Test
    public void test_static_ser(){
        Wgg2 wgg2=new Wgg2(15,"wee","china");
        Wgg2.address="cn";
        System.out.println(wgg2);
        File file =new File("static_ser.txt");
        try {
            FileOutputStream fileOutputStream =new FileOutputStream(file);
            ObjectOutputStream objectInputStream=new ObjectOutputStream(fileOutputStream);
            objectInputStream.writeObject(wgg2);
            objectInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /*
    * 类的静态变量不参与序列化
    * */
    @org.junit.Test
    public void test_static_deser() throws Exception {
        Wgg2 wgg2 =new Wgg2(25,"wgg","sz");
        FileInputStream fileInputStream =new FileInputStream("static_ser.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
         wgg2= (Wgg2) objectInputStream.readObject();
        System.out.println(wgg2.toString());
        objectInputStream.close();
        fileInputStream.close();
    }
}
