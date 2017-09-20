package org.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.java.entity.oa.Departinfo;

public interface DepartinfoMapper {
    int deleteByPrimaryKey(Long departid);

    int insert(Departinfo record);

    int insertSelective(Departinfo record);

    Departinfo selectByPrimaryKey(Long departid);

    int updateByPrimaryKeySelective(Departinfo record);

    int updateByPrimaryKey(Departinfo record);
    
   //根据机构名称查找部门
    List<Map<String, Object>> bumenShaiXuan(@Param("branchname") String branchname);
    //根据部门名称查找人员
    List<Map<String, Object>> renxuanbumen(@Param("departname") String departname);
    
}