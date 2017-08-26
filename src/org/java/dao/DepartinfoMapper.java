package org.java.dao;

import org.java.entity.oa.Departinfo;

public interface DepartinfoMapper {
    int deleteByPrimaryKey(Long departid);

    int insert(Departinfo record);

    int insertSelective(Departinfo record);

    Departinfo selectByPrimaryKey(Long departid);

    int updateByPrimaryKeySelective(Departinfo record);

    int updateByPrimaryKey(Departinfo record);
}