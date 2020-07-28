package single;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-11 12:20
 */
public class Lanhan {
    private static Lanhan lanhan;
    private Lanhan(){

    }
    public static Lanhan getInstance(){
        if(lanhan ==null){
            lanhan = new Lanhan();
        }
        return lanhan;
    }

}
