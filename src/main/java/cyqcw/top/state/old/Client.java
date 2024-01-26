package cyqcw.top.state.old;

/**
 * @author: hegu
 * @time: 2024/1/25 21:12
 * @version: 1.0
 * @description: 客户端
 */
public class Client {
    public static void main(String[] args){
        ILift lift=new Lift();
        lift.run();
        lift.stop();
    }
}
