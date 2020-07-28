package com;

import java.io.File;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-07-25 17:25
 */
public class FileDemo00 {

    public static void find(File f) {
        File[] list = f.listFiles();
        for (File file : list) {
            if (file.isDirectory()) {
                if (file.getParent().toString().endsWith("\\"))
                {System.out.println("目录　" + file.getParent() + file.getName());}
                else {
                    System.out.println("目录　" + file.getParent() + "\\"
                            + file.getName());
                }
                find(file);
            } else {
                if (file.getParent().toString().endsWith("\\"))
                {System.out.println("文件　" + file.getParent() + file.getName());}
                else {
                    System.out.println("文件　" + file.getParent() + "\\" + file.getName());
                }
            }
        }
    }
    public static void main(String[] args) {
        File f = new File("C:\\Users\\14454\\AppData\\Local\\Temp");
        find(f);
    }

}

