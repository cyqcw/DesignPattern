package cyqcw.top.combination;

import lombok.Data;

/**
 * @author: hegu
 * @time: 2024/1/22 20:26
 * @version: 1.0
 * @description: TODO
 */
@Data
public abstract class Component {
    protected String name;
    protected Integer level;
    //只有目录重写了这个方法，文件会抛出异常
    public Component add(Component component){
        throw new UnsupportedOperationException();
    }
    //目录和文件都有这个功能给所以都需要重写
    abstract void show();
}
