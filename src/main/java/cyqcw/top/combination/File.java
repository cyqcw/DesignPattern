package cyqcw.top.combination;

/**
 * @author: hegu
 * @time: 2024/1/22 20:27
 * @version: 1.0
 * @description: TODO
 */
public class File extends Component{
    File(String name,Integer level){
        this.name=name;
        this.level=level;
    }
    @Override
    public void show() {
        for(int i=0;i<this.level;i++){
            System.out.print("\t");
        }
        System.out.println(this.name+this.level);
    }
}
