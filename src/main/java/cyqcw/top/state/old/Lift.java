package cyqcw.top.state.old;

import cyqcw.top.state.old.ILift;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/25 21:05
 * @version: 1.0
 * @description: 定义电梯类
 */
@Slf4j
public class Lift implements ILift {
    private Integer liftState=STOPPING;
    @Override
    public void run() {
        if(liftState==STOPPING){
            log.info("电梯运行");
            liftState=RUNNING;
        }
    }

    @Override
    public void stop() {
        if(liftState==RUNNING){
            log.info("电梯停止");
            liftState=STOPPING;
        }
    }
}
