package com.classloder;


import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-16 15:48
 */
public class MyNetUrlCLassLoad extends ClassLoader{
    private String path;

    public MyNetUrlCLassLoad(String path) {
        this.path = path;
    }
    //http://106.12.209.250:8080/Execl.class
    @Override
    protected Class findClass(String name){
        String pathclass=path+"/"+name.replace(".","/")+".class";
        //String pathclass=name;

        byte[] data=null;
        try {
            URL url =new URL(pathclass);
            InputStream in =  url.openStream();
            ByteArrayOutputStream baos  = new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            int len =-1;
            while ((len=in.read(buf))!=-1){
                baos.write(buf,0,len);
            }
            //baos.flush();
            data=baos.toByteArray();
            in.close();
            baos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defineClass(pathclass,data,0,data.length);
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //MyNetUrlCLassLoad myCLassLoad0 =new MyNetUrlCLassLoad("http://106.12.209.250:8080/examples");
        MyNetUrlCLassLoad myCLassLoad0 =new MyNetUrlCLassLoad("http://localhost:8080/examples");
         Class cla0= myCLassLoad0.loadClass("com.proxy.Execl");
         System.out.println("cla0-------"+cla0.getClassLoader());
        }
}
