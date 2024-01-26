package cyqcw.top.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hegu
 * @time: 2024/1/26 15:09
 * @version: 1.0
 * @description: 具体的主题类
 */
public class WechatSubject implements Subject{
    /**
     * 订阅者对象的集合
     */
    private final List<Observer> userList=new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notice(String message) {
        userList.forEach(user->user.update(message));
    }
}
