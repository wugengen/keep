package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: keep_studying
 * @description: 一边遍历List，一边删除List里面的元素,
 * 方式一使用foreach会出现ConcurrentModificationException异常,第一次删除是成功的，
 * 但是再次遍历不行，底层的modcount与exceptcount值不等
 * 方式二使用for循环，不会，但是如果是正序遍历会出现不准确问题，
 * for循环正序便利如果删除了index为i的元素，i之后的元素的index都会发生变化，
 * 原本index为i+1的元素，变成了i，再次循环时就不会在遍历index为i的元素了，
 * 因为删除之前就遍历了i，此时会直接从i+1开始遍历，就忽略了删除之后index为i的元素
 * 删除成功之后可以做一次i--操作，
 * 直接使用倒叙遍历.删除之后不会影响未比较的元素的index值了
 *
 * 方式三，其实就是方式一，方式一通过jad反编译就是方式三
 * 方式四，也是使用了iterator，不过删除的使用的是iterator本身的remove方法，可以正常删除
 *
 * 方式五，可以遍历判断过滤放入一个新放入list当中
 * @author: xxx
 * @create: 2020-07-09 22:44
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        List<String> arrayList =new ArrayList();
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("ccc");
        arrayList.add("bbb");
        arrayList.add("aaa");
        arrayList.add("aaa");
        System.out.println(arrayList);
        //arrayList.add("aaa");
        //方式一
//        try {
//            for (String arr :arrayList){
//                if (arr.equals("aaa")){
//                    arrayList.remove(arr);
//                }
//            }
//        }catch (Exception e){
//            throw e;
//        }finally {
//            System.out.println(arrayList);
//        }
           /*
           *方式二
           * */
//         for (int i = 0;i < arrayList.size(); i++){
//                if (arrayList.get(i).equals("aaa")){
//                    arrayList.remove(i);
//                    --i;
//                }
//          }
          //方式二点一
//          for (int i = arrayList.size()-1;i >=0; i--){
//                   if (arrayList.get(i).equals("aaa")){
//                       arrayList.remove(i);
//                   }
//           }



         //方式三
//        Iterator iterator = arrayList.iterator();
//        do
//        {
//            if(!iterator.hasNext()){
//                break;
//            }
//            String arr = (String)iterator.next();
//            if(arr.equals("aaa")) {
//                arrayList.remove(arr);
//            }
//        } while(true);
        //方式四
//      Iterator iterator= arrayList.iterator();
//      while (iterator.hasNext()){
//         Object string= iterator.next();
//         if (string.equals("aaa")){
//             iterator.remove();
//         }
//      }


//        Stream stream= arrayList.stream();
//        //stream.forEach(System.out::print);
//        Stream stream1=stream.filter(aa->!aa.equals("aaa"));
//        List newlist= (List) stream1.collect(Collectors.toList());
//        System.out.println(newlist);
//        //stream1.forEach(System.out::print);
//        Stream  parallelStream=arrayList.parallelStream();


        System.out.println(arrayList);
    }
}
