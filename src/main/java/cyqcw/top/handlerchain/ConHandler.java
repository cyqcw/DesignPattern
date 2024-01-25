package cyqcw.top.handlerchain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: hegu
 * @time: 2024/1/25 19:55
 * @version: 1.0
 * @description: 具体的处理者类
 */
@Slf4j
public class ConHandler extends Handler{
    public ConHandler(String job, Integer level, Handler nextHandler) {
        super(job, level, nextHandler);
    }
    //这样写的话其实用一个类就能解决了，实际上需要不同的实现类代表不同的职务
    @Override
    public void assign(LeaveRequest leave) {
        if(canDis(leave.getNeedLevel()) || nextHandler==null){
            log.info("{}级别({})处理了需要({})级别的{}的请假条",job,level,leave.getNeedLevel(),leave.getName());
        }else{
            log.info("{}级别({})处理了需要({})级别的{}的请假条，转交给下一位",job,level,leave.getNeedLevel(),leave.getName());
            nextHandler.assign(leave);
        }
    }
}
