package cyqcw.top.handlerchain;

import lombok.Setter;

/**
 * @author: hegu
 * @time: 2024/1/25 19:54
 * @version: 1.0
 * @description: 抽象处理者
 */
public abstract class Handler {
    @Setter
    protected String job;
    @Setter
    protected Integer level;
    @Setter
    protected Handler nextHandler;
    public Handler(String job,Integer level,Handler nextHandler){
        this.job=job;
        this.level=level;
        this.nextHandler=nextHandler;
    }

    /**
     * 批复请假条的类
     */
    public abstract void assign(LeaveRequest leave);
    protected final Boolean canDis(Integer needLevel){
        return needLevel<=level;
    }
}
