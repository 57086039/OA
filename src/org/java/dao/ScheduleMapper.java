package org.java.dao;

import org.java.entity.oa.Schedule;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Long scheduleid);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    Schedule selectByPrimaryKey(Long scheduleid);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);
}