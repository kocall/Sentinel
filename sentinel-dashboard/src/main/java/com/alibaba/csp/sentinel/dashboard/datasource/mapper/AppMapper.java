package com.alibaba.csp.sentinel.dashboard.datasource.mapper;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.App;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.AppWhere;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AppMapper {
     /** 表： app */
    long countByWhere(AppWhere example);

     /** 表： app */
    int deleteByWhere(AppWhere example);

     /** 表： app */
    int deleteById(Integer id);

     /** 表： app */
    int insert(App record);

     /** 表： app */
    int insertSelective(App record);

     /** 表： app */
    List<App> selectByWhere(AppWhere example);

     /** 表： app */
    App selectById(Integer id);

     /** 表： app */
    int updateByWhereSelective(@Param("record") App record, @Param("example") AppWhere example);

     /** 表： app */
    int updateByWhere(@Param("record") App record, @Param("example") AppWhere example);

     /** 表： app */
    int updateByIdSelective(App record);

     /** 表： app */
    int updateById(App record);

    @Select("select r.resource from resource r \n" +
            "inner join app_resource ar on r.id = ar.resource_id \n" +
            "inner  join app a on ar.app_id = a.id\n" +
            "where a.app=#{app}")
    List<String> selectResourceList(@Param("app") String app);
}