package org.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.java.entity.oa.Manualsign;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ǩ���ӿڣ�
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
    
    //��ѯ����ǩ����Ϣ������
    public List<Manualsign> findAll();  //��ѯ���ж���
    
    
    //��Ӷ���ǩ��������
    public void add(Manualsign man);
    
    //�����ѯ���쿼�ڵķ�����
    public List<Map<String,Object>> searchToday(Map<String, Object> map);
   
    //��ѯ���ܿ���
    public List<Map<String,Object>> searchCurWeek();
    
    //��ѯ���¿���
    public List<Map<String,Object>> searchCurMonth();
    
    //��ѯ����ȿ���
    public List<Map<String,Object>> searchCurYear();
    
    
    
    
}