package org.java.dao;

import java.util.List;

import org.java.entity.oa.Branchinfo;

public interface BranchinfoMapper {
    int deleteByPrimaryKey(Long branchid);

    int insert(Branchinfo record);

    int insertSelective(Branchinfo record);

    Branchinfo selectByPrimaryKey(Long branchid);

    int updateByPrimaryKeySelective(Branchinfo record);

    int updateByPrimaryKey(Branchinfo record);
    
    List<Branchinfo> jigou();
}