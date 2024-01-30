package cyqcw.top.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/30 19:44
 * @version: 1.0
 * @description: 具体元素类
 */
@Slf4j
public class Dog implements Element{
    @Override
    public void accept(Visitor visitor){
        //传过来访问者是为了调用访问者的一个方法
        visitor.feed(this);
        log.info("狗接受喂食");
    }
}
