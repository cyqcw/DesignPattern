package cyqcw.top.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/18 16:15
 * @version: 1.0
 * @description: 真实主题，就是目标对象,如具体的产品的公司，他需要一个代理
 */
@Slf4j
public class RealSubject implements Subject {
    @Override
    public void sell() {
        log.info("火车站买票");
    }
}
