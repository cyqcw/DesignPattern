package cyqcw.top.facade;

/**
 * @author: hegu
 * @time: 2024/1/22 19:20
 * @version: 1.0
 * @description: TODO
 */
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    ComputerFacade(){
        //为什么这里直接new了一个，因为外观就是为了简化客户端的使用，隐藏子系统的细节，简化客户端的使用
        this.cpu=new CPU();
        this.memory=new Memory();
    }

    public void on(){
        this.cpu.process();
        this.memory.load();
        System.out.println("电脑加载成功");
    }
}
