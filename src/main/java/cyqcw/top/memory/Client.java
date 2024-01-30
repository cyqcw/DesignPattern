package cyqcw.top.memory;

/**
 * @author: hegu
 * @time: 2024/1/30 20:32
 * @version: 1.0
 * @description: 备忘录模式测试
 */
public class Client{
    public static void main(String[] args){
        //创建发起人
        Originator user=new Originator();
        user.initState();
        user.showState();
        //保存状态到管理者
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(user.saveState());
        //状态改变
        user.goDie();
        user.showState();
        //状态恢复
        user.recoverState(caretaker.getMemento());
        user.showState();
    }
}
