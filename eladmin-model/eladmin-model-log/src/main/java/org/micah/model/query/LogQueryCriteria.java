package org.micah.model.query;

import lombok.Data;
import org.micah.mp.annotation.Query;
import org.micah.mp.annotation.type.SelectType;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 日志查询类
 *
 * @author Zheng Jie
 * @date 2019-6-4 09:23:07
 */
@Data
public class LogQueryCriteria {

    @Query(blurry = {"username", "description", "address", "requestIp", "method", "params"})
    private String blurry;

    @Query
    private String logType;

    @Query(type = SelectType.BETWEEN)
    private List<LocalDateTime> createTime;
}