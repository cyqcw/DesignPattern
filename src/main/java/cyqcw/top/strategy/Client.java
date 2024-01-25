package cyqcw.top.strategy;

/**
 * @author: hegu
 * @time: 2024/1/23 21:56
 * @version: 1.0
 * @description: 策略模式测试
 */
public class Client {
    public static void main(String[] args){
        /**
         * 不同的情况下使用不同的策略
         */
        Salesman sale=new Salesman(new PlanA());
        sale.saleShow();

        sale.setStrategy(new PlanB());
        sale.saleShow();
    }
}
