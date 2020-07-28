package java8;

import org.junit.Test;

import java.util.HashMap;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-09 21:30
 */
public class HashMapJdk8 {
     //final static int aa;
     static int bb;
    public HashMapJdk8() {
        bb++;
    }

@Test
public void test(){
        System.out.println(this.bb);
        HashMapJdk8 hashMapJdk8=new HashMapJdk8();
        System.out.println(this.bb);
        System.out.println(hashMapJdk8.bb);
}
    public static void main(String[] args) {
        //System.out.println(aa);
        HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
        hashMap.put("a",Integer.valueOf('a'));
        hashMap.put("A",Integer.valueOf('A'));
        hashMap.put("0",Integer.valueOf('0'));
        hashMap.put(null,Integer.valueOf('z'));
        int a=hashMap.put(null,null);
        System.out.println(a);
        System.out.println(hashMap);
    }
}
