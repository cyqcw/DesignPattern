package cyqcw.top.state.old;

/**
 * @author: hegu
 * @time: 2024/1/25 21:02
 * @version: 1.0
 * @description: 用于定义电梯状态和运行方法的接口
 */
public interface ILift {
    Integer RUNNING=0;//默认是public static final
    Integer STOPPING=1;
    void run();
    void stop();
}
