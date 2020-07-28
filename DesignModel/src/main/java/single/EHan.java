package single;

/**
 * @program: keep_studying
 * @description:
 * @author: xxx
 * @create: 2020-05-11 15:29
 */
public class EHan {
    private static EHan eHan=new EHan();
    private EHan(){

    }
    public static EHan getInstance(){
        return  eHan;
    }
}
