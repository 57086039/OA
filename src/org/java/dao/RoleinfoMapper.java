package org.java.dao;

import org.java.entity.oa.Roleinfo;

public interface RoleinfoMapper {
    int deleteByPrimaryKey(Long roleid);

    int insert(Roleinfo record);

    int insertSelective(Roleinfo record);

    Roleinfo selectByPrimaryKey(Long roleid);

    int updateByPrimaryKeySelective(Roleinfo record);

    int updateByPrimaryKey(Roleinfo record);
}