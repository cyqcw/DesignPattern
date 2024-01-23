package cyqcw.top.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/23 21:16
 * @version: 1.0
 * @description: 烹饪苹果的类
 */
@Slf4j
public class AppleMethod extends AbsMethod{
    @Override
    public void pourVegetable() {
        log.info("放苹果");
    }
}
