package org.java.dao;

import java.util.List;

import org.java.entity.oa.Messagetouser;

public interface MessagetouserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Messagetouser record);

    int insertSelective(Messagetouser record);

    Messagetouser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Messagetouser record);

    int updateByPrimaryKey(Messagetouser record);
    List<String>  fasong(Long MessageId); //根据消息ID查询发送的对象
}