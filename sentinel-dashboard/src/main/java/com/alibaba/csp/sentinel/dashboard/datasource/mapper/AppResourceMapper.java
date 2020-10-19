package com.alibaba.csp.sentinel.dashboard.datasource.mapper;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.AppResource;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.AppResourceWhere;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppResourceMapper {
     /** 表： app_resource */
    long countByWhere(AppResourceWhere example);

     /** 表： app_resource */
    int deleteByWhere(AppResourceWhere example);

     /** 表： app_resource */
    int deleteById(Integer id);

     /** 表： app_resource */
    int insert(AppResource record);

     /** 表： app_resource */
    int insertSelective(AppResource record);

     /** 表： app_resource */
    List<AppResource> selectByWhere(AppResourceWhere example);

     /** 表： app_resource */
    AppResource selectById(Integer id);

     /** 表： app_resource */
    int updateByWhereSelective(@Param("record") AppResource record, @Param("example") AppResourceWhere example);

     /** 表： app_resource */
    int updateByWhere(@Param("record") AppResource record, @Param("example") AppResourceWhere example);

     /** 表： app_resource */
    int updateByIdSelective(AppResource record);

     /** 表： app_resource */
    int updateById(AppResource record);
}