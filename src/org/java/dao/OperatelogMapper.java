package org.java.dao;

import java.util.LinkedList;
import java.util.Map;

import org.java.entity.oa.Operatelog;

public interface OperatelogMapper {
    int deleteByPrimaryKey(Long operateid);

    int insert(Operatelog record);

    int insertSelective(Operatelog record);

    Operatelog selectByPrimaryKey(Long operateid);

    int updateByPrimaryKeySelective(Operatelog record);

    int updateByPrimaryKey(Operatelog record);
    
    /**
     * ²éÑ¯ËùÓÐ
     * @return
     */
    LinkedList<Map<String, Object>> selectAll(Map<String, Object>map);
}