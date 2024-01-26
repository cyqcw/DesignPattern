package cyqcw.top.observer;

/**
 * @author: hegu
 * @time: 2024/1/26 15:25
 * @version: 1.0
 * @description: 客户端
 */
public class Client {
    public static void main(String[] args){
        Subject subject=new WechatSubject();
        subject.attach(new WechatUser("小明"));
        subject.attach(new WechatUser("小红"));
        subject.attach(new WechatUser("小王"));
        subject.notice("公众号更新了");
    }
}
