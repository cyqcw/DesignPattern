package cyqcw.top.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/23 21:54
 * @version: 1.0
 * @description: 具体策略类1
 */
@Slf4j
public class PlanA implements Strategy{
    @Override
    public void show() {
        log.info("使用策略1");
    }
}
