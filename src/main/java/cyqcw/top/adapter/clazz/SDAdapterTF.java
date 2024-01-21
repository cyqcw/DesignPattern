package cyqcw.top.adapter.clazz;

/**
 * @author: hegu
 * @time: 2024/1/20 10:40
 * @version: 1.0
 * @description: 适配器类，这里其实不用继承，用聚合，可以江都系统的俄耦合
 */
public class SDAdapterTF implements SDCard{
    TFCard tfCard;
    public SDAdapterTF(TFCard tfCard){
        this.tfCard=tfCard;
    }
    @Override
    public String readSD() {
        System.out.println("通过适配器读取SD->TF");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("通过适配器写SD->TF");
        tfCard.writeTF(msg);
    }
}
