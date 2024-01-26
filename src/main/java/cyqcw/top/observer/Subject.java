package cyqcw.top.observer;

/**
 * @author: hegu
 * @time: 2024/1/26 15:05
 * @version: 1.0
 * @description: 抽象主题的接口
 */
public interface Subject {
    void attach(Observer observer);
    void delete(Observer observer);
    void notice(String message);
}
