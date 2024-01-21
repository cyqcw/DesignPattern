package cyqcw.top.decorator;

/**
 * @author: hegu
 * @time: 2024/1/21 15:31
 * @version: 1.0
 * @description: TODO
 */
public class Rice extends FastFood{
    public Rice(){
        super.setDesc("这是米饭");
    }
    @Override
    public Integer getCost() {
        return super.getPrice()+1;
    }
}
