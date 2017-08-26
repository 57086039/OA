package org.java.dao;

import org.java.entity.oa.Messagetype;

public interface MessagetypeMapper {
    int deleteByPrimaryKey(Long messagetypeid);

    int insert(Messagetype record);

    int insertSelective(Messagetype record);

    Messagetype selectByPrimaryKey(Long messagetypeid);

    int updateByPrimaryKeySelective(Messagetype record);

    int updateByPrimaryKey(Messagetype record);
}