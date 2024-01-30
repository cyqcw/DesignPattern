package cyqcw.top.visitor;

/**
 * @author: hegu
 * @time: 2024/1/30 19:32
 * @version: 1.0
 * @description: 访问者模式测试类
 */
public class Client {
    public static void main(String[] args){
        //新的结构类
        Struct home=new Struct();
        home.addAnimal(new Dog());
        home.addAnimal(new Cat());
        //访问者访问
        home.action(new Owner());
    }
}
