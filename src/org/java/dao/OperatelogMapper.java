package org.java.dao;

import org.java.entity.oa.Operatelog;

public interface OperatelogMapper {
    int deleteByPrimaryKey(Long operateid);

    int insert(Operatelog record);

    int insertSelective(Operatelog record);

    Operatelog selectByPrimaryKey(Long operateid);

    int updateByPrimaryKeySelective(Operatelog record);

    int updateByPrimaryKey(Operatelog record);
}