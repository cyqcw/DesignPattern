package cyqcw.top.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: hegu
 * @time: 2024/1/30 21:29
 * @version: 1.0
 * @description: 环境角色
 */
public class Context {
    private Map<Variable,Integer>map=new HashMap<>();
    //增加
    public void assign(Variable var,Integer value){
        map.put(var,value);
    }
    //获取
    public Integer getValue(Variable var){
        return map.get(var);
    }
}
