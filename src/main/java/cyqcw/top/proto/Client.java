package cyqcw.top.proto;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @author: hegu
 * @time: 2024/1/16 15:40
 * @version: 1.0
 * @description: TODO
 */
@Slf4j
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        /**
         * 浅拷贝，引用不会进行复制直接拿原来的引用来用
         */

        Proto instance=new Proto();
        instance.setStu(new IdNameObj(100,"xi"));
        Proto newInstance=instance.clone();
        log.info("{} {}",instance==newInstance,instance.getStu()==newInstance.getStu());

        /**
         * 深拷贝
         */
        //写入对象的数据到文件中
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("D:/Temp/a.txt"));
        outputStream.writeObject(instance);
        outputStream.close();
        //从文件中读取写入的对象
        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("D:/Temp/a.txt"));
        Proto copyInstance=(Proto) inputStream.readObject();
        inputStream.close();
        log.info("{} {}",instance==copyInstance,instance.getStu()==copyInstance.getStu());
    }
}
