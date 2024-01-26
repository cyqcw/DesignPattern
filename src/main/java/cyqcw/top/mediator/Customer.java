package cyqcw.top.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/26 16:11
 * @version: 1.0
 * @description: 具体的同事类-顾客类
 */
@Slf4j
public class Customer extends Person{
    public Customer(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String msg) {
        log.info("顾客{} 和中介进行沟通：{}",name,msg);
        mediator.contact(msg,this);
    }

    @Override
    public void getMsg(String msg) {
        log.info("顾客{} 从中介获得信息：{}",name,msg);
    }
}
