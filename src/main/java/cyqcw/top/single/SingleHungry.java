package cyqcw.top.single;

/**
 * @author: hegu
 * @time: 2024/1/15 18:52
 * @version: 1.0
 * @description: 饿汉式单例模式：一上来就实例化，可能会浪费内存
 */
public class SingleHungry {
    private static final SingleHungry singleHungry=new SingleHungry();
    private SingleHungry(){}

    public static SingleHungry getInstance(){
        return singleHungry;
    }
}
