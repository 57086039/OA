package org.java.dao;

import org.java.entity.oa.Precontract;

public interface PrecontractMapper {
    int deleteByPrimaryKey(Long precontractid);

    int insert(Precontract record);

    int insertSelective(Precontract record);

    Precontract selectByPrimaryKey(Long precontractid);

    int updateByPrimaryKeySelective(Precontract record);

    int updateByPrimaryKey(Precontract record);
}