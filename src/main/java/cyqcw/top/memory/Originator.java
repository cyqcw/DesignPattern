package cyqcw.top.memory;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/30 20:33
 * @version: 1.0
 * @description: 发起人角色
 */
@Slf4j
public class Originator{
    //攻击力和防御力
    private Integer attack;
    private Integer defense;
    //初始化状态
    public void initState(){
        this.attack=100;
        this.defense=100;
    }
    //保存状态到备忘录
    public Memento saveState(){
        return new InnerMemento(attack, defense);
    }
    //从备忘录恢复状态
    public void recoverState(Memento memento){
        this.attack=((InnerMemento)memento).getAttack();
        this.defense=((InnerMemento)memento).getDefense();
    }

    /**
     * 备忘录作为内部成员类
     */
    private static class InnerMemento implements Memento{
        //攻击力和防御力，备忘录的属性于发起人保持一致
        @Setter
        @Getter
        private Integer attack;
        @Setter
        @Getter
        private Integer defense;
        public InnerMemento(Integer attack,Integer defense){
            this.attack=attack;
            this.defense=defense;
        }
    }

    //辅助函数
    public void showState(){
        log.info("{} {}",attack,defense);
    }
    public void goDie(){
        attack=0;
        defense=0;
    }
}
