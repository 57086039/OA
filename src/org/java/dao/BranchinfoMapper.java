package org.java.dao;

import java.util.List;
import java.util.Map;

import org.java.entity.oa.Branchinfo;

public interface BranchinfoMapper {
    int deleteByPrimaryKey(Long branchid);
    
    int insert(Branchinfo record);

    int insertSelective(Branchinfo record);

    Branchinfo selectByPrimaryKey(Long branchid);

    int updateByPrimaryKeySelective(Branchinfo record);

    int updateByPrimaryKey(Branchinfo record);
    
    //查询所有机构
    List<Map<String, Object>> jigou();
    
    
}