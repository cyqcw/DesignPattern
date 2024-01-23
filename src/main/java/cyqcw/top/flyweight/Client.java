package cyqcw.top.flyweight;

import javax.swing.*;

/**
 * @author: hegu
 * @time: 2024/1/22 22:00
 * @version: 1.0
 * @description: 享元模式测试
 */
public class Client {
    public static void main(String[] args){
        BoxFactory factory=BoxFactory.getInstance();
        AbstractBox box=factory.getBox("L");
        System.out.println(box.getShape());
    }
}
