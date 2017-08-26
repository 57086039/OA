package org.java.dao;

import org.java.entity.oa.Readcommonmessage;

public interface ReadcommonmessageMapper {
    int deleteByPrimaryKey(Long readid);

    int insert(Readcommonmessage record);

    int insertSelective(Readcommonmessage record);

    Readcommonmessage selectByPrimaryKey(Long readid);

    int updateByPrimaryKeySelective(Readcommonmessage record);

    int updateByPrimaryKey(Readcommonmessage record);
}