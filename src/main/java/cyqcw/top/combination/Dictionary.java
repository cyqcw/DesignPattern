package cyqcw.top.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hegu
 * @time: 2024/1/22 20:27
 * @version: 1.0
 * @description: TODO
 */
public class Dictionary extends Component{
    //这里放在目录里而不是父类的抽象类里
    private List<Component> children=new ArrayList<>();
    Dictionary(String name,Integer level){
        this.name=name;
        this.level=level;
    }
    @Override
    public Component add(Component component){
        this.children.add(component);
        return this;
    }
    @Override
    public void show() {
        for(int i=0;i<this.level;i++){
            System.out.print("\t");
        }
        System.out.println(this.name+this.level);
        this.children.stream().forEach(Component::show);
    }
}
