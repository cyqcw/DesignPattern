package cyqcw.top.state.modify;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/26 10:51
 * @version: 1.0
 * @description: 具体状态类，门的开启状态
 */
@Slf4j
public class OpeningState extends State{
    /**
     * 感觉每个实例类全剧终只需要有一个就好了，所以设置为单例类
     */
    private OpeningState(){}
    private static class SingletonHandler{
        public static final OpeningState OPENING_STATE=new OpeningState();
    }
    public static OpeningState getInstance(){
        return SingletonHandler.OPENING_STATE;
    }

    /**
     * 重写实现具体的方法
     */
    @Override
    public void open() {
        log.info("门开启时不需要再打开");
    }

    @Override
    public void close() {
        log.info("门开启时可以关闭");
        //通过环境角色来切换，或者说切换环境角色的状态
        context.setState(Context.CLOSING_STATE);
    }
}
