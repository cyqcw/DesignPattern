package cyqcw.top.interpreter;

import lombok.AllArgsConstructor;

/**
 * @author: hegu
 * @time: 2024/1/30 21:34
 * @version: 1.0
 * @description: 加法表达式类
 */
@AllArgsConstructor
public class Plus implements Expression{
    private Expression left;
    private Expression right;

    @Override
    public Integer interpret(Context context) {
        //计算左右量表的和
        return left.interpret(context)+ right.interpret(context);
    }
}
