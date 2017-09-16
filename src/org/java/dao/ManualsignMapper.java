package org.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.java.entity.oa.Manualsign;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 签到接口；
 * @author Admin
 *
 */
public interface ManualsignMapper {
    int deleteByPrimaryKey(Long signid);

    int insert(Manualsign record);

    int insertSelective(Manualsign record);

    Manualsign selectByPrimaryKey(Long signid);

    int updateByPrimaryKeySelective(Manualsign record);

    int updateByPrimaryKey(Manualsign record);
    
    //查询所有签到信息方法；
    public List<Manualsign> findAll();  //查询所有对象；
    
    
    //添加对象到签到表方法；
    public void add(Manualsign man);
    
    //定义查询当天考勤的方法；
    public List<Map<String,Object>> searchToday(Map<String, Object> map);
   
    //查询本周考勤
    public List<Map<String,Object>> searchCurWeek();
    
    //查询本月考勤
    public List<Map<String,Object>> searchCurMonth();
    
    //查询本年度考勤
    public List<Map<String,Object>> searchCurYear();
    
    
    
    
}