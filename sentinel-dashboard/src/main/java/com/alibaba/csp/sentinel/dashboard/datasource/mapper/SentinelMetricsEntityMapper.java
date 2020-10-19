package com.alibaba.csp.sentinel.dashboard.datasource.mapper;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.MetricEntity;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.SentinelMetricsEntity;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.SentinelMetricsEntityWhere;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SentinelMetricsEntityMapper {
     /** 表： metrics */
    long countByWhere(SentinelMetricsEntityWhere example);

     /** 表： metrics */
    int deleteByWhere(SentinelMetricsEntityWhere example);

     /** 表： metrics */
    int deleteById(Integer id);

     /** 表： metrics */
    int insert(SentinelMetricsEntity record);

     /** 表： metrics */
    int insertSelective(SentinelMetricsEntity record);

     /** 表： metrics */
    List<SentinelMetricsEntity> selectByWhere(SentinelMetricsEntityWhere example);

     /** 表： metrics */
    SentinelMetricsEntity selectById(Integer id);

     /** 表： metrics */
    int updateByWhereSelective(@Param("record") SentinelMetricsEntity record, @Param("example") SentinelMetricsEntityWhere example);

     /** 表： metrics */
    int updateByWhere(@Param("record") SentinelMetricsEntity record, @Param("example") SentinelMetricsEntityWhere example);

     /** 表： metrics */
    int updateByIdSelective(SentinelMetricsEntity record);

     /** 表： metrics */
    int updateById(SentinelMetricsEntity record);

    /**
     *  id            | int(11)      | NO   | PRI | NULL                | auto_increment              |
     * | gmt_create    | timestamp    | NO   |     | CURRENT_TIMESTAMP   | on update CURRENT_TIMESTAMP |
     * | gmt_modified  | timestamp    | NO   |     | 0000-00-00 00:00:00 |                             |
     * | app_id        | int(11)      | NO   | MUL | NULL                |                             |
     * | timestamp     | timestamp    | NO   | MUL | 0000-00-00 00:00:00 |                             |
     * | resource_id   | int(11)      | NO   |     | NULL                |                             |
     * | pass_qps      | int(11)      | NO   |     | 0                   |                             |
     * | success_qps   | int(11)      | NO   |     | 0                   |                             |
     * | block_qps     | int(11)      | NO   |     | 0                   |                             |
     * | exception_qps | int(11)      | NO   |     | 0                   |                             |
     * | rt            | double(10,2) | NO   |     | 0.00                |                             |
     * | count         | int(11)      | NO   |     | 0                   |                             |
     * | resource_code | int(11)
     * @param app
     * @param resource
     * @param startTime
     * @param endTime
     * @return
     */
    @Select("select m.id as id,m.gmt_create as gmtCreate,m.gmt_modified as gmtModified," +
            "m.timestamp as timestamp,m.pass_qps as passQps," +
            "m.success_qps as successQps, m.block_qps as blockQps,m.exception_qps as exceptionQps," +
            "m.rt as rt,m.count as count,m.resource_code as resourceCode,a.app,r.resource from metrics m\n" +
            "inner join app_resource ar on m.app_id =  ar.app_id and m.resource_id=ar.resource_id\n" +
            "inner join app a on a.id = ar.app_id\n" +
            "inner join resource r on ar.resource_id = r.id\n" +
            "where a.app=#{app} and r.resource=#{resource} and unix_timestamp(m.timestamp) between #{startTime} and #{endTime}")
    List<MetricEntity> selectMetrics(@Param("app") String app, @Param("resource")String resource,
                                     @Param("startTime")long startTime, @Param("endTime")long endTime);
}