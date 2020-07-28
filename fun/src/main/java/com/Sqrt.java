package com;

import java.util.Scanner;
/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-11 23:07
 */
public class Sqrt {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        System.out.print("sqrt("+n+")=");
        int strs[] =mySqrt(n);
        if (strs[0]!=0){
            System.out.print(strs[0]);
        }
        if (strs[1]!=0){
            System.out.println("sqrt("+strs[1]+")");;
        }

        //System.out.println("hello intellij");
    }

//开平方，数组第一个放平方根前面的系数，第二个放根号里面无法开方的数

    public static int[] mySqrt(int n)
    {
        int ints[]=new int[2];
        for(int i=(int)Math.sqrt(n);i>=2;i--)
        {
            if(n%(i*i)==0)
            {
                ints[0]=i;
                n=n/(i*i);
                break;
            }
        }
        if(n>1){
            ints[1]=n;
        }
        return ints;
    }
}
