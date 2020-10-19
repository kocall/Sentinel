package com.alibaba.csp.sentinel.dashboard.datasource.entity;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * sentinel.metrics  
 *
 * @author wzhang
 * @date 2020-10-16
 * 该类为自动生成，请勿修改
 */
public class SentinelMetricsEntity implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    /** app id 表字段：metrics.app_id */
    private Integer appId;

    private Date timestamp;

    /** resource id 表字段：metrics.resource_id */
    private Integer resourceId;

    private Long passQps;

    private Long successQps;

    private Long blockQps;

    private Long exceptionQps;

    private double rt;

    private int count;

    private int resourceCode;



    private static final long serialVersionUID = 1L;

    public static SentinelMetricsEntity from(MetricEntity metricEntity,int appId,int resourceId){
        SentinelMetricsEntity sentinelMetricsEntity = new SentinelMetricsEntity();
        BeanUtils.copyProperties(metricEntity,sentinelMetricsEntity);
        sentinelMetricsEntity.setAppId(appId);
        sentinelMetricsEntity.setResourceId(resourceId);
        return sentinelMetricsEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Long getPassQps() {
        return passQps;
    }

    public void setPassQps(Long passQps) {
        this.passQps = passQps;
    }

    public Long getSuccessQps() {
        return successQps;
    }

    public void setSuccessQps(Long successQps) {
        this.successQps = successQps;
    }

    public Long getBlockQps() {
        return blockQps;
    }

    public void setBlockQps(Long blockQps) {
        this.blockQps = blockQps;
    }

    public Long getExceptionQps() {
        return exceptionQps;
    }

    public void setExceptionQps(Long exceptionQps) {
        this.exceptionQps = exceptionQps;
    }

    public double getRt() {
        return rt;
    }

    public void setRt(double rt) {
        this.rt = rt;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(int resourceCode) {
        this.resourceCode = resourceCode;
    }

}