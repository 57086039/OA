package org.java.dao;

import java.util.List;

import org.java.entity.oa.Departinfo;
import org.java.entity.oa.Manualsign;

public interface DepartinfoMapper {
    int deleteByPrimaryKey(Long departid);

    int insert(Departinfo record);

    int insertSelective(Departinfo record);

    Departinfo selectByPrimaryKey(Long departid);

    int updateByPrimaryKeySelective(Departinfo record);

    int updateByPrimaryKey(Departinfo record);
    
    
    //��ѯ���в��Ŷ���
    public List<Departinfo> bumen();
    
  
}