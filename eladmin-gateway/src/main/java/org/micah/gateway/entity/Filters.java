package org.micah.gateway.entity;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * @program: eladmin-cloud
 * @description: 路由过滤策略
 * @author: Micah
 * @create: 2020-08-15 21:39
 **/
@Data
public class Filters implements Serializable {

    private static final long serialVersionUID = 7528156236392922835L;

    private Long id;

    private Long gatewayId;

    private String filterName;

    private String filterKey;

    private String filterVal;
}
