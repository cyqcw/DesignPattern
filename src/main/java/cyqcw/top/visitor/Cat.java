package cyqcw.top.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/30 19:46
 * @version: 1.0
 * @description: 具体元素类
 */
@Slf4j
public class Cat implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.feed(this);
        log.info("猫接受喂食");
    }
}
