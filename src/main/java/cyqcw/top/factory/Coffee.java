package cyqcw.top.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/16 10:22
 * @version: 1.0
 * @description: TODO
 */
@Slf4j
public abstract class Coffee {
    public abstract String getName();
    public void addTea(){
        log.info("加饮料");
    }
}
