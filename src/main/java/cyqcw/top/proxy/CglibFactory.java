package cyqcw.top.proxy;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/**
 * @author: hegu
 * @time: 2024/1/19 17:12
 * @version: 1.0
 * @description: 通过cglib实现不需要接口的代理类
 */
@Slf4j
public class CglibFactory implements MethodInterceptor {
    private RealSubject realSubject=new RealSubject();
    public RealSubject getProxyInstance(){
        // 打开java.lang.ClassLoader.defineClass方法的访问权限
        //创建Enhancer对象，类似于proxy对象
        Enhancer enhancer=new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(RealSubject.class);
        //设置回调函数，实现方法接口
        enhancer.setCallback(this);
        //创建代理对象
        return (RealSubject) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("CGLIB增强功能");
        //realSubject.sell();
        //下面这个是通过反射机制来实现的
        return method.invoke(realSubject,objects);
    }
}
