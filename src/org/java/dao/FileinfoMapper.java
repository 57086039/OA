package org.java.dao;

import org.java.entity.oa.Fileinfo;

public interface FileinfoMapper {
    int deleteByPrimaryKey(Long fileid);

    int insert(Fileinfo record);

    int insertSelective(Fileinfo record);

    Fileinfo selectByPrimaryKey(Long fileid);

    int updateByPrimaryKeySelective(Fileinfo record);

    int updateByPrimaryKey(Fileinfo record);
}