package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @program: keep_studying
 * @description:  
 * @author: xxx
 * @create: 2020-07-11 15:26
 */
public class StreamDemo000 {
    public static void main(String[] args) {
        List arrayList=new ArrayList<>();
        arrayList.add("aa");
        arrayList.add("bb");
        arrayList.add("cc");
        arrayList.add("dd");
        arrayList.add("ee");
        Stream stream= arrayList.stream();
        stream.filter(aa->true).forEach(e-> System.out.print(e));
        stream.limit(2).forEach(System.out::print);
        stream.skip(2).forEach(System.out::print);
        System.out.println("------------------------------");
        System.out.println(Runtime.getRuntime().availableProcessors());
        Stream  parallelStream=arrayList.parallelStream();
        parallelStream.forEach(System.out::print);
    }
}
