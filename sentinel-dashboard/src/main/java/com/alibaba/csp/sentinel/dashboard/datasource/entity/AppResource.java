package com.alibaba.csp.sentinel.dashboard.datasource.entity;

import java.io.Serializable;

/**
 * sentinel.app_resource  
 *
 * @author wzhang
 * @date 2020-10-16
 * 该类为自动生成，请勿修改
 */
public class AppResource implements Serializable {
    private Integer id;

    /** app id 表字段：app_resource.app_id */
    private Integer appId;

    /** resoruce id 表字段：app_resource.resource_id */
    private Integer resourceId;

    private static final long serialVersionUID = 1L;

    public AppResource(Integer appId, Integer resourceId) {
        this.appId = appId;
        this.resourceId = resourceId;
    }

    public AppResource() {
    }

    /** 表字段： app_resource.id */
    public Integer getId() {
        return id;
    }

    /** 表字段： app_resource.id */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 表字段： app_resource.app_id */
    public Integer getAppId() {
        return appId;
    }

    /** 表字段： app_resource.app_id */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /** 表字段： app_resource.resource_id */
    public Integer getResourceId() {
        return resourceId;
    }

    /** 表字段： app_resource.resource_id */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}