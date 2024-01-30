package cyqcw.top.iterator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/30 18:41
 * @version: 1.0
 * @description: 迭代子模式的测试
 */
@Slf4j
public class Client {
    public static void main(String[] args){
        //定义聚合类
        StuArg stuArg=new StuArgImpl();
        stuArg.addStu(new Student("luojiang",11));
        stuArg.addStu(new Student("cyqcw",12));
        //获得迭代器
        StuIterator iterator=stuArg.getIterator();
        //遍历迭代器
        while(iterator.hasNext()){
            log.info("{}",iterator.next().toString());
        }
    }
}
