package cyqcw.top.iterator;

import java.util.List;

/**
 * @author: hegu
 * @time: 2024/1/30 18:50
 * @version: 1.0
 * @description: 抽象迭代器的实现类，主要是hasnext方法和next方法
 */
public class StuIteratorImpl implements StuIterator{
    private List<Student>students;
    private Integer pos;
    public StuIteratorImpl(List<Student>students){
        this.students=students;
        this.pos=0;
    }
    @Override
    public Boolean hasNext() {
        return pos<students.size();
    }

    @Override
    public Student next(){
        if(hasNext())return students.get(pos++);
        else return null;
    }
}
