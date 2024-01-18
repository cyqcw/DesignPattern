package cyqcw.top.proto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @author: hegu
 * @time: 2024/1/16 11:25
 * @version: 1.0
 * @description: TODO
 */
@Slf4j
@Data
public class Proto implements Cloneable,Serializable{
    private IdNameObj stu;
    @Override
    protected Proto clone() throws CloneNotSupportedException {
        return (Proto) super.clone();
    }
}
