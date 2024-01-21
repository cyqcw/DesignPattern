package cyqcw.top.adapter.inf;

/**
 * @author: hegu
 * @time: 2024/1/20 11:18
 * @version: 1.0
 * @description: TODO
 */
public class Impl extends AbsAdapter {
    //这个方法是必须重写的，因为父类里面没没有给出具体的方法，
    @Override
    public void readMore() {
        System.out.println("子类只需实现特定的方法");
    }
}
