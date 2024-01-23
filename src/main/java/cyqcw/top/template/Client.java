package cyqcw.top.template;

/**
 * @author: hegu
 * @time: 2024/1/23 21:18
 * @version: 1.0
 * @description: 测试
 */
public class Client {
    public static void main(String[] args){
        AbsMethod method=new EggMethod();
        method.cookProcess();
        method=new AppleMethod();
        method.cookProcess();
    }
}
