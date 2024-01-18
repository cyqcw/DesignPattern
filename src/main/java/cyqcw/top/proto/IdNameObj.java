package cyqcw.top.proto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: hegu
 * @time: 2024/1/16 15:26
 * @version: 1.0
 * @description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdNameObj implements Serializable {
    Integer id;
    String name;
}
