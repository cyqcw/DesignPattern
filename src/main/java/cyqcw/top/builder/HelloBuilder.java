package cyqcw.top.builder;

/**
 * @author: hegu
 * @time: 2024/1/16 16:11
 * @version: 1.0
 * @description: TODO
 */
public class HelloBuilder implements Builder{
    private Bike bike=new Bike();

    @Override
    public void buildFrame() {
        bike.setFrame("哈啰单车的车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("哈啰单车的座椅");
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}
