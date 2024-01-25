package cyqcw.top.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/25 19:01
 * @version: 1.0
 * @description: 服务员是请求者，聚合命令对象让厨师进行操作
 */
@Slf4j
public class Waiter {
    private Command command;
    public Waiter(Command command){
        this.command=command;
    }
    public void orderFood(){
        log.info("服务员接单");
        command.exec();
    }
}
