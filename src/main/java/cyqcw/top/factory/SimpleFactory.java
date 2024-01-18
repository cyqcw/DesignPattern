package cyqcw.top.factory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @author: hegu
 * @time: 2024/1/16 10:34
 * @version: 1.0
 * @description: 配置文件创建coffee，静态简单工厂
 */
public class SimpleFactory {
    static class HashContainer {
        public static final Map<Integer, Coffee> HASH = new HashMap<>();
        private static final String CONFIG_FILE = "factory_bean.yaml";

        static {
            try (InputStream inputStream = SimpleFactory.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
                Properties properties = new Properties();
                properties.load(inputStream);
                //获取所有的键和值
                Set<Object> keys=properties.keySet();
                keys.stream().forEach(key->{
                    try {
                        Class<?> clazz=Class.forName(properties.getProperty((String)key));
                        Coffee coffee=(Coffee) clazz.getDeclaredConstructor().newInstance();
                        HASH.put(Integer.valueOf((String) key),coffee);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
            } catch (IOException e) {
                // 在实际应用中，可以打印异常信息或记录日志
                throw new RuntimeException(e);
            }
        }
    }
    public static Coffee getCoffee(Integer type) {
        return HashContainer.HASH.get(type);
    }
}

