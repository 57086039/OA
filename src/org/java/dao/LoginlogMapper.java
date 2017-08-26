package org.java.dao;

import org.java.entity.oa.Loginlog;

public interface LoginlogMapper {
    int deleteByPrimaryKey(Long loginid);

    int insert(Loginlog record);

    int insertSelective(Loginlog record);

    Loginlog selectByPrimaryKey(Long loginid);

    int updateByPrimaryKeySelective(Loginlog record);

    int updateByPrimaryKey(Loginlog record);
}