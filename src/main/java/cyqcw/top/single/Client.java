package cyqcw.top.single;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;

/**
 * @author: hegu
 * @time: 2024/1/15 18:57
 * @version: 1.0
 * @description: TODO
 */
@Slf4j
public class Client {
    public static void main(String[] args) throws Exception{
        //普通饿汉
        SingleHungry singleHungry=SingleHungry.getInstance();
        //枚举饿汉
        SingleEnum singleEnum=SingleEnum.INSTANCE;
        //双重锁懒汉
        SingleLazy singleLazy=SingleLazy.getInstance();
        //静态内部类懒汉
        LazyInstance lazyInstance=LazyInstance.getInstance();

        /**
         * 破坏单例模式
         * 1，序列化和反序列化破坏单例模式，将获得的实例化类写到文件，
         *    然后读出来进行类的强转，得到的对象是不一样的
         *
         *    解决方法：在单例模式类里定义一个readResolve方法，
         *    用于在反序列化的时候给反射机制的，return instance:Object
         *    🐔：类是读出来的而不是new出来的
         */

        /**
         * 2，反射机制
         *    解决方法：实际上反射机制调用的还是构造函数，在构造函数中判断是否已经实例化
         *    已经有了说明这就是反射造成的
         *    🐔：构造函数只能用一次
         */
        //获得字节码，可以不加泛型
        Class<LazyInstance> clazz=LazyInstance.class;
        //反射获得无参私有的构造函数，可以不加泛型
        Constructor constructor=clazz.getDeclaredConstructor();
        //获得访问权限
        constructor.setAccessible(true);
        //反射获得对象
        LazyInstance instance=(LazyInstance) constructor.newInstance();

    }
}
