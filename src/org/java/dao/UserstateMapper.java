package org.java.dao;

import org.java.entity.oa.Userstate;

public interface UserstateMapper {
    int deleteByPrimaryKey(Long userstateid);

    int insert(Userstate record);

    int insertSelective(Userstate record);

    Userstate selectByPrimaryKey(Long userstateid);

    int updateByPrimaryKeySelective(Userstate record);

    int updateByPrimaryKey(Userstate record);
}