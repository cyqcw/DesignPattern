package cyqcw.top.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/23 21:01
 * @version: 1.0
 * @description: 抽象类
 */
@Slf4j
public abstract class AbsMethod {
    //这个是模板方法，定义一个流程
    public final void cookProcess(){
        //放油放蔬菜和翻炒
        pourOil();
        pourVegetable();
        fry();
    }
    //基本方法，可以卓杰定义成final
    public final void pourOil(){
        log.info("倒油");
    }
    //抽象方法
    public abstract void pourVegetable();
    public final void fry(){
        log.info("煎炒");
    }
}
