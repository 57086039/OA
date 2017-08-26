package org.java.dao;

import org.java.entity.oa.Filetypeinfo;

public interface FiletypeinfoMapper {
    int deleteByPrimaryKey(Long filetypeid);

    int insert(Filetypeinfo record);

    int insertSelective(Filetypeinfo record);

    Filetypeinfo selectByPrimaryKey(Long filetypeid);

    int updateByPrimaryKeySelective(Filetypeinfo record);

    int updateByPrimaryKey(Filetypeinfo record);
}