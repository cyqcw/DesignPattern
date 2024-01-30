package cyqcw.top.interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/30 21:48
 * @version: 1.0
 * @description: 解释器模式测试类
 */
@Slf4j
public class Client {
    public static void main(String[] args){
        //创建一个环境对象
        Context context=new Context();
        //创建变量对象
        Variable a=new Variable("a");
        Variable b=new Variable("b");
        Variable c=new Variable("c");
        //存储到环境对象中
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        //创建抽象语法树
        Expression expression=new Plus(new Plus(a,a),new Plus(b,c));
        log.info("{}",expression.interpret(context));
    }
}
