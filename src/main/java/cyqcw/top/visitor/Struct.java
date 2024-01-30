package cyqcw.top.visitor;

import cyqcw.top.mediator.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hegu
 * @time: 2024/1/30 19:49
 * @version: 1.0
 * @description: 结构对象角色，home
 */
public class Struct {
    private List<Element> animals=new ArrayList<>();
    //喂食，里面的元素接受访问者访问
    public void action(Visitor visitor){
        animals.forEach(element-> {
            element.accept(visitor);
        });
    }
    //为家庭增加宠物
    public void addAnimal(Element element){
        animals.add(element);
    }
}
