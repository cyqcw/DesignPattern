package cyqcw.top.factory;

/**
 * @author: hegu
 * @time: 2024/1/16 10:31
 * @version: 1.0
 * @description: TODO
 */
public class MiFactory implements InfFactory{

    @Override
    public Coffee createCoffee() {
        return new MiCoffee();
    }
}
