package cyqcw.top.proxy;

/**
 * @author: hegu
 * @time: 2024/1/18 16:23
 * @version: 1.0
 * @description: TODO
 */
public class Client {
    public static void main(String[] args){
        /**
         * 静态代理
         */
        StaticProxy staticProxy=new StaticProxy();
        staticProxy.sell();

        /**
         * 动态代理JDK
         */
        ProxyFactory proxyFactory=new ProxyFactory();
        //用接口来接因为没有实现代理类
        Subject proxy=proxyFactory.getProxyInstance();
        proxy.sell();

        /**
         * CGLIB代理
         */
//        CglibFactory cglibFactory=new CglibFactory();
//        RealSubject cglibProxy=cglibFactory.getProxyInstance();
//        cglibProxy.sell();
    }
}
