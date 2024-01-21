package cyqcw.top.adapter.clazz;

/**
 * @author: hegu
 * @time: 2024/1/20 10:31
 * @version: 1.0
 * @description: TODO
 */

public class Computer {
    public String readSD(SDCard card){
        System.out.println("电脑读取SD卡的内容");
        return card.readSD();
    }
}
