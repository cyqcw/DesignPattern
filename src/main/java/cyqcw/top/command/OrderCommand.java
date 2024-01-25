package cyqcw.top.command;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/25 19:02
 * @version: 1.0
 * @description: 具体命令对象
 */
@Slf4j
public class OrderCommand implements Command{
    @Setter
    private Cooker cooker;
    public OrderCommand(Cooker cooker){
        this.cooker=cooker;
    }
    @Override
    public void exec() {
        log.info("发给厨师命令");
        cooker.makeFood();
    }
}
