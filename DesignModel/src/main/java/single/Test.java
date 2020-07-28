package single;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-11 15:24
 */
public class Test {
    public static void main(String[] args) {
        Lanhan lanhan1 =Lanhan.getInstance();
        Lanhan lanhan2 =Lanhan.getInstance();
        System.out.println(lanhan1==lanhan2);
    }
}
