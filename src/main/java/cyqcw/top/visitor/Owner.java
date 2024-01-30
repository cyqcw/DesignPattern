package cyqcw.top.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/30 19:47
 * @version: 1.0
 * @description: 具体访问者：主人
 */
@Slf4j
public class Owner implements Visitor{

    @Override
    public void feed(Dog dog) {
        log.info("主人喂狗");
    }

    @Override
    public void feed(Cat cat) {
        log.info("主人喂猫");
    }
}
