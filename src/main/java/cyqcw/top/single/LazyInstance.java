package cyqcw.top.single;

/**
 * @author: hegu
 * @time: 2024/1/15 19:31
 * @version: 1.0
 * @description:
 * 静态内部类的方法实现单例模式，
 * 静态内部类只有在本身第一次加载的时候才会初始化
 * static保证了不会产生循环依赖的问题
 * 没有任何性能影响和空间的浪费
 */
public class LazyInstance {
    private LazyInstance(){}
    private static class SingletonHolder{
        private static final LazyInstance INSTANCE=new LazyInstance();
    }

    public static LazyInstance getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
