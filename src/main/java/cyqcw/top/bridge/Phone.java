package cyqcw.top.bridge;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: hegu
 * @time: 2024/1/21 17:04
 * @version: 1.0
 * @description: TODO
 */
public abstract class Phone {
    //这里定义成保护而不是私有更加合理
    protected SoftWare softWare;
    public Phone(SoftWare softWare){
        this.softWare=softWare;
    }
    public abstract void run();
}
