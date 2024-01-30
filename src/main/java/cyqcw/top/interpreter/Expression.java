package cyqcw.top.interpreter;

/**
 * @author: hegu
 * @time: 2024/1/30 21:30
 * @version: 1.0
 * @description: 抽象表达式角色,实现解说的方法
 */
public interface Expression {
    Integer interpret(Context context);
}
