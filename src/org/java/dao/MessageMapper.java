package org.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.java.entity.oa.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Long messageid);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Long messageid);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKeyWithBLOBs(Message record);

     int  updateByPrimaryKey(Message record);
    
    List<Message> fingByQuanBu();
     
    List<Map<String, Object>> findByXiaoXi(@Param("kaishi") String kaishi,@Param("jieshu") String jieshu);
}