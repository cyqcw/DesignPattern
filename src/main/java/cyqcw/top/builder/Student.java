package cyqcw.top.builder;

import lombok.Data;

/**
 * @author: hegu
 * @time: 2024/1/16 17:01
 * @version: 1.0
 * @description: TODO
 */
@Data
public class Student {
    private Integer id;
    private String name;
    private Student(Builder builder){
        this.id=builder.id;
        this.name=builder.name;
    }
    Student(){

    }
    public static final class Builder{
        private Integer id;
        private String name;
        public Builder id(Integer id){
            this.id=id;
            return this;
        }
        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}
