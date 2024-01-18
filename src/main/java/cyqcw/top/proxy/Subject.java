package cyqcw.top.proxy;

/**
 * @author: hegu
 * @time: 2024/1/18 16:07
 * @version: 1.0
 * @description: 抽象主题，用来声明具体主题和代理类实现的业务的方法
 * 提供一个代理用于给访问对象一个访问目标对象的代理
 * 定义规范，它的子类包括代理对象儿目标对象
 */
public interface Subject {
    void sell();//卖火车票的接口
}
