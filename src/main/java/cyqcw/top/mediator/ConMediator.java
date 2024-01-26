package cyqcw.top.mediator;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hegu
 * @time: 2024/1/26 16:05
 * @version: 1.0
 * @description: 具体的中介者肯定持有房主和租客
 */
@Slf4j
public class ConMediator implements Mediator{
    @Setter
    private Person owner;
    @Setter
    private Person customer;

    //谁和中介去沟通
    @Override
    public void contact(String msg,Person person){
        log.info("中介者进行消息传递");
        if(person==owner){
            customer.getMsg(msg);
        }else{
            owner.getMsg(msg);
        }
    }
}
