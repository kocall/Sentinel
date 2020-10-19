package com.alibaba.csp.sentinel.dashboard.datasource.entity;

import java.io.Serializable;

/**
 * sentinel.resource  
 *
 * @author wzhang
 * @date 2020-10-16
 * 该类为自动生成，请勿修改
 */
public class SentinelResource implements Serializable {
    private Integer id;

    /** sentinel 资源 表字段：resource.resource */
    private String resource;

    private static final long serialVersionUID = 1L;

    /** 表字段： resource.id */
    public Integer getId() {
        return id;
    }

    /** 表字段： resource.id */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 表字段： resource.resource */
    public String getResource() {
        return resource;
    }

    /** 表字段： resource.resource */
    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }
}