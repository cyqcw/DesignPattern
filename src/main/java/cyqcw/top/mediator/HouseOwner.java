package cyqcw.top.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/26 16:04
 * @version: 1.0
 * @description: 具体的同事类，房主
 */
@Slf4j
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String msg){
        log.info("房主{} 和中介进行沟通：{}",name,msg);
        mediator.contact(msg,this);
    }
    @Override
    public void getMsg(String msg) {
        log.info("房主{} 从中介获得信息：{}",name,msg);
    }
}
