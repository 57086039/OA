package org.java.dao;

import java.util.LinkedList;
import java.util.Map;

import org.java.entity.oa.Loginlog;

public interface LoginlogMapper {
    int deleteByPrimaryKey(Long loginid);

    int insert(Loginlog record);

    int insertSelective(Loginlog record);

    Loginlog selectByPrimaryKey(Long loginid);

    int updateByPrimaryKeySelective(Loginlog record);

    int updateByPrimaryKey(Loginlog record);
    /**
     * 查询所有
     * @return
     */
    LinkedList<Map<String, Object>> selectAll(Map<String, Object>map);
    /**
     * 查询总条数
     * @return
     */
    Long selectRows();
}