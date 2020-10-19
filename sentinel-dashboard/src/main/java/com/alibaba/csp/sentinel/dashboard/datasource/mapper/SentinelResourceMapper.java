package com.alibaba.csp.sentinel.dashboard.datasource.mapper;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.SentinelResource;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.SentinelResourceWhere;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SentinelResourceMapper {
     /** 表： resource */
    long countByWhere(SentinelResourceWhere example);

     /** 表： resource */
    int deleteByWhere(SentinelResourceWhere example);

     /** 表： resource */
    int deleteById(Integer id);

     /** 表： resource */
    int insert(SentinelResource record);

     /** 表： resource */
    int insertSelective(SentinelResource record);

     /** 表： resource */
    List<SentinelResource> selectByWhere(SentinelResourceWhere example);

     /** 表： resource */
    SentinelResource selectById(Integer id);

     /** 表： resource */
    int updateByWhereSelective(@Param("record") SentinelResource record, @Param("example") SentinelResourceWhere example);

     /** 表： resource */
    int updateByWhere(@Param("record") SentinelResource record, @Param("example") SentinelResourceWhere example);

     /** 表： resource */
    int updateByIdSelective(SentinelResource record);

     /** 表： resource */
    int updateById(SentinelResource record);
}