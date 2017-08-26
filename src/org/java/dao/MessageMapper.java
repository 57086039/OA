package org.java.dao;

import org.java.entity.oa.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Long messageid);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Long messageid);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKeyWithBLOBs(Message record);

    int updateByPrimaryKey(Message record);
}