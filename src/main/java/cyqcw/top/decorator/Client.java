package cyqcw.top.decorator;

import java.sql.Struct;

/**
 * @author: hegu
 * @time: 2024/1/21 16:02
 * @version: 1.0
 * @description: TODO
 */
public class Client {
    public static void main(String[] args){
        //米饭加蛋，蛋装饰了快餐组成的新快餐
        FastFood fastFoodDecorator=new EggDecorator(new Rice());
        System.out.println(fastFoodDecorator.getDesc());
        //米饭再加蛋，蛋又装饰了新快餐
        fastFoodDecorator=new EggDecorator(fastFoodDecorator);
        System.out.println(fastFoodDecorator.getDesc());
    }
}
