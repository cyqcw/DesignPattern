package cyqcw.top.adapter.inf;

/**
 * @author: hegu
 * @time: 2024/1/20 11:20
 * @version: 1.0
 * @description: TODO
 */
public class Client {
    public static void main(String[] args){
        AbsAdapter abs=new Impl();
        abs.readMore();
    }
}
