package org.java.dao;

import org.java.entity.oa.Sysfun;

public interface SysfunMapper {
    int deleteByPrimaryKey(Long nodeid);

    int insert(Sysfun record);

    int insertSelective(Sysfun record);

    Sysfun selectByPrimaryKey(Long nodeid);

    int updateByPrimaryKeySelective(Sysfun record);

    int updateByPrimaryKey(Sysfun record);
}