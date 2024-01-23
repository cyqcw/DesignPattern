package cyqcw.top.strategy;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/23 21:52
 * @version: 1.0
 * @description: 环境类，连接上下文。把促销活动推销给客户
 */
@Slf4j
public class Salesman {
    @Setter
    private Strategy strategy;
    public Salesman(Strategy strategy){
        this.strategy=strategy;
    }
    public void saleShow(){
        log.info("销售人员选择");
        strategy.show();
    }
}
