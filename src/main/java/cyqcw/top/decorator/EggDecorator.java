package cyqcw.top.decorator;

/**
 * @author: hegu
 * @time: 2024/1/21 15:56
 * @version: 1.0
 * @description: TODO
 */
public class EggDecorator extends DecoratorInf{
    public EggDecorator(FastFood fastFood) {
        super(fastFood);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"加蛋";
    }
}
