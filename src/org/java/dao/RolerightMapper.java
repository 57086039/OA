package org.java.dao;

import org.java.entity.oa.Roleright;

public interface RolerightMapper {
    int deleteByPrimaryKey(Long rolerightid);

    int insert(Roleright record);

    int insertSelective(Roleright record);

    Roleright selectByPrimaryKey(Long rolerightid);

    int updateByPrimaryKeySelective(Roleright record);

    int updateByPrimaryKey(Roleright record);
}