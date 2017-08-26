package org.java.dao;

import org.java.entity.oa.Accessoryfile;

public interface AccessoryfileMapper {
    int deleteByPrimaryKey(Long accessoryid);

    int insert(Accessoryfile record);

    int insertSelective(Accessoryfile record);

    Accessoryfile selectByPrimaryKey(Long accessoryid);

    int updateByPrimaryKeySelective(Accessoryfile record);

    int updateByPrimaryKey(Accessoryfile record);
}