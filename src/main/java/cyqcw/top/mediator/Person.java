package cyqcw.top.mediator;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @author: hegu
 * @time: 2024/1/26 16:01
 * @version: 1.0
 * @description: 抽象的同事类
 */
@AllArgsConstructor
@Setter
public abstract class Person{
    protected String name;
    protected Mediator mediator;//每个人持有一个相关联的中介者对象
    //和中介沟通的方法
    public abstract void contact(String msg);
    public abstract void getMsg(String msg);
}
