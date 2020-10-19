package com.alibaba.csp.sentinel.dashboard.datasource.entity;

import java.io.Serializable;

/**
 * sentinel.app  
 *
 * @author wzhang
 * @date 2020-10-16
 * 该类为自动生成，请勿修改
 */
public class App implements Serializable {
    private Integer id;

    /** 服务名 表字段：app.app */
    private String app;

    private static final long serialVersionUID = 1L;

    /** 表字段： app.id */
    public Integer getId() {
        return id;
    }

    /** 表字段： app.id */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 表字段： app.app */
    public String getApp() {
        return app;
    }

    /** 表字段： app.app */
    public void setApp(String app) {
        this.app = app == null ? null : app.trim();
    }
}