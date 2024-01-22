package cyqcw.top.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: hegu
 * @time: 2024/1/22 21:44
 * @version: 1.0
 * @description: 把工厂设置成单例模式
 */
public class BoxFactory {
    /**
     * 享元工厂
     */
    private Map<String,AbstractBox> map;
    public AbstractBox getBox(String shape){
        if(!map.containsKey(shape)){
            map.put(shape,new LShape());
        }return map.get(shape);
    }
    /**
     * 制造出工厂的单例，防止重复享元，使用静态内部类实现单例模式
     */
    private BoxFactory(){
        map=new HashMap<>();
        map.put("L",new LShape());
        map.put("O",new OShape());
    }
    private static class SingleFactory{
        public static final BoxFactory INSTANCE=new BoxFactory();
    }
    public static BoxFactory getInstance(){
        return SingleFactory.INSTANCE;
    }
}
