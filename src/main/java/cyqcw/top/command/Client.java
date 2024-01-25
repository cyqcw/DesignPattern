package cyqcw.top.command;

/**
 * @author: hegu
 * @time: 2024/1/25 19:00
 * @version: 1.0
 * @description: 客户端
 */
public class Client {
    public static void main(String[] args){
        Waiter waiter=new Waiter(new OrderCommand(new Cooker()));
        waiter.orderFood();
    }
}
