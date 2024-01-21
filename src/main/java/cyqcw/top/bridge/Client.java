package cyqcw.top.bridge;

/**
 * @author: hegu
 * @time: 2024/1/21 17:10
 * @version: 1.0
 * @description: TODO
 */
public class Client {
    public static void main(String[] args){
        Phone phone=new Huawei(new QQ());
        phone.run();
    }
}
