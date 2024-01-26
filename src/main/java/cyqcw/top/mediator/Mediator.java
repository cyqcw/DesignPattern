package cyqcw.top.mediator;

/**
 * @author: hegu
 * @time: 2024/1/26 16:02
 * @version: 1.0
 * @description: 抽象中介者
 */
public interface Mediator {
    //谁和中介去沟通
    void contact(String msg,Person person);
}
