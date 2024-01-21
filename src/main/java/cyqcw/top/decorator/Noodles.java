package cyqcw.top.decorator;

/**
 * @author: hegu
 * @time: 2024/1/21 15:31
 * @version: 1.0
 * @description: TODO
 */
public class Noodles extends FastFood{
    public Noodles(){
        super.setDesc("这是面条");
    }

    @Override
    public Integer getCost() {
        return super.getPrice();
    }
}
