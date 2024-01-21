package cyqcw.top.decorator;

import lombok.Data;

/**
 * @author: hegu
 * @time: 2024/1/21 15:26
 * @version: 1.0
 * @description: 抽象构件
 */
@Data
public abstract class FastFood {
    private Integer price;
    private String desc;
    public abstract Integer getCost();
}
