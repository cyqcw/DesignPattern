package cyqcw.top.visitor;

/**
 * @author: hegu
 * @time: 2024/1/30 19:42
 * @version: 1.0
 * @description: 抽象元素角色:动物
 */
public interface Element{
    //宠物接受喂食，接受访问者访问
    void accept(Visitor visitor);
}
