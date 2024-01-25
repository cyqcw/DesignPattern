package cyqcw.top.handlerchain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: hegu
 * @time: 2024/1/25 20:30
 * @version: 1.0
 * @description: 请假条类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeaveRequest {
    private String name;//姓名
    private Integer needLevel;//需要的权限
    private String content;//请假原因
}
