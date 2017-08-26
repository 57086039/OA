package org.java.dao;

import org.java.entity.oa.Mynote;

public interface MynoteMapper {
    int deleteByPrimaryKey(Long noteid);

    int insert(Mynote record);

    int insertSelective(Mynote record);

    Mynote selectByPrimaryKey(Long noteid);

    int updateByPrimaryKeySelective(Mynote record);

    int updateByPrimaryKeyWithBLOBs(Mynote record);

    int updateByPrimaryKey(Mynote record);
}