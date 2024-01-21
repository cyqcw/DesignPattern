package cyqcw.top.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: hegu
 * @time: 2024/1/19 16:16
 * @version: 1.0
 * @description: 动态代理获得代理对象的工厂类
 */
@Slf4j
public class ProxyFactory {
    //在工厂里面声明目标对象
    public RealSubject realSubject=new RealSubject();
    //因为代理类和目标对象都实现了相同的接口，所以用接口代表代理类
    public Subject getProxyInstance(){
        //类加载器用来加载代理类、代理类实现接口的字节码对象，代理对象的调用处理程序
        Subject subject=(Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                //其实调用sell方法时调用的就是我们提供的invoke方法
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        log.info("动态代理类功能增强");
                        //调用目标对象的方法
                        return method.invoke(realSubject,args);
                    }
                });
        return subject;
    }
}
