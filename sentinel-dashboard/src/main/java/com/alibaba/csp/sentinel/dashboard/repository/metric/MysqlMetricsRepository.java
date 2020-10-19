package com.alibaba.csp.sentinel.dashboard.repository.metric;

import com.alibaba.csp.sentinel.dashboard.controller.MetricController;
import com.alibaba.csp.sentinel.dashboard.datasource.dao.MetricsDao;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.*;
import com.alibaba.csp.sentinel.dashboard.datasource.mapper.AppMapper;
import com.alibaba.csp.sentinel.dashboard.datasource.mapper.AppResourceMapper;
import com.alibaba.csp.sentinel.dashboard.datasource.mapper.SentinelMetricsEntityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by wzhang.
 * Date: 2020/10/16
 * Time: 6:17 下午
 */
@Repository
@Primary
@ConditionalOnProperty(value = "memory.mysql.enabled", havingValue = "true", matchIfMissing = false)

public class MysqlMetricsRepository implements MetricsRepository<MetricEntity> {
    @Autowired
    private MetricsDao metricsDao;

    @Autowired
    private AppMapper appMapper;

    @Autowired
    private SentinelMetricsEntityMapper sentinelMetricsEntityMapper;

    @Autowired
    private AppResourceMapper appResourceMapper;

    private static Logger log = LoggerFactory.getLogger(MysqlMetricsRepository.class);


    @Override
    public void save(MetricEntity metric) {
        String appName = metric.getApp();
        App app = metricsDao.findAppByName(appName);
        int appId;
        if(null != app){
            appId = app.getId();
        }else{
            appId = metricsDao.saveApp(appName);
        }
        String resourceName = metric.getResource();
        SentinelResource resource = metricsDao.findResourceByName(resourceName);
        int resourceId;
        if(null != resource){
            resourceId = resource.getId();
        }else{
            resourceId = metricsDao.saveResource(resourceName);
        }
        AppResourceWhere appResourceWhere = new AppResourceWhere();
        appResourceWhere.createCriteria().andAppIdEqualTo(appId).andResourceIdEqualTo(resourceId);
        List<AppResource> appResources =  appResourceMapper.selectByWhere(appResourceWhere);
        if(CollectionUtils.isEmpty(appResources)){
            appResourceMapper.insert(new AppResource(appId,resourceId));
        }
        log.info("metric is:{}",metric);

        SentinelMetricsEntity sentinelMetricsEntity = SentinelMetricsEntity.from(metric,appId,resourceId);
        sentinelMetricsEntityMapper.insertSelective(sentinelMetricsEntity);



    }

    @Override
    public void saveAll(Iterable<MetricEntity> metrics) {
        if (metrics == null) {
            return;
        }
        metrics.forEach(this::save);
    }

    @Override
    public List<MetricEntity> queryByAppAndResourceBetween(String app, String resource, long startTime, long endTime) {
        return metricsDao.selectMetrics(app,resource,startTime,endTime);
    }

    @Override
    public List<String> listResourcesOfApp(String app) {
        return appMapper.selectResourceList(app);
    }
}
