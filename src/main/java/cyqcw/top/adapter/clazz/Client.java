package cyqcw.top.adapter.clazz;

/**
 * @author: hegu
 * @time: 2024/1/20 10:42
 * @version: 1.0
 * @description: TODO
 */
public class Client {
    public static void main(String[] args){
        //电脑直接读取SD卡的数据
        Computer computer=new Computer();
        System.out.println(computer.readSD(new SDCardImpl()));

        //通过适配器读取TF卡的数据
        SDAdapterTF adapter=new SDAdapterTF(new TFCardImpl());
        System.out.println(adapter.readSD());
    }
}
