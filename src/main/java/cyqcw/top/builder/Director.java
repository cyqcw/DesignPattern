package cyqcw.top.builder;

import lombok.Setter;

/**
 * @author: hegu
 * @time: 2024/1/16 16:12
 * @version: 1.0
 * @description: TODO
 */
public class Director {
    @Setter
    Builder builder;
    public void director(){
        builder.buildFrame();
        builder.buildSeat();
    }
    public Bike getInstance(){
        return builder.getBike();
    }
}
