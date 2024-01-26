package cyqcw.top.state.modify;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/26 11:24
 * @version: 1.0
 * @description: 具体状态类，门的关闭状态
 */
@Slf4j
public class ClosingState extends State{
    /**
     * 感觉每个实例类全剧终只需要有一个就好了，所以设置为单例类
     */
    private ClosingState(){}
    private static class SingletonHandler{
        public static final ClosingState CLOSING_STATE=new ClosingState();
    }
    public static ClosingState getInstance(){
        return SingletonHandler.CLOSING_STATE;
    }

    /**
     * 重写实现具体的方法
     */
    @Override
    public void open() {
        log.info("门关闭时可以开启");
        //抽象状态类里面持有环境类是为了可以在具体状态类里面更改环境类的状态
        context.setState(Context.OPENING_STATE);

    }

    @Override
    public void close() {
        log.info("门关闭时不用关闭");
    }
}
