package com.classloder;

import com.reflection.Person;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-16 10:33
 */
public class Demo00 {
    public static void main(String[] args) throws Exception {
        String a=new String("wgg");
        Person per01 =new Person();
        System.out.println(per01.getClass().getClassLoader());
        System.out.println(per01.getClass().getClassLoader().getParent());
        System.out.println(per01.getClass().getClassLoader().getParent().getParent());

        System.out.println("URLClassLoader.getSystemClassLoader()--"+URLClassLoader.getSystemClassLoader());
         File file = new File("C:/");
        URL url =file.toURL();
        URLClassLoader classLoader= new URLClassLoader(new URL[]{url});
        Class cla1=classLoader.loadClass("com.reflection.Person");
        System.out.println("cla1----"+cla1);

        System.out.println("Class.class.getClassLoader()=="+Class.class.getClassLoader());
        Class cla2=Class.forName("com.reflection.Person");
        System.out.println("cla2----"+cla2);
        System.out.println(cla1==cla2);

        }
}
