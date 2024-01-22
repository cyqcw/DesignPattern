package cyqcw.top.combination;

/**
 * @author: hegu
 * @time: 2024/1/22 20:35
 * @version: 1.0
 * @description: 组合模式测试
 */
public class Client {
    public static void main(String[] args){
        Component dic0=new Dictionary("系统根目录",0);
        Component dic1_1=new Dictionary("文件目录",1);
        Component dic1_2=new Dictionary("网络目录",1);
        dic1_1.add(new File("txt文件",2)).add(new File("c文件",2));
        dic1_2.add(new File("TCP",2)).add(new File("IP",2));
        dic0.add(dic1_1).add(dic1_2);
        dic0.show();
    }
}
