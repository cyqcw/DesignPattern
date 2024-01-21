package cyqcw.top.adapter.clazz;

/**
 * @author: hegu
 * @time: 2024/1/20 10:36
 * @version: 1.0
 * @description: TODO
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "读取SD卡";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("写SD卡"+msg);
    }
}
