package cyqcw.top.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hegu
 * @time: 2024/1/30 18:48
 * @version: 1.0
 * @description: 具体聚合类
 */
public class StuArgImpl implements StuArg{
    private List<Student>students=new ArrayList<>();
    @Override
    public void addStu(Student student) {
        students.add(student);
    }

    @Override
    public void removeStu(Student student) {
        students.remove(student);
    }

    /**
     * 每一获得的迭代器都不一样
     */
    @Override
    public StuIterator getIterator() {
        return new StuIteratorImpl(this.students);
    }
}
