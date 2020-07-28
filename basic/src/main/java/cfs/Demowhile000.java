package cfs;

/**
 * @program: keep_studying
 * @description: cfs Control flow statement(控制流语句)
 *
 * @author: xxx
 * @create: 2020-07-28 11:18
 */
public class Demowhile000 {

    static  int return_while(){
        while (true){
            int a=0;
             for (int i = 1;i <= 9; i++){
                    a++;
              }
            return a;
        }
    }
    public static void main(String[] args) {
        System.out.println(return_while());
    }
}
