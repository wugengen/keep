package com.classloder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-16 19:31
 */
public class MylocalClassLoad extends ClassLoader {
    private String path;

    public MylocalClassLoad(String path) {
        this.path = path;
    }

    @Override
    protected Class findClass(String name) {
        Class cla = null;

        try {
            byte[] classbyte = getData(name);
            if (classbyte != null) {
                cla = defineClass(name, classbyte, 0, classbyte.length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            return cla;
    }

    private byte[] getData(String name) throws Exception {

        File file = new File(path);
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (file.exists()) {
            byte[] buf = new byte[1024];
            fileInputStream = new FileInputStream(file);
            byteArrayOutputStream = new ByteArrayOutputStream();
            int size = 0;
            while ((size = fileInputStream.read()) != -1) {
                byteArrayOutputStream.write(buf, 0, size);
            }
            fileInputStream.close();
            // byteArrayOutputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void main(String[] args) throws Exception {
        MylocalClassLoad mylocalClassLoad = new MylocalClassLoad("D:\\Users\\14454\\Desktop\\com\\classloader\\Cla.class");
        Class cla = mylocalClassLoad.loadClass("com.classloader.Cla");
        Object obj = cla.newInstance();
        System.out.println("obj--------" + obj);
    }
}
