package cyqcw.top.observer;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/26 15:22
 * @version: 1.0
 * @description: 具体的观察者
 */
@Slf4j
public class WechatUser implements Observer{
    @Setter
    private String name;
    public WechatUser(String name){
        this.name=name;
    }
    @Override
    public void update(String message) {
        log.info("{}收到了信息：{}",name,message);
    }
}
