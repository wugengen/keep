package java8.optional;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-07-11 18:16
 */
public class Demo001 {

    public static String get(Boy boy){
        return  boy.getName();
    }

    public static void main(String[] args) {
         Boy boy =new Boy();
         String name =get(boy);
         System.out.println(name);
        }
}
