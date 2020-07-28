package com.string;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-04-24 10:10
 */
public class StringDemo001 {
    public static void main(String[] args) {
            /**
             * @ Author     :wgg
             * @ Description:String类是不可变量，被final修饰，
             * 字符串a被重新赋值是在内存中重新新建了一个”bbbb“
             * @ Date       :${Date}
            */
            String a="aaaa";
            a="bbbb";
            /*
            * 重写类的hashcode与equals方法后，倘若该
            *
            * */
            Person person1=new Person("wgg",15);
            Person person2=new Person("wgg",15);
            System.out.println(person1==person2);
            System.out.println(person1.equals(person2));
            System.out.println(person1.hashCode());
            System.out.println(person2.hashCode());

            Me me1=new Me();
            Me me2=new Me();
            System.out.println(me1==me2);
            System.out.println(me1.equals(me2));
            System.out.println(me1.hashCode());
            System.out.println(me2.hashCode());
        }
}
