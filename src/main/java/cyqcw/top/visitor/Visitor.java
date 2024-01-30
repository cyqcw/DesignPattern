package cyqcw.top.visitor;

/**
 * @author: hegu
 * @time: 2024/1/30 19:44
 * @version: 1.0
 * @description: 抽象访问者角色
 */
public interface Visitor{
    void feed(Dog dog);
    void feed(Cat cat);
}
