package com.refer;

/**
 * @program: keep_studying
 * @description: 参数类型为引用类型的话，只是拷贝了一份对象引用
 * @author: xxx
 * @create: 2020-07-19 16:29
 */
public class Refer_Object00 {
    private int i,j;

    @Override
    public String toString() {
        return "Refer_Object00{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    private  void  test1(Refer_Object00 refer){
        Refer_Object00 refer_object001=new Refer_Object00();
        refer_object001.i=1;
        refer_object001.j=2;
        refer=refer_object001;
    }
    private void test2(Refer_Object00 refer00){
        refer00.i=11;
        refer00.j=22;
    }
    public static void main(String[] args) {
     Refer_Object00 refer_object00 = new Refer_Object00();
     refer_object00.i=111;
     refer_object00.j=222;
     System.out.println(refer_object00.toString());
     refer_object00.test1(refer_object00);
     System.out.println(refer_object00.toString());
     refer_object00.test2(refer_object00);
     System.out.println(refer_object00.toString());

    }
}
