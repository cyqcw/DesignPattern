package cyqcw.top.observer;

/**
 * @author: hegu
 * @time: 2024/1/26 15:07
 * @version: 1.0
 * @description: 抽象的订阅者
 */
public interface Observer {
    void update(String message);
}
