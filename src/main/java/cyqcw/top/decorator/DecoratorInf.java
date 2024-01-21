package cyqcw.top.decorator;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: hegu
 * @time: 2024/1/21 15:46
 * @version: 1.0
 * @description: 抽象装饰器
 */
public abstract class DecoratorInf extends FastFood{
    @Getter
    @Setter
    private FastFood fastFood;
    public DecoratorInf(FastFood fastFood){
        this.fastFood=fastFood;
    }

    @Override
    public Integer getPrice() {
        return fastFood.getPrice();
    }

    @Override
    public String getDesc() {
        return fastFood.getDesc();
    }

    @Override
    public Integer getCost() {
        return fastFood.getCost();
    }
}
