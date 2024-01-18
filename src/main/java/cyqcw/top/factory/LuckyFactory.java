package cyqcw.top.factory;

/**
 * @author: hegu
 * @time: 2024/1/16 10:30
 * @version: 1.0
 * @description: TODO
 */
public class LuckyFactory implements InfFactory{

    @Override
    public Coffee createCoffee() {
        return new LuckyCoffee();
    }
}
