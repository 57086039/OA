package org.java.dao;


import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.java.entity.oa.Roleinfo;

public interface RoleinfoMapper {
    int deleteByPrimaryKey(Long roleid);

    int insert(Roleinfo record);

    int insertSelective(Roleinfo record);

    Roleinfo selectByPrimaryKey(Long roleid);

    int updateByPrimaryKeySelective(Roleinfo record);

    int updateByPrimaryKey(Roleinfo record);
    
    List<Map<String, Object>>aSelectAllRef();
    
    List<Roleinfo> aSelectAll();
    
}