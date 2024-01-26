package cyqcw.top.mediator;

/**
 * @author: hegu
 * @time: 2024/1/26 15:49
 * @version: 1.0
 * @description: 中介者模式，客户端调用
 */
public class Client {
    public static void main(String[] args){
        //创建中介者，TODO 这里用的是具体类而不是实现类，没有松耦合
        ConMediator mediator=new ConMediator();
        //创建顾客和房主
        Person customer=new Customer("小明",mediator);
        Person owner=new HouseOwner("老刘",mediator);
        //建立关联
        mediator.setCustomer(customer);
        mediator.setOwner(owner);

        //顾客房主与中介者联系
        customer.contact("我要买房");
        owner.contact("我不卖房");
    }
}
