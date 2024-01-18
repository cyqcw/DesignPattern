package cyqcw.top.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/16 10:58
 * @version: 1.0
 * @description: 使用配置文件+简单工厂进行设计
 */
@Slf4j
public class Client {
    public static void main(String[] args){
        Coffee coffee=SimpleFactory.getCoffee(1);
        Coffee coffee1=SimpleFactory.getCoffee(2);
        log.info("{} {}",coffee.getName(),coffee1.getName());
    }
}
