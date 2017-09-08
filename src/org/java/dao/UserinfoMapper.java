package org.java.dao;

import java.util.Map;

import org.java.entity.oa.Userinfo;

public interface UserinfoMapper {
    int deleteByPrimaryKey(String userid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    
    Map<String, Object> findByUname(Userinfo u);
    
    
    
}