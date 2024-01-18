package cyqcw.top.single;

/**
 * 懒汉式：使用时才实例化
 * 双重锁
 */
public class SingleLazy {
    //加这一个为了保证多线程间的可见性二和有序性，避免指令重排问题
    //JVM在实例化对象的时候会进行优化和指令重排序
    private static volatile SingleLazy singleLazy;
    private SingleLazy(){}
    public static SingleLazy getInstance(){
        if(null==singleLazy){
            synchronized (SingleLazy.class){
                if(null==singleLazy)
                    singleLazy=new SingleLazy();
            }
        }
        return singleLazy;
    }
}
