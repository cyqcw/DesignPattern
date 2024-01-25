package cyqcw.top.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/25 19:06
 * @version: 1.0
 * @description: 厨师命令的接受者
 */
@Slf4j
public class Cooker {
    public void makeFood(){
        log.info("厨师开始做饭");
    }
}
