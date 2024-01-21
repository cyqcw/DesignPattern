package cyqcw.top.adapter.clazz;

/**
 * @author: hegu
 * @time: 2024/1/20 10:38
 * @version: 1.0
 * @description: TODO
 */
public class TFCardImpl implements TFCard{

    @Override
    public String readTF() {
        return "读TF卡";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("写TF卡"+msg);
    }
}
