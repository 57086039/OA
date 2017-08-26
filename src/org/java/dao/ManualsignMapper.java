package org.java.dao;

import org.java.entity.oa.Manualsign;

public interface ManualsignMapper {
    int deleteByPrimaryKey(Long signid);

    int insert(Manualsign record);

    int insertSelective(Manualsign record);

    Manualsign selectByPrimaryKey(Long signid);

    int updateByPrimaryKeySelective(Manualsign record);

    int updateByPrimaryKey(Manualsign record);
}