package cyqcw.top.state.modify;

/**
 * @author: hegu
 * @time: 2024/1/26 10:52
 * @version: 1.0
 * @description: 上下文环境角色，用于定义客户程序所需要的接口
 *               维护一个当前的状态
 *               并将状态相关的操作委托当前的状态对象处理
 *               环境对象持有的对象就是当前状态
 */

public class Context{
    /**
     * 所有状态的常量
     */
    public static final OpeningState OPENING_STATE=OpeningState.getInstance();
    public static final ClosingState CLOSING_STATE=ClosingState.getInstance();
    /**
     * 记录当前状态的方法
     */

    private State state;

    /**
     * 设置当前状态对象并当状态对象的环境对象设置出来
     */
    public Context setState(State state){
        this.state=state;
        this.state.setContext(this);
        return this;
    }

    /**
     * 把状态相关的操作委托给当前的状态对象进行处理
     */
    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }
}
