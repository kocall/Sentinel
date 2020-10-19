package com.alibaba.csp.sentinel.dashboard.datasource.dao;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.*;
import com.alibaba.csp.sentinel.dashboard.datasource.mapper.AppMapper;
import com.alibaba.csp.sentinel.dashboard.datasource.mapper.SentinelMetricsEntityMapper;
import com.alibaba.csp.sentinel.dashboard.datasource.mapper.SentinelResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wzhang.
 * Date: 2020/10/16
 * Time: 7:08 下午
 */
@Repository
public class MetricsDao {
    @Autowired
    private AppMapper appMapper;
    @Autowired
    private SentinelResourceMapper sentinelResourceMapper;
    @Autowired
    private SentinelMetricsEntityMapper metricsEntityMapper;

    public App findAppByName(String name) {
        AppWhere appWhere = new AppWhere();
        appWhere.createCriteria().andAppEqualTo(name);
        List<App> appList = appMapper.selectByWhere(appWhere);
        if (appList.size() != 0) {
            return appList.get(0);
        }
        return null;
    }

    public int saveApp(String appName) {
        App app = new App();
        app.setApp(appName);
        return appMapper.insert(app);

    }

    public SentinelResource findResourceByName(String resourceName) {
        SentinelResourceWhere where = new SentinelResourceWhere();
        where.createCriteria().andResourceEqualTo(resourceName);
        List<SentinelResource> list = sentinelResourceMapper.selectByWhere(where);
        if (list.size() != 0) {
            return list.get(0);
        }
        return null;
    }

    public int saveResource(String resourceName) {
        SentinelResource resource = new SentinelResource();
        resource.setResource(resourceName);
        return sentinelResourceMapper.insert(resource);
    }

    public List<MetricEntity> selectMetrics(String app, String resource, long startTime, long endTime) {
        return metricsEntityMapper.selectMetrics(app, resource, startTime/1000, endTime/1000);
    }
}
