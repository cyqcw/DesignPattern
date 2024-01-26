package cyqcw.top.state.modify;

/**
 * @author: hegu
 * @time: 2024/1/26 10:50
 * @version: 1.0
 * @description: 对于上述案例的改进
 */
public class Client {
    public static void main(String[] args){
        /**
         * 设置环境类当前的状态
         * 环境里面有当前的状态，状态里面有当前的环境变量，目的是可以在任意状态里面切换到其他的任意状态
         */
        Context context=new Context().setState(Context.CLOSING_STATE);
        context.close();
        context.open();
        context.close();
        context.open();
    }
}
