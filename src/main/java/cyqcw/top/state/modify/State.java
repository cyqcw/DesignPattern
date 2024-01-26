package cyqcw.top.state.modify;

import lombok.Setter;

/**
 * @author: hegu
 * @time: 2024/1/26 10:50
 * @version: 1.0
 * @description: 抽象状态角色,封装环境对象的特定状态所对应的行为
 *               每个状态只有一个考虑设置为单例模式
 */
public abstract class State {
    //持有环境角色是为了方便在子类中的状态中进行状态的切换
    @Setter
    protected Context context;
    public abstract void open();
    public abstract void close();
}
