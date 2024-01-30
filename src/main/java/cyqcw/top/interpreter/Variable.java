package cyqcw.top.interpreter;

/**
 * @author: hegu
 * @time: 2024/1/30 21:33
 * @version: 1.0
 * @description: 非终结符表达式,封装变量的类
 */
public class Variable implements Expression{
    //变量的名字
    private String name;
    public Variable(String name){
        this.name=name;
    }
    @Override
    public Integer interpret(Context context) {
        return context.getValue(this);
    }
}
