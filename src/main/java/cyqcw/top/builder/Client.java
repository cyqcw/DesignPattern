package cyqcw.top.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/16 16:15
 * @version: 1.0
 * @description: TODO
 */
@Slf4j
public class Client {
    public static void main(String[] args){
        Director director=new Director();
        director.setBuilder(new HelloBuilder());
        director.director();
        Bike bike=director.getInstance();
        log.info("{} {}",bike.getFrame(),bike.getSeat());

        Student student=new Student.Builder().id(1).name("xi").build();
        log.info("{} {}",student.getId(),student.getName());
    }
}
