package cyqcw.top.bridge;

/**
 * @author: hegu
 * @time: 2024/1/21 17:08
 * @version: 1.0
 * @description: TODO
 */
public class Huawei extends Phone{

    public Huawei(SoftWare softWare) {
        super(softWare);
    }

    @Override
    public void run() {
        System.out.println("使用华为手机");
        softWare.run();
    }
}
