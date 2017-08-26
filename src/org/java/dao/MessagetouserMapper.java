package org.java.dao;

import org.java.entity.oa.Messagetouser;

public interface MessagetouserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Messagetouser record);

    int insertSelective(Messagetouser record);

    Messagetouser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Messagetouser record);

    int updateByPrimaryKey(Messagetouser record);
}