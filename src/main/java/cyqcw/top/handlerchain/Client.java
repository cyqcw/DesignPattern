package cyqcw.top.handlerchain;

/**
 * @author: hegu
 * @time: 2024/1/25 19:54
 * @version: 1.0
 * @description: 客户类
 */
public class Client {
    public static void main(String[] args){
        Handler handler1=new ConHandler("校长",10,null);
        Handler handler2=new ConHandler("班主任",5,handler1);
        Handler handler3=new ConHandler("班长",2,handler2);
        handler3.assign(new LeaveRequest("小明",5,"回家睡觉"));
    }
}
