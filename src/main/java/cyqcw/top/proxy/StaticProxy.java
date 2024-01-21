package cyqcw.top.proxy;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/18 16:15
 * @version: 1.0
 * @description: 代理对象，提供于真实的主题相同的接口，拥有真实主题的引用，可以扩展接口的功能
 */
@Slf4j
public class StaticProxy implements Subject{
    //这里用接口来接感觉耦合度会更低一点，源代码中写的是用子对象来接
    @Setter
    private Subject real=new RealSubject();
    @Override
    public void sell() {
        log.info("已经代理此业务");
        real.sell();
    }
}
