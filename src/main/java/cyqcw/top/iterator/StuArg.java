package cyqcw.top.iterator;

/**
 * @author: hegu
 * @time: 2024/1/30 18:45
 * @version: 1.0
 * @description: 抽象聚合类，声明增加删除聚合元素的方法并声明获取迭代器的方法
 */
public interface StuArg {
    void addStu(Student student);
    void removeStu(Student student);
    StuIterator getIterator();
}
